package net.kiictus.floptropica.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kiictus.floptropica.FloptropicaEssentials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COATHANGER = registerItem("coat-hanger", new Item(new FabricItemSettings()));
    public static final Item YEAST = registerItem("yeast", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FloptropicaEssentials.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FloptropicaEssentials.LOGGER.info("Registering Mod Items for " + FloptropicaEssentials.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
