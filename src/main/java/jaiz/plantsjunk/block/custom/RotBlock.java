package jaiz.plantsjunk.block.custom;

import jaiz.plantsjunk.block.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.fluid.Fluids;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class RotBlock extends Block implements Fertilizable{


    public RotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        BlockPos blockPos = pos.up();
        BlockState blockState = world.getBlockState(blockPos);
        BlockState blockState2 = ModBlocks.ROTTEN_LOG.getDefaultState();
        if (blockState.isIn(BlockTags.LOGS)) {
            world.setBlockState(blockPos, blockState2);
        }
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(5) == 1) {
            return;
        }
        BlockPos blockPos = pos.up();
        BlockState blockState = world.getBlockState(blockPos);
        BlockState blockState2 = ModBlocks.ROTTEN_LOG.getDefaultState();
        if (blockState.isIn(BlockTags.LOGS)) {
            world.setBlockState(blockPos, blockState2);
        }

    }


}
