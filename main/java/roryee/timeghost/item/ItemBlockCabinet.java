package roryee.timeghost.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemMultiTexture;
import roryee.timeghost.block.ModBlocks;
import roryee.timeghost.reference.Names;

/**
 * @author roryee https://github.com/roryee
 */
public class ItemBlockCabinet extends ItemMultiTexture {
    public ItemBlockCabinet(Block block) {
        super(ModBlocks.cabinet, ModBlocks.cabinet, Names.Blocks.CABINET_SUBTYPES);
    }
}
