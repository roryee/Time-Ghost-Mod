package roryee.timeghost.network;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import roryee.timeghost.block.ModBlocks;
import roryee.timeghost.client.renderer.entity.RenderTimeGhost;
import roryee.timeghost.client.renderer.item.ItemCabinetRenderer;
import roryee.timeghost.client.renderer.tileentity.TileEntityCabinetRenderer;
import roryee.timeghost.entity.EntityTimeGhost;
import roryee.timeghost.item.ModItems;
import roryee.timeghost.tileentity.TileEntityCabinet;

/**
 * @author roryee https://github.com/roryee
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void initRenderers(){
        RenderingRegistry.registerEntityRenderingHandler(EntityTimeGhost.class, new RenderTimeGhost());

        TileEntityCabinetRenderer.renderId = RenderingRegistry.getNextAvailableRenderId();

        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.cabinet), new ItemCabinetRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCabinet.class, new TileEntityCabinetRenderer());
    }

}
