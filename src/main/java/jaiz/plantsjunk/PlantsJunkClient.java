package jaiz.plantsjunk;

import jaiz.plantsjunk.block.ModBlocks;
import jaiz.plantsjunk.entity.ModEntities;
import jaiz.plantsjunk.entity.client.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.util.SpriteIdentifier;

public class PlantsJunkClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FIREFLY_BOTTLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COLUMBINE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ROTTEN_LOG, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.IVY, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.UNDERGROWTH, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CALLALILY_WHITE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CALLALILY_LILAC, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CALLALILY_PINK, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CALLALILY_PURPLE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CALLALILY_YELLOW, RenderLayer.getCutout());

		EntityRendererRegistry.register(ModEntities.BUTTERFLY, ButterflyRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(ModModelLayers.BUTTERFLY, Butterfly::getTexturedModelData);

		EntityRendererRegistry.register(ModEntities.CATERPILLAR, CaterpillarRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(ModModelLayers.CATERPILLAR, Caterpillar::getTexturedModelData);

		EntityRendererRegistry.register(ModEntities.DRAGONFLY, DragonflyRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(ModModelLayers.DRAGONFLY, DragonFly::getTexturedModelData);

		EntityRendererRegistry.register(ModEntities.FIRE_FLY_SWARM, FireflyRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(ModModelLayers.FIRE_FLY_SWARM, Fireflies::getTexturedModelData);

		EntityRendererRegistry.register(ModEntities.SNAIL, SnailRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(ModModelLayers.SNAIL, Snail::getTexturedModelData);

	}
}