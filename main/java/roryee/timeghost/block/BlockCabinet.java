package roryee.timeghost.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import roryee.timeghost.client.renderer.tileentity.TileEntityCabinetRenderer;
import roryee.timeghost.reference.Names;
import roryee.timeghost.tileentity.TileEntityCabinet;

import java.util.List;

/**
 * @author roryee https://github.com/roryee
 */
public class BlockCabinet extends BlockTG implements ITileEntityProvider {

    public BlockCabinet() {
        super(Material.wood);
        setCreativeTab(CreativeTabs.tabDecorations);
        setStepSound(soundTypeWood);
        setBlockName(Names.Blocks.CABINET);
        setHardness(2.0f);
        setResistance(5.0f);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEntityCabinet();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list) {
        for (int meta = 0; meta < Names.Blocks.CABINET_SUBTYPES.length; meta++) {
            list.add(new ItemStack(item, 1, meta));
        }
    }

    @Override
    public int damageDropped(int metaData) {
        return metaData;
    }

    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    public int getRenderType(){
        return TileEntityCabinetRenderer.renderId;
    }

}
