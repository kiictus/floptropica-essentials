package net.kiictus.floptropica.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kiictus.floptropica.FloptropicaEssentials;
import net.kiictus.floptropica.item.custom.CoatHanger;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COATHANGER = registerItem("coat-hanger", new CoatHanger(new FabricItemSettings()));
    public static final Item YEAST = registerItem("yeast", new Item(new FabricItemSettings()));
    public static final Item DOUGH_ON_A_STICK = registerItem("dough_on_a_stick", new Item(new FabricItemSettings()));

    public static final Item SAKOTIS = registerItem("sakotis", new Item(new FabricItemSettings().food(ModFoodComponents.SAKOTIS)));
    public static final Item SALTIBARSCIAI = registerItem("saltibarsciai", new Item(new FabricItemSettings().food(ModFoodComponents.SALTIBARSCIAI)));
    public static final Item CEPELINAI = registerItem("cepelinai", new Item(new FabricItemSettings().food(ModFoodComponents.CEPELINAI)));

    public static final Item KHINKALI = registerItem("khinkali", new Item(new FabricItemSettings().food(ModFoodComponents.KHINKALI)));

    public static final Item BECHAMEL = registerItem("bechamel", new Item(new FabricItemSettings()));
    public static final Item RAW_TORRIJAS = registerItem("raw_torrijas", new Item(new FabricItemSettings()));
    public static final Item ARROZ_CON_LECHE = registerItem("arroz_con_leche", new Item(new FabricItemSettings().food(ModFoodComponents.ARROZ_CON_LECHE)));
    public static final Item CACHOPO = registerItem("cachopo", new Item(new FabricItemSettings().food(ModFoodComponents.CACHOPO)));
    public static final Item CALDO_GALLEGO = registerItem("caldo_gallego", new Item(new FabricItemSettings().food(ModFoodComponents.CALDO_GALLEGO)));
    public static final Item COCIDO = registerItem("cocido", new Item(new FabricItemSettings().food(ModFoodComponents.COCIDO)));
    public static final Item CREMA_CATALANA = registerItem("crema_catalana", new Item(new FabricItemSettings().food(ModFoodComponents.CREMA_CATALANA)));
    public static final Item CROQUETAS = registerItem("croquetas", new Item(new FabricItemSettings().food(ModFoodComponents.CROQUETAS)));
    public static final Item EMPANADA_DE_ATUN = registerItem("empanada_de_atun", new Item(new FabricItemSettings().food(ModFoodComponents.EMPANADA_DE_ATUN)));
    public static final Item ENSAIMADA = registerItem("ensaimada", new Item(new FabricItemSettings().food(ModFoodComponents.ENSAIMADA)));
    public static final Item HUEVOS_ROTOS = registerItem("huevos_rotos", new Item(new FabricItemSettings().food(ModFoodComponents.HUEVOS_ROTOS)));
    public static final Item JAMON_IBERICO = registerItem("jamon_iberico", new Item(new FabricItemSettings().food(ModFoodComponents.JAMON_IBERICO)));
    public static final Item LENTEJAS = registerItem("lentejas", new Item(new FabricItemSettings().food(ModFoodComponents.LENTEJAS)));
    public static final Item PAELLA = registerItem("paella", new Item(new FabricItemSettings().food(ModFoodComponents.PAELLA)));
    public static final Item PAPAS_BRAVAS = registerItem("papas_bravas", new Item(new FabricItemSettings().food(ModFoodComponents.PAPAS_BRAVAS)));
    public static final Item PULPO_A_LA_GALLEGA = registerItem("pulpo_a_la_gallega", new Item(new FabricItemSettings().food(ModFoodComponents.PULPO_A_LA_GALLEGA)));
    public static final Item ROSCON_DE_REYES = registerItem("roscon_de_reyes", new Item(new FabricItemSettings().food(ModFoodComponents.ROSCON_DE_REYES)));
    public static final Item TORREZNOS = registerItem("torreznos", new Item(new FabricItemSettings().food(ModFoodComponents.TORREZNOS)));
    public static final Item TORRIJAS = registerItem("torrijas", new Item(new FabricItemSettings().food(ModFoodComponents.TORRIJAS)));
    public static final Item TORTILLA = registerItem("tortilla", new Item(new FabricItemSettings().food(ModFoodComponents.TORTILLA)));

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
