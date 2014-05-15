package roryee.timeghost.entity;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

/**
 * @author roryee https://github.com/roryee
 */
public class EntityTG extends Entity {

    public EntityTG(World world) {
        super(world);
    }

    @Override
    public AxisAlignedBB getBoundingBox() {
        return boundingBox;
    }

    @Override
    public AxisAlignedBB getCollisionBox(Entity entity) {
        if (entity != riddenByEntity) {
            return entity.getBoundingBox();
        }
        return null;
    }

    @Override
    public boolean canBeCollidedWith() {
        return !isDead;
    }

    @Override
    protected void entityInit() {

    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound var1) {

    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound var1) {

    }
}
