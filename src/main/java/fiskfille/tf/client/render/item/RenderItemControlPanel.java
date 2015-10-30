package fiskfille.tf.client.render.item;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import fiskfille.tf.common.tileentity.TileEntityControlPanel;

public class RenderItemControlPanel implements IItemRenderer
{
    public boolean handleRenderType(ItemStack item, ItemRenderType type)
    {
        return true;
    }

    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
    {
        return true;
    }

    public void renderItem(ItemRenderType type, ItemStack item, Object... data)
    {
        float scale = 0.6F;
        GL11.glScalef(scale, scale, scale);

        if (type == type.ENTITY || type == type.INVENTORY)
        {
            TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntityControlPanel(), 0.0F, -0.5F, -0.5F, 0.0F);
        }
        if (type == type.EQUIPPED)
        {
            TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntityControlPanel(), 0.7F, 0.3F, 0.6F, 0.0F);
        }
        if (type == type.EQUIPPED_FIRST_PERSON || type == type.FIRST_PERSON_MAP)
        {
        	TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntityControlPanel(), 0.5F, 0.75F, 0.5F, 0.0F);
        }
    }
}
