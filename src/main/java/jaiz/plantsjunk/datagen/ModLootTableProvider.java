package jaiz.plantsjunk.datagen;

import jaiz.plantsjunk.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;

import javax.swing.*;
import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {


    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SHELF_MUSHROOM_BLOCK);
        addDrop(ModBlocks.COLUMBINE);
        addDrop(ModBlocks.COCOON_BLOCK);

        addDrop(ModBlocks.ROTTEN_WOOD);
        addDrop(ModBlocks.STRIPPED_ROTTEN_WOOD);
        addDrop(ModBlocks.ROTTEN_LOG);
        addDrop(ModBlocks.STRIPPED_ROTTEN_LOG);
        addDrop(ModBlocks.ROTTEN_PLANKS);
        addDrop(ModBlocks.ROTTEN_BUTTON);
        addDrop(ModBlocks.ROTTEN_PRESSURE_PLATE);
        addDrop(ModBlocks.ROT_BLOCK);

        addDrop(ModBlocks.HANGING_ROTTEN_SIGN);
        addDrop(ModBlocks.WALL_HANGING_ROTTEN_SIGN);
        addDrop(ModBlocks.STANDING_ROTTEN_SIGN);
        addDrop(ModBlocks.WALL_ROTTEN_SIGN);


        addDrop(ModBlocks.IVY, shortPlantDrops(ModBlocks.IVY));
        addDrop(ModBlocks.UNDERGROWTH, shortPlantDrops(ModBlocks.UNDERGROWTH));

        addDrop(ModBlocks.ROTTEN_DOOR, doorDrops(ModBlocks.ROTTEN_DOOR));
        addDrop(ModBlocks.ROTTEN_SLAB, slabDrops(ModBlocks.ROTTEN_SLAB));
        addDrop(ModBlocks.ROTTEN_TRAPDOOR);
        addDrop(ModBlocks.ROTTEN_FENCE);
        addDrop(ModBlocks.ROTTEN_STAIRS);
        addDrop(ModBlocks.ROTTEN_FENCE_GATE);
    }
}
