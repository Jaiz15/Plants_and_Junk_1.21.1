package jaiz.plantsjunk.world.gen;

import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import jaiz.plantsjunk.PlantsJunk;
import jaiz.plantsjunk.mixin.TreeDecoratorTypeMixin;

public class ModTreeDecorator {

    public static final TreeDecoratorType<?> SHROOMS = TreeDecoratorTypeMixin.callRegister("shrooms",
            MushroomDecorator.CODEC);

    public static final TreeDecoratorType<?> IVY =
            TreeDecoratorTypeMixin.callRegister("ivy", IvyDecorator.CODEC);

    public static final TreeDecoratorType<?> BIRCH_BRANCH =
            TreeDecoratorTypeMixin.callRegister("birch_branch", BirchBranchDecorator.CODEC);

    public static final TreeDecoratorType<?> OAK_BRANCH =
            TreeDecoratorTypeMixin.callRegister("oak_branch", OakBranchDecorator.CODEC);

    public static void register() {
        PlantsJunk.LOGGER.info("Registering the Tree Decorator for " + PlantsJunk.MOD_ID);
    }

}
