package jaiz.plantsjunk.entity;

import jaiz.plantsjunk.PlantsJunk;
import jaiz.plantsjunk.entity.custom.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<ButterflyEntity> BUTTERFLY = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(PlantsJunk.MOD_ID, "butterfly"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ButterflyEntity::new).dimensions(EntityDimensions.fixed(0.6f, 0.6f)).build());

    public static final EntityType<FireFlySwarmEntity> FIRE_FLY_SWARM = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(PlantsJunk.MOD_ID, "fire_fly_swarm"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, FireFlySwarmEntity::new).dimensions(EntityDimensions.fixed(1.0f, 1.0f)).build());

    public static final EntityType<DragonflyEntity> DRAGONFLY = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(PlantsJunk.MOD_ID, "dragonfly"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, DragonflyEntity::new).dimensions(EntityDimensions.fixed(0.7f, 0.7f)).build());

    public static final EntityType<CaterpillarEntity> CATERPILLAR = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(PlantsJunk.MOD_ID, "caterpillar"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CaterpillarEntity::new).dimensions(EntityDimensions.fixed(0.6f, 0.4f)).build());

    public static final EntityType<SnailEntity> SNAIL = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(PlantsJunk.MOD_ID, "snail"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SnailEntity::new).dimensions(EntityDimensions.fixed(.4f, .4f)).build());


}
