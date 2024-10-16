package jaiz.plantsjunk.datagen;

import jaiz.plantsjunk.block.ModBlocks;
import jaiz.plantsjunk.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;

import java.rmi.registry.Registry;
import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) { super(output);}

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerTintableCross(ModBlocks.COLUMBINE, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerDoubleBlock(ModBlocks.CALLALILY_WHITE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.CALLALILY_PURPLE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.CALLALILY_YELLOW, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.CALLALILY_LILAC, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerDoubleBlock(ModBlocks.CALLALILY_PINK, BlockStateModelGenerator.TintType.NOT_TINTED);


        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_ROTTEN_LOG).log(ModBlocks.STRIPPED_ROTTEN_LOG).wood(ModBlocks.STRIPPED_ROTTEN_WOOD);

        BlockStateModelGenerator.BlockTexturePool rotten_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ROTTEN_PLANKS);
        rotten_pool.family(ModBlocks.ROTTEN_FAMILY);

        rotten_pool.stairs(ModBlocks.ROTTEN_STAIRS);
        rotten_pool.slab(ModBlocks.ROTTEN_SLAB);
        rotten_pool.fence(ModBlocks.ROTTEN_FENCE);
        rotten_pool.fenceGate(ModBlocks.ROTTEN_FENCE_GATE);
        rotten_pool.button(ModBlocks.ROTTEN_BUTTON);
        rotten_pool.pressurePlate(ModBlocks.ROTTEN_PRESSURE_PLATE);
        blockStateModelGenerator.registerDoor(ModBlocks.ROTTEN_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ROTTEN_TRAPDOOR);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ROT_BLOCK);

        blockStateModelGenerator.registerHangingSign(ModBlocks.HANGING_ROTTEN_SIGN, ModBlocks.HANGING_ROTTEN_SIGN, ModBlocks.WALL_HANGING_ROTTEN_SIGN);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.DRAGONFLY_SPAWN_EGG,
                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));

        itemModelGenerator.register(ModItems.BUTTERFLY_SPAWN_EGG,
                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));

        itemModelGenerator.register(ModItems.SNAIL_SPAWN_EGG,
                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));

        itemModelGenerator.register(ModItems.CATERPILLAR_SPAWN_EGG,
                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));

        itemModelGenerator.register(ModItems.FIREFLY_SWARM_SPAWN_EGG,
                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));

    }
}
