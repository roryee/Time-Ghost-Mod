package roryee.timeghost.client.renderer.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import roryee.timeghost.client.renderer.model.ModelTimeGhost;
import roryee.timeghost.entity.EntityTimeGhost;
import roryee.timeghost.reference.Reference;

@SideOnly(Side.CLIENT)
public class RenderTimeGhost extends Render {
    private static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID, "textures/models/spaceship.png");

    protected ModelTimeGhost model;

    public RenderTimeGhost() {
        shadowSize = 0.5f;
        model = new ModelTimeGhost();
    }

    public void renderModel(EntityTimeGhost spaceship, double x, double y, double z, float yaw, float partialTickTime)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x, (float)y, (float)z);
        GL11.glRotatef(180.0F - yaw, 0.0F, 1.0F, 0.0F);
        GL11.glScalef(-1.0F, -1.0F, 1.0F);


        bindEntityTexture(spaceship);

        model.render(spaceship, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);

        GL11.glPopMatrix();
    }

    @Override
    public void doRender(Entity entity, double x, double y, double z, float yaw, float partialTickTime){
        this.renderModel((EntityTimeGhost)entity, x, y, z, yaw, partialTickTime);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
        return texture;
    }
}
