package roryee.timeghost.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import roryee.timeghost.item.ItemBlockCabinet;
import roryee.timeghost.reference.Names;
import roryee.timeghost.tileentity.TileEntityCabinet;

/**
 * @author roryee https://github.com/roryee
 */
public class ModBlocks {
    public static BlockCabinet cabinet = new BlockCabinet();

    public static void init() {
        GameRegistry.registerBlock(cabinet, ItemBlockCabinet.class, "tile." + Names.Blocks.CABINET);
    }

    public static void registerRecipes() {
        GameRegistry.addRecipe(new ItemStack(cabinet, 1, 0),
                "PPP",
                "P T",
                "PPP",
                'P', new ItemStack(Blocks.planks, 1, 0),
                'T', new ItemStack(Blocks.trapdoor, 1)
        );
        GameRegistry.addRecipe(new ItemStack(cabinet, 1, 1),
                "PPP",
                "P T",
                "PPP",
                'P', new ItemStack(Blocks.planks, 1, 1),
                'T', new ItemStack(Blocks.trapdoor, 1)
        );
        GameRegistry.addRecipe(new ItemStack(cabinet, 1, 2),
                "PPP",
                "P T",
                "PPP",
                'P', new ItemStack(Blocks.planks, 1, 2),
                'T', new ItemStack(Blocks.trapdoor, 1)
        );
        GameRegistry.addRecipe(new ItemStack(cabinet, 1, 3),
                "PPP",
                "P T",
                "PPP",
                'P', new ItemStack(Blocks.planks, 1, 3),
                'T', new ItemStack(Blocks.trapdoor, 1)
        );
        GameRegistry.addRecipe(new ItemStack(cabinet, 0, 4),
                "PPP",
                "P T",
                "PPP",
                'P', new ItemStack(Blocks.planks, 1, 4),
                'T', new ItemStack(Blocks.trapdoor, 1)
        );
        GameRegistry.addRecipe(new ItemStack(cabinet, 0, 5),
                "PPP",
                "P T",
                "PPP",
                'P', new ItemStack(Blocks.planks, 1, 5),
                'T', new ItemStack(Blocks.trapdoor, 1)
        );

    }
}
