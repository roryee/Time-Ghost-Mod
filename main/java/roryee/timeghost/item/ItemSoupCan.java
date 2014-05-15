package roryee.timeghost.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import roryee.timeghost.reference.Names;

/**
 * @author roryee https://github.com/roryee
 */
public class ItemSoupCan extends ItemFood {

    public ItemSoupCan() {
        super(8, 1.0f, false);
        setUnlocalizedName(Names.Items.SOUP_CAN);
        setCreativeTab(CreativeTabs.tabFood);
    }

    public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        super.onEaten(par1ItemStack, par2World, par3EntityPlayer);
        return new ItemStack(ModItems.soupcanempty);
    }

}
