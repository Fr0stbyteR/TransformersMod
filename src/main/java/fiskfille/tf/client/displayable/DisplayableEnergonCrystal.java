package fiskfille.tf.client.displayable;

import fiskfille.tf.client.model.tileentity.ModelCrystal;
import fiskfille.tf.common.block.BlockEnergonCrystal;
import fiskfille.tf.common.energon.Energon;
import fiskfille.tf.helper.TFHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class DisplayableEnergonCrystal extends Displayable
{
    private ModelCrystal model = new ModelCrystal();

    @Override
    public void render(ItemStack itemstack)
    {
        renderTag("x" + itemstack.stackSize, 0, 0.1F, 0);

        BlockEnergonCrystal block = (BlockEnergonCrystal) Block.getBlockFromItem(itemstack.getItem());
        Energon energon = block.getEnergonType();

        GL11.glPushMatrix();
        float f = 0.75F;
        float f1 = MathHelper.sin(mc.thePlayer.ticksExisted / 15.0F) * 0.07F;
        GL11.glRotatef(mc.thePlayer.ticksExisted * 0.75F, 0.0F, 1.0F, 0.0F);
        GL11.glTranslatef(0, -0.3F + f1, 0);
        GL11.glScalef(f, f, f);

        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

        float[] rgb = TFHelper.hexToRGB(energon.getColor());
        GL11.glColor4f(rgb[0], rgb[1], rgb[2], 0.5F);

        TFHelper.setLighting(61680);
        model.render();
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glPopMatrix();
    }
}