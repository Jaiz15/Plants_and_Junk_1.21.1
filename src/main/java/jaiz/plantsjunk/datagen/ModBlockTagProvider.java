package jaiz.plantsjunk.datagen;

import jaiz.plantsjunk.block.ModBlocks;
import jaiz.plantsjunk.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.FLOWERS)
                .add(ModBlocks.COLUMBINE)
                .add(ModBlocks.CALLALILY_LILAC)
                .add(ModBlocks.CALLALILY_YELLOW)
                .add(ModBlocks.CALLALILY_PURPLE)
                .add(ModBlocks.CALLALILY_WHITE)
                .add(ModBlocks.CALLALILY_PINK);

        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(ModBlocks.COLUMBINE);

        getOrCreateTagBuilder(BlockTags.REPLACEABLE)
                .add(ModBlocks.COLUMBINE)
                .add(ModBlocks.CALLALILY_LILAC)
                .add(ModBlocks.CALLALILY_YELLOW)
                .add(ModBlocks.CALLALILY_PURPLE)
                .add(ModBlocks.CALLALILY_WHITE)
                .add(ModBlocks.CALLALILY_PINK)
                .add(ModBlocks.SHELF_MUSHROOM_BLOCK)
                .add(ModBlocks.IVY)
                .add(ModBlocks.UNDERGROWTH);

        getOrCreateTagBuilder(BlockTags.REPLACEABLE_BY_TREES)
                .add(ModBlocks.SHELF_MUSHROOM_BLOCK)
                .add(ModBlocks.IVY)
                .add(ModBlocks.UNDERGROWTH);


        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.ROTTEN_LOG)
                .add(ModBlocks.ROTTEN_WOOD)
                .add(ModBlocks.STRIPPED_ROTTEN_LOG)
                .add(ModBlocks.STRIPPED_ROTTEN_WOOD);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.ROTTEN_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.ROTTEN_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.ROTTEN_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.ROTTEN_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.ROTTEN_FENCE);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.ROTTEN_DOOR)
                .add(ModBlocks.ROTTEN_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.ROTTEN_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.ROTTEN_FENCE);

        getOrCreateTagBuilder(BlockTags.DIRT)
                .add(ModBlocks.ROT_BLOCK);
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.ROT_BLOCK);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.ROTTEN_PLANKS)
                .add(ModBlocks.ROTTEN_DOOR)
                .add(ModBlocks.ROTTEN_TRAPDOOR)
                .add(ModBlocks.ROTTEN_FENCE)
                .add(ModBlocks.ROTTEN_FENCE_GATE)
                .add(ModBlocks.ROTTEN_SLAB)
                .add(ModBlocks.ROTTEN_STAIRS)
                .add(ModBlocks.WALL_ROTTEN_SIGN)
                .add(ModBlocks.STANDING_ROTTEN_SIGN)
                .add(ModBlocks.HANGING_ROTTEN_SIGN)
                .add(ModBlocks.WALL_HANGING_ROTTEN_SIGN)
                .add(ModBlocks.ROTTEN_LOG)
                .add(ModBlocks.ROTTEN_WOOD)
                .add(ModBlocks.STRIPPED_ROTTEN_LOG)
                .add(ModBlocks.STRIPPED_ROTTEN_WOOD)
                .add(ModBlocks.SHELF_MUSHROOM_BLOCK);

        getOrCreateTagBuilder(BlockTags.MUSHROOM_GROW_BLOCK)
                .add(ModBlocks.ROTTEN_LOG)
                .add(ModBlocks.ROTTEN_WOOD)
                .add(ModBlocks.STRIPPED_ROTTEN_LOG)
                .add(ModBlocks.STRIPPED_ROTTEN_WOOD);

    }
}
