package net.kiictus.floptropica.effect;

import net.kiictus.floptropica.FloptropicaEssentials;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> PREGGY = registerStatusEffect("preggy",
            new PreggyEffect(StatusEffectCategory.NEUTRAL, 0xebab36));

    public static final RegistryEntry<StatusEffect> ABORSHA = registerStatusEffect("aborsha",
            new AborshaEffect(StatusEffectCategory.NEUTRAL, 0xebab36));

    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(FloptropicaEssentials.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        FloptropicaEssentials.LOGGER.info("Registering mod effects for " + FloptropicaEssentials.MOD_ID);
    }
}
