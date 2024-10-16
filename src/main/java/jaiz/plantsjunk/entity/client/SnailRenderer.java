package jaiz.plantsjunk.entity.client;


import jaiz.plantsjunk.PlantsJunk;
import jaiz.plantsjunk.entity.custom.SnailEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class SnailRenderer extends MobEntityRenderer<SnailEntity, Snail<SnailEntity>> {
    private static final Identifier TEXTURE = Identifier.of(PlantsJunk.MOD_ID, "textures/entity/snail.png");

    public SnailRenderer(EntityRendererFactory.Context context) {
        super(context, new Snail<>(context.getPart(ModModelLayers.SNAIL)), 0f);
    }

    @Override
    public Identifier getTexture(SnailEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(SnailEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
