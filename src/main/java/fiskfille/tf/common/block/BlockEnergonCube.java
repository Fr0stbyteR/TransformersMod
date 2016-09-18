package fiskfille.tf.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fiskfille.tf.common.energon.Energon;
import fiskfille.tf.common.energon.IEnergon;

public class BlockEnergonCube extends BlockBasic implements IEnergon
{
	private Energon energonType;
	
    public BlockEnergonCube(Energon type)
    {
        super(Material.glass);
        energonType = type;
        
        setHarvestLvl("pickaxe", 1);
        setStepSound(Block.soundTypeGlass);
        setHardness(6.0F);
        setResistance(10.0F);
        setLightLevel(0.75F);
    }
    
    public Energon getEnergonType()
    {
        return energonType;
    }

    public int getMass()
    {
        return 1296;
    }

    protected boolean canSilkHarvest()
    {
        return true;
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side)
    {
        return shouldRenderSide(world, x, y, z, 1 - side);
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 1;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldRenderSide(IBlockAccess world, int x, int y, int z, int side)
    {
        Block block = world.getBlock(x, y, z);

        return block == this ? false : super.shouldSideBeRendered(world, x, y, z, side);
    }
}
