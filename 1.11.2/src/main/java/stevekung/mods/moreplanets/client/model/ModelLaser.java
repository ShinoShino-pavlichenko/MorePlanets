package stevekung.mods.moreplanets.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelLaser extends ModelBase
{
    ModelRenderer laser;

    public ModelLaser()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;

        this.laser = new ModelRenderer(this, 0, 0);
        this.laser.addBox(0F, 0F, 0F, 1, 1, 2, 0F);
        this.laser.setRotationPoint(0F, 0F, 0F);
    }

    public void renderLaser()
    {
        this.laser.render(0.0625F);
    }
}