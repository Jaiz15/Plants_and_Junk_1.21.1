package jaiz.plantsjunk.item;

import jaiz.plantsjunk.PlantsJunk;
import jaiz.plantsjunk.block.ModBlocks;
import jaiz.plantsjunk.entity.ModEntities;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PlantsJunk.MOD_ID, name), item);
    }


    public static final Item SNAIL_SPAWN_EGG = registerItem("snail_spawn_egg", new SpawnEggItem(ModEntities.SNAIL, 0x4F3420, 0xEAE4B0, new Item.Settings()));
    public static final Item CATERPILLAR_SPAWN_EGG = registerItem("caterpillar_spawn_egg", new SpawnEggItem(ModEntities.CATERPILLAR, 0x308723, 0xF0DA1B, new Item.Settings()));
    public static final Item BUTTERFLY_SPAWN_EGG = registerItem("butterfly_spawn_egg", new SpawnEggItem(ModEntities.BUTTERFLY, 0x261007, 0xD56C24, new Item.Settings()));
    public static final Item FIREFLY_SWARM_SPAWN_EGG = registerItem("firefly_swarm_spawn_egg", new SpawnEggItem(ModEntities.FIRE_FLY_SWARM, 0x0E0709, 0x9DFF18, new Item.Settings()));
    public static final Item DRAGONFLY_SPAWN_EGG = registerItem("dragonfly_spawn_egg", new SpawnEggItem(ModEntities.DRAGONFLY, 0x2C0818, 0x658DD3, new Item.Settings()));


    public static final Item ROTTEN_SIGN = registerItem("rotten_sign", new SignItem(new Item.Settings().maxCount(16), ModBlocks.STANDING_ROTTEN_SIGN, ModBlocks.WALL_ROTTEN_SIGN));
    public static final Item HANGING_ROTTEN_SIGN = registerItem("rotten_hanging_sign", new HangingSignItem(ModBlocks.HANGING_ROTTEN_SIGN, ModBlocks.WALL_HANGING_ROTTEN_SIGN, new Item.Settings().maxCount(16)));


    private static void addItemsToIngredientsGroup(FabricItemGroupEntries entries) {
    }

    private static void addItemsToCombatGroup(FabricItemGroupEntries entries) {

    }

    private static void addItemsToEggItemGroup(FabricItemGroupEntries entries) {
        entries.add(CATERPILLAR_SPAWN_EGG);
        entries.add(BUTTERFLY_SPAWN_EGG);
        entries.add(DRAGONFLY_SPAWN_EGG);
        entries.add(FIREFLY_SWARM_SPAWN_EGG);
        entries.add(SNAIL_SPAWN_EGG);
    }

    private static void addItemsToColourBlockGroup(FabricItemGroupEntries entries) {

    }

    private static void addItemsToBuildingBlockGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.FIREFLY_BOTTLE);
        entries.add(ModBlocks.ROTTEN_PLANKS);
        entries.add(ModBlocks.ROTTEN_DOOR);
        entries.add(ModBlocks.ROTTEN_TRAPDOOR);
        entries.add(ModBlocks.ROTTEN_FENCE);
        entries.add(ModBlocks.ROTTEN_FENCE_GATE);
        entries.add(ModBlocks.ROTTEN_SLAB);
        entries.add(ModBlocks.ROTTEN_STAIRS);
        entries.add(ModItems.ROTTEN_SIGN);
        entries.add(ModItems.HANGING_ROTTEN_SIGN);

    }

    private static void addItemsToNaturalBlockGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.ROT_BLOCK);
        entries.add(ModBlocks.ROTTEN_LOG);
        entries.add(ModBlocks.ROTTEN_WOOD);
        entries.add(ModBlocks.STRIPPED_ROTTEN_LOG);
        entries.add(ModBlocks.STRIPPED_ROTTEN_WOOD);
        entries.add(ModBlocks.SHELF_MUSHROOM_BLOCK);
        entries.add(ModBlocks.COCOON_BLOCK);
        entries.add(ModBlocks.COLUMBINE);
        entries.add(ModBlocks.CALLALILY_WHITE);
        entries.add(ModBlocks.CALLALILY_LILAC);
        entries.add(ModBlocks.CALLALILY_PINK);
        entries.add(ModBlocks.CALLALILY_PURPLE);
        entries.add(ModBlocks.CALLALILY_YELLOW);
        entries.add(ModBlocks.IVY);
        entries.add(ModBlocks.UNDERGROWTH);
    }

    private static void addItemsToFunctionalBlockGroup(FabricItemGroupEntries entries) {

    }

    private static void addItemsToToolsGroup(FabricItemGroupEntries entries) {

    }

    // Item group registries

    public static void registerModItems() {
        PlantsJunk.LOGGER.info("Registering Mod Items for " + PlantsJunk.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(ModItems::addItemsToEggItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(ModItems::addItemsToColourBlockGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuildingBlockGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalBlockGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::addItemsToFunctionalBlockGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsGroup);
    }
}
