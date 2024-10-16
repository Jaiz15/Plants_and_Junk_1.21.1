package jaiz.plantsjunk;

import jaiz.plantsjunk.block.ModBlocks;
import jaiz.plantsjunk.entity.ModEntities;
import jaiz.plantsjunk.entity.custom.*;
import jaiz.plantsjunk.item.ModItems;
import jaiz.plantsjunk.world.gen.ModTreeDecorator;
import jaiz.plantsjunk.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlantsJunk implements ModInitializer {

	public static final String MOD_ID = "plantsjunk";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();

		ModItems.registerModItems();

		ModWorldGeneration.generateModWorldGen();

		ModTreeDecorator.register();

		//Burnables
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.ROTTEN_LOG, 6, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.STRIPPED_ROTTEN_LOG, 6, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.STRIPPED_ROTTEN_WOOD, 6, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.ROTTEN_WOOD, 6, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.ROTTEN_PLANKS, 6, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.ROTTEN_SLAB, 6, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.ROTTEN_STAIRS, 6, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.ROTTEN_FENCE, 6, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.ROTTEN_FENCE_GATE, 6, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.ROTTEN_TRAPDOOR, 6, 10);
		FlammableBlockRegistry.getDefaultInstance()
				.add(ModBlocks.ROTTEN_DOOR, 6, 10);


		FabricDefaultAttributeRegistry.register(ModEntities.CATERPILLAR, CaterpillarEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.SNAIL, SnailEntity.createSnailAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.BUTTERFLY, ButterflyEntity.createButterflyAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.DRAGONFLY, DragonflyEntity.createDragonflyAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.FIRE_FLY_SWARM, FireFlySwarmEntity.createFireflyAttributes());

		StrippableBlockRegistry.register(ModBlocks.ROTTEN_LOG, ModBlocks.STRIPPED_ROTTEN_LOG);
		StrippableBlockRegistry.register(ModBlocks.ROTTEN_WOOD, ModBlocks.STRIPPED_ROTTEN_WOOD);

	}
}