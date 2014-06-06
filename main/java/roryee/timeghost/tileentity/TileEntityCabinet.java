package roryee.timeghost.tileentity;

/**
 * @author roryee https://github.com/roryee
 */
public class TileEntityCabinet extends TileEntityTG {
    private int shelves = 1;

    public TileEntityCabinet() {
        super(1);
        setInventorySize(shelves*shelves);
    }
}
