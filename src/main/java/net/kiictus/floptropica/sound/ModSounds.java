package net.kiictus.floptropica.sound;

import net.kiictus.floptropica.FloptropicaEssentials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent COAT_HANGER_MOAN = registerSoundEvent("coat_hanger_moan");
    public static final SoundEvent VACUUM_GULP = registerSoundEvent("vacuum_gulp");

    public static final SoundEvent BARBACOA_AL_PUNTO_G = registerSoundEvent("barbacoa_al_punto_g");
    public static final SoundEvent GRINDR_LABUBU = registerSoundEvent("grindr_labubu");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(FloptropicaEssentials.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        FloptropicaEssentials.LOGGER.info("registering sounds for " + FloptropicaEssentials.MOD_ID);
    }
}
