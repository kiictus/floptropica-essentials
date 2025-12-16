package net.kiictus.floptropica.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kiictus.floptropica.FloptropicaEssentials;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FLOPTROPICA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FloptropicaEssentials.MOD_ID, "floptropica"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.floptropica"))
                    .icon(() -> new ItemStack(ModItems.COATHANGER)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COATHANGER);
                        entries.add(ModItems.YEAST);
                    }).build());

    public static void registerItemGroups() {
        FloptropicaEssentials.LOGGER.info("Registering Item Groups for " +FloptropicaEssentials.MOD_ID);
    }
}
