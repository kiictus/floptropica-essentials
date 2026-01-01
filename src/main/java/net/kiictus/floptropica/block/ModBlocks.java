package net.kiictus.floptropica.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kiictus.floptropica.FloptropicaEssentials;
import net.kiictus.floptropica.block.custom.YeastVacuum;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block YEAST_VACUUM = registerBlock("yeast_vacuum",
            new YeastVacuum(FabricBlockSettings.copyOf(Blocks.ANVIL)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FloptropicaEssentials.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(FloptropicaEssentials.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        FloptropicaEssentials.LOGGER.info("Registering ModBlocks for " + FloptropicaEssentials.MOD_ID);
    }
}
