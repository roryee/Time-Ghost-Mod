package roryee.timeghost.reference;

import net.minecraft.util.ResourceLocation;

import java.util.ResourceBundle;

/**
 * @author roryee https://github.com/roryee
 */
public class Textures {
    public static final String RESOURCE_PREFIX = Reference.MOD_ID.toLowerCase() + ":";

    public static final String MODEL_LOCATION = "textures/models/";

    public static final ResourceLocation TIME_GHOST_MODEL = new ResourceLocation(Reference.MOD_ID, MODEL_LOCATION + "timeghost.png");
    public static final ResourceLocation CABINET_MODEL = new ResourceLocation(Reference.MOD_ID, MODEL_LOCATION + "cabinet.png");

}
