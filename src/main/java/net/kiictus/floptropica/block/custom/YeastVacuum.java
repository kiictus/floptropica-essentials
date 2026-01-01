package net.kiictus.floptropica.block.custom;

import net.kiictus.floptropica.FloptropicaEssentials;
import net.kiictus.floptropica.effect.ModEffects;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.kiictus.floptropica.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class YeastVacuum extends Block {
    public YeastVacuum(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient()) {
            StatusEffectInstance hasteEffect = player.getStatusEffect(ModEffects.ABORSHA.value());

            if (hasteEffect != null) {
                player.removeStatusEffect(ModEffects.ABORSHA.value());

                world.playSound(null, pos, SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE,
                        SoundCategory.BLOCKS, 1.0F, 1.0F);

                Random random = world.random;
                int dropAmount = 2 + random.nextInt(4);

                ItemStack dropStack = new ItemStack(ModItems.YEAST, dropAmount);
                Block.dropStack(world, pos.up(), dropStack);

                player.sendMessage(Text.of("Vacuumed up " + dropAmount + " yeast packs!"), true);

                return ActionResult.SUCCESS;
            } else {
                return ActionResult.FAIL;
            }
        }

        // Always return something for client side
        return ActionResult.success(world.isClient());
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        tooltip.add(Text.translatable("tooltip.floptropica.yeast_vacuum.tooltip"));
        super.appendTooltip(stack, world, tooltip, options);
    }
}