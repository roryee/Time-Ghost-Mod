package roryee.timeghost.client.renderer.tileentity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import org.lwjgl.opengl.GL11;
import roryee.timeghost.client.renderer.model.ModelCabinet;
import roryee.timeghost.reference.Textures;
import roryee.timeghost.tileentity.TileEntityCabinet;

/**
 * @author roryee https://github.com/roryee
 */
public class TileEntityCabinetRenderer extends TileEntitySpecialRenderer {
    public static int renderId;
    private final ModelCabinet model = new ModelCabinet();

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float renderTick) {
        if(tileEntity instanceof TileEntityCabinet){
            TileEntityCabinet tileEntityCabinet = (TileEntityCabinet) tileEntity;

            ForgeDirection orientation = null;

            if(tileEntityCabinet.getWorldObj() != null){
                orientation = tileEntityCabinet.getOrientation();
            }

            bindTexture(Textures.CABINET_MODEL);

            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glPushMatrix();
            GL11.glTranslated(x + 0.5d, y + 1.5d, z + 0.5d);
            rotateTileEntityForOrientation(x, y, z, orientation);
            GL11.glRotatef(180f, 0f, 0f, 1f);
            model.renderAll();
            GL11.glPopMatrix();
            GL11.glEnable(GL11.GL_CULL_FACE);
        }
    }

    private void rotateTileEntityForOrientation(double x, double y, double z, ForgeDirection orientation) {
        if(orientation == ForgeDirection.NORTH){
            GL11.glRotatef(0f, 0f, 1f, 0f);
        }else if (orientation == ForgeDirection.EAST){
            GL11.glRotatef(270f, 0f, 1f, 0f);
        }else if(orientation == ForgeDirection.SOUTH){
            GL11.glRotatef(180f, 0f, 1f, 0f);
        }else if(orientation == ForgeDirection.WEST){
            GL11.glRotatef(90f, 0f, 1f, 0f);
        }
    }
}
