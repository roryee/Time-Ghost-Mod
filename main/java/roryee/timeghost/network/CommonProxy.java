package roryee.timeghost.network;

import cpw.mods.fml.common.registry.GameRegistry;
import roryee.timeghost.reference.Names;
import roryee.timeghost.tileentity.TileEntityCabinet;

/**
 * @author roryee https://github.com/roryee
 */
public class CommonProxy {
    public void initRenderers(){

    }

    public void registerTileEntities(){
        GameRegistry.registerTileEntity(TileEntityCabinet.class, "tile." + Names.TileEntities.CABINET);
    }
}
