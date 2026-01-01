package net.kiictus.floptropica.item.custom;

import net.kiictus.floptropica.effect.ModEffects;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CoatHanger extends Item {
    public CoatHanger(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);

        // Check if player has the effect you want to change FROM
        if (user.hasStatusEffect(ModEffects.PREGGY.value())) { // Replace with your effect
            // Remove the old effect
            user.removeStatusEffect(ModEffects.PREGGY.value());

            // Add the new effect
            user.addStatusEffect(new StatusEffectInstance(
                    ModEffects.ABORSHA.value(), // Replace with your target effect
                    600, // Duration in ticks (20 ticks = 1 second)
                    0, // Amplifier (0 = level I, 1 = level II, etc.)
                    false, // Show particles
                    true // Show icon
            ));

            // Consume item if needed
            if (!user.getAbilities().creativeMode) {
                stack.decrement(1);
            }

            // Play sound or other effects
            world.playSound(null, user.getX(), user.getY(), user.getZ(),
                    SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS,
                    1.0F, 1.0F);

            return TypedActionResult.success(stack, world.isClient());
        }

        return TypedActionResult.pass(stack);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.floptropica.coat_hanger.tooltip"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
