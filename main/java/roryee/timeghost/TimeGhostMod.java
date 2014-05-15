package roryee.timeghost;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import roryee.timeghost.block.ModBlocks;
import roryee.timeghost.config.ConfigHandler;
import roryee.timeghost.entity.ModEntities;
import roryee.timeghost.item.ModItems;
import roryee.timeghost.network.CommonProxy;
import roryee.timeghost.reference.Reference;

/**
 * @author roryee https://github.com/roryee
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class TimeGhostMod {


    @Instance(Reference.MOD_ID)
    public static TimeGhostMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigHandler.init(event.getSuggestedConfigurationFile());

        ModItems.init();
        ModBlocks.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        proxy.registerTileEntities();
        proxy.registerRenderers();

        ModEntities.init();
        ModItems.registerRecipes();
        ModBlocks.registerRecipes();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
