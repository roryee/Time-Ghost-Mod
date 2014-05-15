package roryee.timeghost.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import roryee.timeghost.reference.Textures;
import roryee.timeghost.tileentity.TileEntityTG;

/**
 * @author roryee https://github.com/roryee
 */
public class BlockTG extends Block{

    public BlockTG(Material material) {
        super(material);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocName){
        return unlocName.substring(unlocName.indexOf(".") + 1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register){
        blockIcon = register.registerIcon(getTextureName());
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack){
        if(world.getTileEntity(x, y, z) instanceof TileEntityTG){
            int direction = 0;
            int facing = MathHelper.floor_double(entity.rotationYaw * 4.0f/360.0f + 0.5d) & 3;

            if(facing == 0){
                direction = ForgeDirection.NORTH.ordinal();
            } else if(facing == 1){
                direction = ForgeDirection.EAST.ordinal();
            } else if(facing == 2){
                direction = ForgeDirection.SOUTH.ordinal();
            } else if(facing == 3){
                direction = ForgeDirection.WEST.ordinal();
            }

            ((TileEntityTG) world.getTileEntity(x, y, z)).setOrientation(direction);
        }
    }
}
