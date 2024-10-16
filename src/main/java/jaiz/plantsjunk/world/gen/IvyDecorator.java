package jaiz.plantsjunk.world.gen;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import jaiz.plantsjunk.block.ModBlocks;
import jaiz.plantsjunk.block.custom.IvyBlock;
import jaiz.plantsjunk.block.custom.ShelfMushroomBlock;
import net.minecraft.block.VineBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator;

import java.util.Iterator;
import java.util.List;

public class IvyDecorator extends TreeDecorator {

    public static final MapCodec<IvyDecorator> CODEC = RecordCodecBuilder.mapCodec((instance) -> instance.group(
            Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter(p -> p.probability),
            Codec.intRange(0, 16).fieldOf("treeHeight").forGetter(p -> p.treeHeight))
            .apply(instance, IvyDecorator::new));

    private final float probability;
    private final int treeHeight;

    public IvyDecorator(float f, int treeHeight){
        this.probability = f;
        this.treeHeight = treeHeight;
    }

    protected TreeDecoratorType<?> getType() {return ModTreeDecorator.IVY;}

    @Override
    public void generate(Generator generator) {
        Random random = generator.getRandom();
        if (!(random.nextFloat() >= this.probability)) {
            generator.getLogPositions().forEach(pos -> {
                BlockPos blockPos;
                if (random.nextInt(3) > 0 && generator.isAir(blockPos = pos.west())) {
                    generator.replace(blockPos, ModBlocks.IVY.getDefaultState().with(IvyBlock.EAST, true));
                }
                if (random.nextInt(3) > 0 && generator.isAir(blockPos = pos.east())) {
                    generator.replace(blockPos, ModBlocks.IVY.getDefaultState().with(IvyBlock.WEST, true));
                }
                if (random.nextInt(3) > 0 && generator.isAir(blockPos = pos.north())) {
                    generator.replace(blockPos, ModBlocks.IVY.getDefaultState().with(IvyBlock.SOUTH, true));
                }
                if (random.nextInt(3) > 0 && generator.isAir(blockPos = pos.south())) {
                    generator.replace(blockPos, ModBlocks.IVY.getDefaultState().with(IvyBlock.NORTH, true));
                }
            });
        }
    }
}

