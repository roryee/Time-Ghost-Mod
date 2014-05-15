package roryee.timeghost.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import roryee.timeghost.reference.Names;

/**
 * @author roryee https://github.com/roryee
 */
public class ModItems {
    public static ItemSoupCan soupcan = new ItemSoupCan();
    public static ItemSoupCanEmpty soupcanempty = new ItemSoupCanEmpty();
    public static ItemIronNugget ironnugget = new ItemIronNugget();
    public static ItemTimeGhostSpawner timeGhostSpawner = new ItemTimeGhostSpawner();

    public static void init() {
        GameRegistry.registerItem(soupcan, "item." + Names.Items.SOUP_CAN);
        GameRegistry.registerItem(soupcanempty, "item." + Names.Items.EMPTY_SOUP_CAN);
        GameRegistry.registerItem(ironnugget, "item." + Names.Items.IRON_NUGGET);
        GameRegistry.registerItem(timeGhostSpawner, "item." + Names.Items.TIME_GHOST_SPAWNER);

        OreDictionary.registerOre("nuggetIron", ironnugget);

        registerSmelting(soupcanempty, ironnugget, 3);
    }

    public static void registerRecipes() {
        GameRegistry.addRecipe(new ItemStack(soupcan, 8),
                "SSS",
                "SBS",
                "SSS",
                'S', Items.mushroom_stew,
                'B', Items.bucket
        );

        GameRegistry.addRecipe(new ItemStack(Items.iron_ingot),
                "NNN",
                "NNN",
                "NNN",
                'N', ironnugget
        );
    }

    public static void registerSmelting(Item in, Item out) {
        registerSmelting(in, out, 1);
    }

    public static void registerSmelting(Item in, Item out, int numOut) {
        registerSmelting(in, out, numOut, 0.1f);
    }

    public static void registerSmelting(Item in, Item out, int numOut, float xp) {
        GameRegistry.addSmelting(in, new ItemStack(out, numOut), xp);
    }

}
