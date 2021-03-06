package fiskfille.tf.common.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fiskfille.tf.common.tileentity.TileEntityAlloyCrucible;

public class ContainerAlloyCrucible extends ContainerBasic
{
    private int lastSmeltTime;

    public ContainerAlloyCrucible(InventoryPlayer inventoryPlayer, TileEntityAlloyCrucible tile)
    {
        super(tile);

        for (int i = 0; i < tile.getSizeInventory() - 1; ++i)
        {
            addSlotToContainer(new Slot(tile, i, 73, 19 + i * 18));
        }

        addSlotToContainer(new SlotAlloyCrucible(inventoryPlayer.player, tile, 3, 107, 28));
        addPlayerInventory(inventoryPlayer, 4);
    }

    @Override
    public TileEntityAlloyCrucible getTile()
    {
        return (TileEntityAlloyCrucible) super.getTile();
    }

    @Override
    public void addCraftingToCrafters(ICrafting icrafting)
    {
        super.addCraftingToCrafters(icrafting);
        icrafting.sendProgressBarUpdate(this, 0, getTile().smeltTime);
    }

    @Override
    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();

        for (int i = 0; i < crafters.size(); ++i)
        {
            ICrafting icrafting = (ICrafting) crafters.get(i);

            if (lastSmeltTime != getTile().smeltTime)
            {
                icrafting.sendProgressBarUpdate(this, 0, getTile().smeltTime);
            }
        }

        lastSmeltTime = getTile().smeltTime;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int id, int value)
    {
        if (id == 0)
        {
            getTile().smeltTime = value;
        }
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int slotId)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot) inventorySlots.get(slotId);
        int OUTPUT = 3;

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (slotId == OUTPUT)
            {
                if (!mergeItemStack(itemstack1, OUTPUT + 1, OUTPUT + 36 + 1, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (slotId > OUTPUT)
            {
                if (itemstack != null && itemstack.getTagCompound() == itemstack1.getTagCompound() && itemstack.getItemDamage() == itemstack1.getItemDamage() && itemstack.getItem() == itemstack1.getItem())
                {
                    if (!mergeItemStack(itemstack1, 0, OUTPUT, false))
                    {
                        return null;
                    }
                }
                else if (slotId >= OUTPUT + 1 && slotId < OUTPUT + 28)
                {
                    if (!mergeItemStack(itemstack1, OUTPUT + 28, OUTPUT + 37, false))
                    {
                        return null;
                    }
                }
                else if (slotId >= OUTPUT + 28 && slotId < OUTPUT + 37 && !mergeItemStack(itemstack1, OUTPUT + 1, OUTPUT + 28, false))
                {
                    return null;
                }
            }
            else if (!mergeItemStack(itemstack1, OUTPUT + 1, OUTPUT + 37, false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack(null);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize)
            {
                return null;
            }

            slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
        }

        return itemstack;
    }
}
