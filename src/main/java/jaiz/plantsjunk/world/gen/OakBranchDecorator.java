package jaiz.plantsjunk.world.gen;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

import java.util.Iterator;
import java.util.List;

public class OakBranchDecorator extends TreeDecorator {

    public static final MapCodec<OakBranchDecorator> CODEC = RecordCodecBuilder.mapCodec((instance) -> instance.group(
            Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter(p -> p.probability),
            Codec.intRange(0, 16).fieldOf("treeHeight").forGetter(p -> p.treeHeight))
            .apply(instance, OakBranchDecorator::new));

    private final float probability;
    private final int treeHeight;

    public OakBranchDecorator(float f, int treeHeight){
        this.probability = f;
        this.treeHeight = treeHeight;
    }

    protected TreeDecoratorType<?> getType() {return ModTreeDecorator.OAK_BRANCH;}

    @Override
    public void generate(Generator generator) {
        Random random = generator.getRandom();
        if (!(random.nextFloat() >= this.probability)) {
            List<BlockPos> list = generator.getLogPositions();
            int i = list.get(0).getY();
            list.stream().filter((pos) -> pos.getY() - i <= treeHeight - 8).forEach((pos)  -> {
                Iterator var3 = Direction.Type.HORIZONTAL.iterator();
                while(var3.hasNext()) {
                    Direction direction = (Direction)var3.next();
                    if (random.nextFloat() <= 0.05F) {
                        Direction direction2 = direction.getOpposite();
                        BlockPos blockPos = pos.add(direction2.getOffsetX(),3, direction2.getOffsetZ());
                        if (generator.isAir(blockPos)) {
                            generator.replace(blockPos, Blocks.OAK_LOG.getDefaultState().with(PillarBlock.AXIS, direction.getAxis()));
                        }
                    }
                }
            });
        }
    }
}


