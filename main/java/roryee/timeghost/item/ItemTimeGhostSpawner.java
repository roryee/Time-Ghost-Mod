package roryee.timeghost.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import roryee.timeghost.entity.EntityTimeGhost;
import roryee.timeghost.reference.Names;

/**
 * @author roryee https://github.com/roryee
 */
public class ItemTimeGhostSpawner extends ItemTG {
    public ItemTimeGhostSpawner(){
        setUnlocalizedName(Names.Items.TIME_GHOST_SPAWNER);
        setCreativeTab(CreativeTabs.tabMisc);
    }

    @Override
    public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ){
        if(!world.isRemote && player.isSneaking()){
            EntityTimeGhost timeGhost = new EntityTimeGhost(world, x + 0.5, y + 1.5, z + 0.5);

            world.spawnEntityInWorld(timeGhost);

            return true;
        }
        return false;
    }
}
