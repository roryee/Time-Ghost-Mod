package roryee.timeghost.config;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * @author roryee https://github.com/roryee
 */
public class ConfigHandler {

    public static void init(File file){
        Configuration config = new Configuration(file);

        config.load();

        ConfigItem.ironNuggetEnabled = config.get(ConfigItem.CATEGORY, "Iron nugget enabled", ConfigItem.IRON_NUGGET_ENABLED_DEFAULT).getBoolean(ConfigItem.IRON_NUGGET_ENABLED_DEFAULT);

        ConfigBlock.multiWoodCabinet = config.get(ConfigBlock.CATEGORY, "Mutiple cabinet types based on wood", ConfigBlock.MULTI_WOOD_CABINET_DEFAULT).getBoolean(ConfigBlock.MULTI_WOOD_CABINET_DEFAULT);

        config.save();
    }

}
