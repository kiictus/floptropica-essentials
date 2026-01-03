package net.kiictus.floptropica;

import net.fabricmc.api.ModInitializer;

import net.kiictus.floptropica.block.ModBlocks;
import net.kiictus.floptropica.effect.ModEffects;
import net.kiictus.floptropica.item.ModItemGroups;
import net.kiictus.floptropica.item.ModItems;
import net.kiictus.floptropica.sound.ModSounds;
import net.kiictus.floptropica.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FloptropicaEssentials implements ModInitializer {
	public static final String MOD_ID = "floptropica";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModSounds.registerSounds();
		ModEffects.registerEffects();
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModLootTableModifiers.modifyLootTables();
	}
}