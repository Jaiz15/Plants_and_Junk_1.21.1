package jaiz.plantsjunk.block.custom;

import jaiz.plantsjunk.entity.ModEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.LanternBlock;
import net.minecraft.entity.SpawnReason;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;

public class FireflyBottleBlock extends LanternBlock {

    public FireflyBottleBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack tool, boolean dropExperience) {
        super.onStacksDropped(state, world, pos, tool, dropExperience);
        if (world.getGameRules().getBoolean(GameRules.DO_TILE_DROPS)) {
            ModEntities.FIRE_FLY_SWARM.spawn(world, pos, SpawnReason.MOB_SUMMONED);
        }
    }

}
