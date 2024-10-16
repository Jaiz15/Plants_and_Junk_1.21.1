package jaiz.plantsjunk.datagen;


import jaiz.plantsjunk.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.ROTTEN_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.ROTTEN_LOG.asItem())
                .add(ModBlocks.ROTTEN_WOOD.asItem())
                .add(ModBlocks.STRIPPED_ROTTEN_LOG.asItem())
                .add(ModBlocks.STRIPPED_ROTTEN_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.FLOWERS)
                .add(ModBlocks.COLUMBINE.asItem())
                .add(ModBlocks.CALLALILY_LILAC.asItem())
                .add(ModBlocks.CALLALILY_YELLOW.asItem())
                .add(ModBlocks.CALLALILY_PURPLE.asItem())
                .add(ModBlocks.CALLALILY_WHITE.asItem())
                .add(ModBlocks.CALLALILY_PINK.asItem());


    }


}
