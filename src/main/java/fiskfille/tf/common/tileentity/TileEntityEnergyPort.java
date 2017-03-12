package fiskfille.tf.common.tileentity;

import org.lwjgl.opengl.GL11;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import net.minecraftforge.common.util.ForgeDirection;
import fiskfille.tf.common.energon.power.IEnergyContainer;
import fiskfille.tf.common.energon.power.IEnergyReceiver;
import fiskfille.tf.common.energon.power.ReceiverHandler;
import fiskfille.tf.helper.TFTileHelper;

public class TileEntityEnergyPort extends TileEntityTF implements IEnergyReceiver
{
    public ReceiverHandler receiverHandler = new ReceiverHandler(this);
    
    public IEnergyContainer getReceiver()
    {
        ForgeDirection dir = ForgeDirection.getOrientation(getBlockMetadata());
        TileEntity tile = TFTileHelper.getTileBase(worldObj.getTileEntity(xCoord + dir.offsetX, yCoord + dir.offsetY, zCoord + dir.offsetZ));
        
        if (tile instanceof IEnergyContainer && !(tile instanceof TileEntityEnergyPort))
        {
            return (IEnergyContainer) tile;
        }
        
        return null;
    }

    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord, yCoord, zCoord, xCoord + 1, yCoord + 1, zCoord + 1);
    }

    @Override
    public void readCustomNBT(NBTTagCompound nbt)
    {
    }

    @Override
    public void writeCustomNBT(NBTTagCompound nbt)
    {
    }

    @Override
    public ReceiverHandler getReceiverHandler()
    {
        return receiverHandler;
    }

    @Override
    public boolean canReceiveEnergy(TileEntity from)
    {
        return true;
    }

    @Override
    public Vec3 getEnergyInputOffset()
    {
        ForgeDirection dir = ForgeDirection.getOrientation(getBlockMetadata());
        float f = 0.0625F * 3.5F;
        
        if (dir == ForgeDirection.UP)
        {
            return Vec3.createVectorHelper(0, 0.5F - f, 0);
        }
        else if (dir == ForgeDirection.DOWN)
        {
            return Vec3.createVectorHelper(0, -0.5F + f, 0);
        }
        
        int[] rotations = {2, 0, 1, 3};
        float yaw = rotations[dir.ordinal() - 2] * 90;
        
        Vec3 vec3 = Vec3.createVectorHelper(0, 0, 0.5F - f);
        vec3.rotateAroundY(-yaw * (float) Math.PI / 180.0F);

        return vec3;
    }

    @Override
    public int getMapColor()
    {
        return 0x547D96;
    }

    @Override
    public float receiveEnergy(float amount, boolean simulate)
    {
        IEnergyContainer container = getReceiver();
        
        if (container != null)
        {
            return container.receiveEnergy(amount, simulate);
        }
        
        return 0;
    }

    @Override
    public float extractEnergy(float amount, boolean simulate)
    {
        IEnergyContainer container = getReceiver();
        
        if (container != null)
        {
            return container.extractEnergy(amount, simulate);
        }
        
        return 0;
    }

    @Override
    public float getEnergy()
    {
        IEnergyContainer container = getReceiver();
        
        if (container != null)
        {
            return container.getEnergy();
        }
        
        return 0;
    }

    @Override
    public float getMaxEnergy()
    {
        IEnergyContainer container = getReceiver();
        
        if (container != null)
        {
            return container.getMaxEnergy();
        }
        
        return 0;
    }

    @Override
    public float setEnergy(float energy)
    {
        IEnergyContainer container = getReceiver();
        
        if (container != null)
        {
            return container.setEnergy(energy);
        }
        
        return 0;
    }

    @Override
    public float getEnergyUsage()
    {
        IEnergyContainer container = getReceiver();
        
        if (container != null)
        {
            return container.getEnergyUsage();
        }
        
        return 0;
    }

    @Override
    public void setEnergyUsage(float usage)
    {
        IEnergyContainer container = getReceiver();
        
        if (container != null)
        {
            container.setEnergyUsage(usage);
        }
    }
}