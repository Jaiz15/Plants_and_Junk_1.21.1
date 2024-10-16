package jaiz.plantsjunk.entity.custom;

import com.google.common.collect.ImmutableList;
import jaiz.plantsjunk.block.ModBlocks;
import jaiz.plantsjunk.entity.ModEntities;
import jaiz.plantsjunk.entity.client.ButterflyVariant;
import jaiz.plantsjunk.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.entity.IronGolemEntityRenderer;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.AboveGroundTargeting;
import net.minecraft.entity.ai.NoPenaltySolidTargeting;
import net.minecraft.entity.ai.control.FlightMoveControl;
import net.minecraft.entity.ai.control.LookControl;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.ai.pathing.BirdNavigation;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Stream;

public class FireFlySwarmEntity extends AnimalEntity implements Flutterer {

    private static final Ingredient FOLLOW_ITEMS = Ingredient.ofItems(Items.TORCH, Items.SHROOMLIGHT, Items.SOUL_TORCH, Items.CAMPFIRE,
            Items.SOUL_LANTERN, Items.LANTERN, Items.REDSTONE_TORCH, Items.SOUL_CAMPFIRE, Items.GLOWSTONE, Items.GLOW_BERRIES);

    public FireFlySwarmEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
        this.experiencePoints = 4;
        this.moveControl = new FlightMoveControl(this, 20, true);
        this.lookControl = new ButterflyLookControl(this);
        this.setPathfindingPenalty(PathNodeType.DANGER_FIRE, -1.0f);
        this.setPathfindingPenalty(PathNodeType.WATER, -1.0f);
        this.setPathfindingPenalty(PathNodeType.WATER_BORDER, 16.0f);
        this.setPathfindingPenalty(PathNodeType.COCOA, -1.0f);
        this.setPathfindingPenalty(PathNodeType.FENCE, -1.0f);
    }

    @Override
    public float getPathfindingFavor(BlockPos pos, WorldView world) {
        if (world.getBlockState(pos).isAir()) {
            return 10.0f;
        }
        return 0.0f;
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return stack.isIn(ItemTags.FLOWERS);
    }

    @Override
    @Nullable
    public PassiveEntity createChild(ServerWorld serverWorld, PassiveEntity passiveEntity) {
        return ModEntities.FIRE_FLY_SWARM.create(serverWorld);
    }


    public AnimationState fireflyAnimationState = new AnimationState();
    private int fireflyAnimationTimeout = 0;

    private void setupAnimationStates() {
        if (this.fireflyAnimationTimeout <= 0) {
            this.fireflyAnimationTimeout = 100;
            this.fireflyAnimationState.start(this.age);
        } else {
            --this.fireflyAnimationTimeout;
        }
    }

    @Override
    public void tick() {
        super.tick();
        if (this.isTouchingWater()){
            this.setVelocity(this.getVelocity().add(0.0, 0.01, 0.0));
        }
        if (this.getWorld().isClient()) {
            setupAnimationStates();
        }

        if (FireFlySwarmEntity.this.random.nextInt(100) == 1){
            this.playSound(SoundEvents.ENTITY_BEE_LOOP, 0.2f, (this.random.nextFloat() - this.random.nextFloat()) * 0.2f + 1.0f);
        }
    }

    @Override
    protected void updateLimbs(float posDelta) {
        float f = this.getPose() == EntityPose.STANDING ? Math.min(posDelta * 6.0f, 1.0f) : 0.0f;
        this.limbAnimator.updateLimbs(f, 0.2f);
    }

    @Override
    protected void initGoals() {
        this.initCustomGoals();
    }

    protected void initCustomGoals() {
        this.goalSelector.add(3, new FireflyWanderAroundGoal());
        this.goalSelector.add(1, new AnimalMateGoal(this, 1.0));
        this.goalSelector.add(2, new TemptGoal(this, 1.5, FOLLOW_ITEMS, false));
    }



    public static DefaultAttributeContainer.Builder createFireflyAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 15)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25f)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 15)
                .add(EntityAttributes.GENERIC_FLYING_SPEED, 0.6f);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_BEE_LOOP;
    }

    @Override
    protected float getSoundVolume() {
        return 0.2f;
    }


    @Override
    protected EntityNavigation createNavigation(World world) {
        BirdNavigation birdNavigation = new BirdNavigation(this, world) {

            @Override
            public boolean isValidPosition(BlockPos pos) {
                return !this.world.getBlockState(pos.down()).isAir();
            }

            @Override
            public void tick() {
                super.tick();
            }
        };
        birdNavigation.setCanPathThroughDoors(false);
        birdNavigation.setCanSwim(false);
        birdNavigation.setCanEnterOpenDoors(true);
        return birdNavigation;
    }


    @Override
    public boolean isInAir() {
        return !this.isOnGround();
    }

    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
    }

    @Override
    protected void fall(double heightDifference, boolean onGround, BlockState state, BlockPos landedPosition) {
    }

    @Override
    public boolean isPushable() {
        return false;
    }

    @Override
    protected void pushAway(Entity entity) {
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (!itemStack.isOf(Items.GLASS_BOTTLE)) {
            return ActionResult.PASS;
        }
        if (!player.getAbilities().creativeMode) {
            itemStack.decrement(1);
        }
        this.dropItem(ModBlocks.FIREFLY_BOTTLE);
        this.discard();
        return ActionResult.success(this.getWorld().isClient);

    }


    static class ButterflyLookControl
            extends LookControl {
        ButterflyLookControl(MobEntity entity) {
            super(entity);
        }

        @Override
        public void tick() {
            super.tick();
        }

    }


    class FireflyWanderAroundGoal
            extends Goal {

        FireflyWanderAroundGoal() {
            this.setControls(EnumSet.of(Control.MOVE));
        }

        @Override
        public boolean canStart() {
            return FireFlySwarmEntity.this.navigation.isIdle() && FireFlySwarmEntity.this.random.nextInt(100) == 1;
        }

        @Override
        public boolean shouldContinue() {
            return FireFlySwarmEntity.this.navigation.isFollowingPath();
        }

        @Override
        public void start() {
            Vec3d vec3d = this.getRandomLocation();
            if (vec3d != null) {
                FireFlySwarmEntity.this.navigation.startMovingAlong(FireFlySwarmEntity.this.navigation.findPathTo(BlockPos.ofFloored(vec3d), 1), 0.75);
            }
        }


        @Nullable
        private Vec3d getRandomLocation() {
            Vec3d vec3d2;
            vec3d2 = FireFlySwarmEntity.this.getRotationVec(0.0f);
            int i = 8;
            Vec3d vec3d3 = AboveGroundTargeting.find(FireFlySwarmEntity.this, 4, 14, vec3d2.x, vec3d2.z, 1.5707964f, 3, 1);
            if (vec3d3 != null) {
                return vec3d3;
            }return NoPenaltySolidTargeting.find(FireFlySwarmEntity.this, 4, 8, -2, vec3d2.x, vec3d2.z, 1.5707963705062866);}

    }
}
