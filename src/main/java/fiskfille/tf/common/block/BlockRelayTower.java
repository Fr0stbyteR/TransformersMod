package fiskfille.tf.common.block;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import fiskfille.tf.client.gui.GuiHandlerTF.TFGui;
import fiskfille.tf.common.tileentity.TileEntityRelayTower;
import fiskfille.tf.helper.TFTileHelper;

public class BlockRelayTower extends BlockMachineBase
{
    public BlockRelayTower()
    {
        super(Material.rock);
        setHardness(5.0F);
        setResistance(10.0F);
    }
    
    @Override
    public int getBlockHeight()
    {
        return 2;
    }
    
    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public int getRenderType()
    {
        return -1;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public void addCollisionBoxesToList(World world, int x, int y, int z, AxisAlignedBB aabb, List list, Entity entity)
    {
        int metadata = world.getBlockMetadata(x, y, z);
        float f = 0.0625F;
        float width = f * 2;

        if (metadata < 4)
        {
            addBox(width, 0, width, 1 - width, f * 2, 1 - width, x, y, z, aabb, list);
            width = f * 4;
            addBox(width, f * 2, width, 1 - width, f * 14, 1 - width, x, y, z, aabb, list);
            width = f * 5;
            addBox(width, f * 14, width, 1 - width, f * 22, 1 - width, x, y, z, aabb, list);
            width = f * 6;
            addBox(width, f * 22, width, 1 - width, 2, 1 - width, x, y, z, aabb, list);
        }
    }

    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z)
    {
        int metadata = world.getBlockMetadata(x, y, z);
        float f = 0.0625F;
        float width = f * 4;

        if (metadata < 4)
        {
            setBlockBounds(width, 0, width, 1 - width, 2, 1 - width);
        }
        else
        {
            setBlockBounds(width, -1, width, 1 - width, 1, 1 - width);
        }
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
    {
        if (super.onBlockActivated(world, x, y, z, player, side, hitX, hitY, hitZ))
        {
            return true;
        }
        
        if (!player.isSneaking())
        {
            TileEntity tile = TFTileHelper.getTileBase(world.getTileEntity(x, y, z));

            if (tile instanceof TileEntityRelayTower)
            {
                TFGui.RECEIVER_NETWORK.open(player, tile);
            }

            return true;
        }

        return false;
    }
    
    @Override
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon("stone");
    }
}
