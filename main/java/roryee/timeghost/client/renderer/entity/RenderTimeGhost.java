package roryee.timeghost.client.renderer.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import roryee.timeghost.client.renderer.model.ModelTimeGhost;
import roryee.timeghost.entity.EntityTimeGhost;
import roryee.timeghost.reference.Reference;
import roryee.timeghost.reference.Textures;

@SideOnly(Side.CLIENT)
public class RenderTimeGhost extends Render {
    private static final ResourceLocation texture = Textures.TIME_GHOST_MODEL;

    protected ModelTimeGhost model;

    public RenderTimeGhost() {
        model = new ModelTimeGhost();
    }

    public void renderModel(EntityTimeGhost timeghost, double x, double y, double z, float yaw, float partialTickTime) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float) x, (float) y, (float) z);
        GL11.glRotatef(0.0f - yaw, 0.0f, 1.0f, 0.0f);
        GL11.glScalef(-1.0f, -1.0f, 1.3f);

        bindEntityTexture(timeghost);

        model.render(timeghost, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);

        GL11.glPopMatrix();
    }

    @Override
    public void doRender(Entity entity, double x, double y, double z, float yaw, float partialTickTime) {
        this.renderModel((EntityTimeGhost) entity, x, y, z, yaw, partialTickTime);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
        return texture;
    }
}
