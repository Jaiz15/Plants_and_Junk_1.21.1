package jaiz.plantsjunk.entity.client;

import com.google.common.collect.Maps;
import jaiz.plantsjunk.PlantsJunk;
import jaiz.plantsjunk.entity.custom.ButterflyEntity;
import jaiz.plantsjunk.entity.custom.DragonflyEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class DragonflyRenderer extends MobEntityRenderer<DragonflyEntity, DragonFly<DragonflyEntity>> {


    public static final Map<DragonflyVariant, Identifier> DRAGONFLY_VARIANT =
            Util.make(Maps.newEnumMap(DragonflyVariant.class), (map) -> {
                map.put(DragonflyVariant.AQUA_YELLOW, Identifier.of(PlantsJunk.MOD_ID, "textures/entity/dragonfly/dragonfly_aqua_2.png"));
                map.put(DragonflyVariant.AQUA, Identifier.of(PlantsJunk.MOD_ID, "textures/entity/dragonfly/dragonfly.png"));
                map.put(DragonflyVariant.GRAY, Identifier.of(PlantsJunk.MOD_ID, "textures/entity/dragonfly/dragonfly_grey.png"));
                map.put(DragonflyVariant.BLUE, Identifier.of(PlantsJunk.MOD_ID, "textures/entity/dragonfly/dragonfly_blue.png"));
                map.put(DragonflyVariant.ORANGE, Identifier.of(PlantsJunk.MOD_ID, "textures/entity/dragonfly/dragonfly_orange.png"));
                map.put(DragonflyVariant.RED, Identifier.of(PlantsJunk.MOD_ID, "textures/entity/dragonfly/dragonfly_red_2.png"));
                map.put(DragonflyVariant.RED_GREEN, Identifier.of(PlantsJunk.MOD_ID, "textures/entity/dragonfly/dragonfly_red.png"));
            });

    public DragonflyRenderer(EntityRendererFactory.Context context) {
        super(context, new DragonFly<>(context.getPart(ModModelLayers.DRAGONFLY)), 0.45f);
    }

    @Override
    public Identifier getTexture(DragonflyEntity instance) {
        return DRAGONFLY_VARIANT.get(instance.getVariant());

    }

    @Override
    public void render(DragonflyEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
