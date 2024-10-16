package jaiz.plantsjunk.block;

import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import jaiz.plantsjunk.PlantsJunk;
import jaiz.plantsjunk.block.custom.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final IntProperty SIZE = IntProperty.of("size", 0, 2);

    public static final Block FIREFLY_BOTTLE = registerBlock("firefly_bottle",
            new FireflyBottleBlock(FabricBlockSettings.copyOf(Blocks.GLASS).sounds(BlockSoundGroup.GLASS).luminance(15)));

    public static final Block COCOON_BLOCK = registerBlock("cocoon_block",
            new CocoonBlock(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK).sounds(BlockSoundGroup.HONEY)));

    public static final Block ROT_BLOCK = registerBlock("rot_block",
            new RotBlock(FabricBlockSettings.copyOf(Blocks.DIRT).sounds(BlockSoundGroup.WET_GRASS).ticksRandomly()));

    public static final Block IVY = registerBlock("ivy",
            new IvyBlock(FabricBlockSettings.copyOf(Blocks.VINE).sounds(BlockSoundGroup.VINE).ticksRandomly()));

    public static final Block UNDERGROWTH = registerBlock("undergrowth",
            new UndergrowthBlock(FabricBlockSettings.copyOf(Blocks.MOSS_CARPET).sounds(BlockSoundGroup.WET_GRASS).noCollision().breakInstantly()));


    public static final Block SHELF_MUSHROOM_BLOCK = registerBlock("shelf_mushroom",
            new ShelfMushroomBlock(FabricBlockSettings.copyOf(Blocks.MUSHROOM_STEM).sounds(BlockSoundGroup.SHROOMLIGHT)));

    public static final Block CALLALILY_WHITE = registerBlock("callalily_white",
            new TallFlowerBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CALLALILY_PINK = registerBlock("callalily_pink",
            new TallFlowerBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CALLALILY_YELLOW = registerBlock("callalily_yellow",
            new TallFlowerBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CALLALILY_LILAC = registerBlock("callalily_lilac",
            new TallFlowerBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CALLALILY_PURPLE = registerBlock("callalily_purple",
            new TallFlowerBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block COLUMBINE = registerBlock("columbine",
            new FlowerBlock(StatusEffects.DARKNESS, 60, AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY)));

    //Rotten Wood

    public static final Block ROTTEN_LOG = registerBlock("rotten_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2f).burnable()));

    public static final Block ROTTEN_WOOD = registerBlock("rotten_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2f).burnable()));

    public static final Block STRIPPED_ROTTEN_LOG = registerBlock("stripped_rotten_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2f).burnable()));

    public static final Block STRIPPED_ROTTEN_WOOD = registerBlock("stripped_rotten_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(2f).burnable()));

    public static final Block ROTTEN_PLANKS = registerBlock("rotten_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2f).burnable()));

    public static final Block ROTTEN_BUTTON = registerBlock("rotten_button",
            new ButtonBlock(BlockSetType.OAK, 10, FabricBlockSettings.copyOf(Blocks.OAK_BUTTON).burnable()));
    public static final Block ROTTEN_PRESSURE_PLATE = registerBlock("rotten_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE).burnable()));

    public static final Identifier ROTTEN_SIGN_TEXTURE = Identifier.of(PlantsJunk.MOD_ID, "entity/signs/rotten");
    public static final Identifier ROTTEN_HANGING_SIGN_TEXTURE = Identifier.of(PlantsJunk.MOD_ID, "entity/signs/hanging/rotten");
    public static final Identifier ROTTEN_HANGING_GUI_SIGN_TEXTURE = Identifier.of(PlantsJunk.MOD_ID, "textures/gui/hanging_signs/rotten");

    public static final Block STANDING_ROTTEN_SIGN = Registry.register(Registries.BLOCK, Identifier.of(PlantsJunk.MOD_ID, "rotten_standing_sign"),
            new TerraformSignBlock(ROTTEN_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));

    public static final Block WALL_ROTTEN_SIGN = Registry.register(Registries.BLOCK, Identifier.of(PlantsJunk.MOD_ID, "rotten_wall_sign"),
            new TerraformWallSignBlock(ROTTEN_SIGN_TEXTURE, FabricBlockSettings.copyOf(ModBlocks.STANDING_ROTTEN_SIGN)));

    public static final Block HANGING_ROTTEN_SIGN = Registry.register(Registries.BLOCK, Identifier.of(PlantsJunk.MOD_ID, "rotten_hanging_sign"),
            new TerraformHangingSignBlock(ROTTEN_HANGING_SIGN_TEXTURE, ROTTEN_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN)));

    public static final Block WALL_HANGING_ROTTEN_SIGN = Registry.register(Registries.BLOCK, Identifier.of(PlantsJunk.MOD_ID, "rotten_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(ROTTEN_HANGING_SIGN_TEXTURE, ROTTEN_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(ModBlocks.HANGING_ROTTEN_SIGN)));

    public static final Block ROTTEN_STAIRS = registerBlock("rotten_stairs",
            new StairsBlock(ModBlocks.ROTTEN_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).burnable()));
    public static final Block ROTTEN_SLAB = registerBlock("rotten_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).burnable()));

    public static final Block ROTTEN_FENCE = registerBlock("rotten_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).burnable()));
    public static final Block ROTTEN_FENCE_GATE = registerBlock("rotten_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).burnable()));

    public static final Block ROTTEN_DOOR = registerBlock("rotten_door",
            new DoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque().burnable()));
    public static final Block ROTTEN_TRAPDOOR = registerBlock("rotten_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque().burnable()));



    public static final BlockFamily ROTTEN_FAMILY = BlockFamilies.register(ModBlocks.ROTTEN_PLANKS)
            .sign(ModBlocks.STANDING_ROTTEN_SIGN, ModBlocks.WALL_ROTTEN_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();



    //Main Bits

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(PlantsJunk.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(PlantsJunk.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        PlantsJunk.LOGGER.info("Registering ModBlocks for " + PlantsJunk.MOD_ID);
    }

}
