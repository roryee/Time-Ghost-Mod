package roryee.timeghost.network;

import cpw.mods.fml.client.registry.RenderingRegistry;
import roryee.timeghost.client.renderer.entity.RenderTimeGhost;
import roryee.timeghost.entity.EntityTimeGhost;

/**
 * @author roryee https://github.com/roryee
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenderers(){
        RenderingRegistry.registerEntityRenderingHandler(EntityTimeGhost.class, new RenderTimeGhost());
    }

}
