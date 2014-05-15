package roryee.timeghost.tileentity;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import roryee.timeghost.reference.Names;

/**
 * @author roryee https://github.com/roryee
 */
public class TileEntityTG extends TileEntity {
    protected ForgeDirection orientation;
    protected ItemStack[] inventory;

    public TileEntityTG(int invSize) {
        orientation = ForgeDirection.SOUTH;
        inventory = new ItemStack[invSize];
    }

    public ForgeDirection getOrientation() {
        return orientation;
    }

    public void setOrientation(ForgeDirection orientation){
        this.orientation = orientation;
    }

    public void setOrientation(int orientation) {
        this.orientation = ForgeDirection.getOrientation(orientation);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound){
        super.readFromNBT(compound);

        if(compound.hasKey(Names.NBT.ORIENTATION)){
            this.orientation = ForgeDirection.getOrientation(compound.getByte(Names.NBT.ORIENTATION));
        }

    }

    @Override
    public void writeToNBT(NBTTagCompound compound){
        super.writeToNBT(compound);

        compound.setByte(Names.NBT.ORIENTATION, (byte)orientation.ordinal());
    }
}
