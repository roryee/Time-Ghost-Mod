package roryee.timeghost.entity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

/**
 * @author roryee https://github.com/roryee
 */
public class EntityTimeGhost extends EntityTG {
    private double targetY = 0;
    private double startY = 0;

    public EntityTimeGhost(World world) {
        super(world);
        setSize(0.7f, 0.7f);
    }

    public EntityTimeGhost(World world, double x, double y, double z) {
        this(world);
        posX = x;
        posY = startY = y;
        posZ = z;
    }

    @Override
    public boolean interactFirst(EntityPlayer player) {
        if (!worldObj.isRemote && riddenByEntity == null) {
            player.mountEntity(this);
            return true;
        }
        return false;
    }

    @Override
    public double getMountedYOffset() {
        return -0.15;
    }

    @Override
    public void onUpdate() {
        super.onUpdate();

        /*if (!worldObj.isRemote) {
            if (targetY == 0 || Math.abs(posY - targetY) <= 0.25) {
                targetY = startY + worldObj.rand.nextDouble() * 5;
            }

            if (posY < targetY) {
                motionY = 0.05;
            } else {
                motionY = -0.05;
            }
        }

        setPosition(posX + motionX, posY + motionY, posZ + motionZ);*/
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound compound) {
        startY = compound.getShort("Start");
        targetY = compound.getShort("Target");
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound compound) {
        compound.setShort("Start", (short) startY);
        compound.setShort("Target", (short) targetY);
    }

}
