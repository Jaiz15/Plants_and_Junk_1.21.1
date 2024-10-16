package jaiz.plantsjunk.world.gen;

import jaiz.plantsjunk.entity.ModEntities;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;

public class ModEntitySpawn {
    public static void addEntitySpawn() {

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.FOREST), SpawnGroup.CREATURE,
                ModEntities.BUTTERFLY, 10, 1, 2);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST), SpawnGroup.CREATURE,
                ModEntities.BUTTERFLY, 10, 1, 2);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.SUNFLOWER_PLAINS), SpawnGroup.CREATURE,
                ModEntities.BUTTERFLY, 10, 1, 2);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.TAIGA), SpawnGroup.CREATURE,
                ModEntities.BUTTERFLY, 10, 1, 2);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_PINE_TAIGA), SpawnGroup.CREATURE,
                ModEntities.BUTTERFLY, 10, 1, 2);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA), SpawnGroup.CREATURE,
                ModEntities.BUTTERFLY, 10, 1, 2);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.BIRCH_FOREST), SpawnGroup.CREATURE,
                ModEntities.BUTTERFLY, 10, 1, 2);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_BIRCH_FOREST), SpawnGroup.CREATURE,
                ModEntities.BUTTERFLY, 10, 1, 2);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.CHERRY_GROVE), SpawnGroup.CREATURE,
                ModEntities.BUTTERFLY, 10, 1, 2);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.MEADOW), SpawnGroup.CREATURE,
                ModEntities.BUTTERFLY, 10, 1, 2);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.RIVER), SpawnGroup.CREATURE,
                ModEntities.DRAGONFLY, 10, 1, 2);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.SWAMP), SpawnGroup.CREATURE,
                ModEntities.DRAGONFLY, 10, 1, 2);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.MANGROVE_SWAMP), SpawnGroup.CREATURE,
                ModEntities.DRAGONFLY, 10, 1, 2);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.BEACH), SpawnGroup.CREATURE,
                ModEntities.DRAGONFLY, 10, 1, 2);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.SWAMP), SpawnGroup.CREATURE,
                ModEntities.FIRE_FLY_SWARM, 10, 1, 3);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA), SpawnGroup.CREATURE,
                ModEntities.FIRE_FLY_SWARM, 10, 1, 3);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_PINE_TAIGA), SpawnGroup.CREATURE,
                ModEntities.FIRE_FLY_SWARM, 10, 1, 3);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_BIRCH_FOREST), SpawnGroup.CREATURE,
                ModEntities.FIRE_FLY_SWARM, 10, 1, 3);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.MANGROVE_SWAMP), SpawnGroup.CREATURE,
                ModEntities.FIRE_FLY_SWARM, 10, 1, 3);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.RIVER), SpawnGroup.CREATURE,
                ModEntities.FIRE_FLY_SWARM, 10, 1, 3);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.CHERRY_GROVE), SpawnGroup.CREATURE,
                ModEntities.FIRE_FLY_SWARM, 10, 1, 3);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.TAIGA), SpawnGroup.CREATURE,
                ModEntities.FIRE_FLY_SWARM, 10, 1, 3);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.SAVANNA), SpawnGroup.CREATURE,
                ModEntities.FIRE_FLY_SWARM, 10, 1, 3);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST), SpawnGroup.CREATURE,
                ModEntities.FIRE_FLY_SWARM, 10, 1, 3);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST), SpawnGroup.CREATURE,
                ModEntities.CATERPILLAR, 10, 1, 2);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.FOREST), SpawnGroup.CREATURE,
                ModEntities.CATERPILLAR, 10, 1, 2);

        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.SWAMP), SpawnGroup.CREATURE,
                ModEntities.SNAIL, 20, 1, 2);
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.MANGROVE_SWAMP), SpawnGroup.CREATURE,
                ModEntities.SNAIL, 20, 1, 2);


        // Spawn Restrictors

        SpawnRestriction.register(ModEntities.BUTTERFLY, SpawnRestriction.getLocation(ModEntities.BUTTERFLY), Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);
        SpawnRestriction.register(ModEntities.CATERPILLAR, SpawnRestriction.getLocation(ModEntities.CATERPILLAR), Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);
        SpawnRestriction.register(ModEntities.FIRE_FLY_SWARM, SpawnRestriction.getLocation(ModEntities.FIRE_FLY_SWARM), Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);
        SpawnRestriction.register(ModEntities.DRAGONFLY, SpawnRestriction.getLocation(ModEntities.DRAGONFLY), Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);
        SpawnRestriction.register(ModEntities.SNAIL, SpawnRestriction.getLocation(ModEntities.SNAIL), Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);
    }
}
