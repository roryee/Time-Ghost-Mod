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
import roryee.timeghost.reference.Names;
import roryee.timeghost.tileentity.TileEntityCabinet;

import java.util.List;

/**
 * @author roryee https://github.com/roryee
 */
public class BlockCabinet extends BlockTG implements ITileEntityProvider {
    @SideOnly(Side.CLIENT)
    IIcon[] topIcon, sideIcon;

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
    public BlockCabinet setBlockName(String name) {
        super.setBlockName(name);
        return this;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        topIcon = new IIcon[Names.Blocks.CABINET_SUBTYPES.length];
        sideIcon = new IIcon[Names.Blocks.CABINET_SUBTYPES.length];

        for (int i = 0; i < Names.Blocks.CABINET_SUBTYPES.length; i++) {
            topIcon[i] = register.registerIcon(String.format("%s.%s_top", getUnwrappedUnlocalizedName(getUnlocalizedName()), Names.Blocks.CABINET_SUBTYPES[i]));
            sideIcon[i] = register.registerIcon(String.format("%s.%s_side", getUnwrappedUnlocalizedName(getUnlocalizedName()), Names.Blocks.CABINET_SUBTYPES[i]));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        meta = MathHelper.clamp_int(meta, 0, Names.Blocks.CABINET_SUBTYPES.length - 1);

        if (ForgeDirection.getOrientation(side) == ForgeDirection.UP ||
                ForgeDirection.getOrientation(side) == ForgeDirection.DOWN) {
            return topIcon[meta];
        } else {
            return sideIcon[meta];
        }
    }
}
