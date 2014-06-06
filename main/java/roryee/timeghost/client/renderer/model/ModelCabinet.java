package roryee.timeghost.client.renderer.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelCabinet extends ModelBase {
    public ModelRenderer Front;
    public ModelRenderer Body;

    public ModelCabinet() {
        textureWidth = 64;
        textureHeight = 64;

        setTextureOffset("Front.Shape1", 0, 32);
        setTextureOffset("Front.Shape2", 0, 32);
        setTextureOffset("Front.Shape3", 0, 32);
        setTextureOffset("Front.Shape4", 0, 32);
        setTextureOffset("Front.Shape5", 0, 32);
        setTextureOffset("Front.Shape6", 0, 32);

        setTextureOffset("Body.Top", 0, 32);
        setTextureOffset("Body.Back", 0, 32);
        setTextureOffset("Body.Bottom", 0, 32);
        setTextureOffset("Body.Side1", 0, 32);
        setTextureOffset("Body.Side2", 0, 32);

        Front = new ModelRenderer(this, "Front");
        Front.setRotationPoint(0F, 0F, -7F);
        Front.mirror = true;
        Front.addBox("Shape1", -6F, 0F, 0F, 1, 16, 1);
        Front.addBox("Shape2", 7F, 0F, 0F, 1, 16, 1);
        Front.addBox("Shape3", -5F, 15F, 0F, 12, 1, 1);
        Front.addBox("Shape4", 0F, 1F, 0F, 2, 14, 1);
        Front.addBox("Shape5", -5F, 0F, 0F, 12, 1, 1);
        Front.addBox("Shape6", -5F, 7F, 0F, 12, 2, 1);

        Body = new ModelRenderer(this, "Body");
        Body.setRotationPoint(0F, 0F, 0F);
        Body.mirror = true;
        Body.addBox("Top", -6F, 0F, -6F, 14, 1, 13);
        Body.addBox("Back", -6F, 0F, 7F, 14, 16, 1);
        Body.addBox("Bottom", -6F, 15F, -6F, 14, 1, 13);
        Body.addBox("Side1", 7F, 1F, -6F, 1, 14, 13);
        Body.addBox("Side2", -6F, 1F, -6F, 1, 14, 13);
    }

    public void renderAll() {
        Front.render(1f);
        Body.render(1f);
    }

}
