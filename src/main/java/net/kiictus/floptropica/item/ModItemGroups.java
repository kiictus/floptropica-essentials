package net.kiictus.floptropica.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kiictus.floptropica.FloptropicaEssentials;
import net.kiictus.floptropica.block.ModBlocks;
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
                        entries.add(ModBlocks.YEAST_VACUUM);
                        
                        entries.add(ModItems.KHINKALI);
                        entries.add(ModItems.BECHAMEL);
                        entries.add(ModItems.RAW_TORRIJAS);
                        entries.add(ModItems.ARROZ_CON_LECHE);
                        entries.add(ModItems.CACHOPO);
                        entries.add(ModItems.CALDO_GALLEGO);
                        entries.add(ModItems.COCIDO);
                        entries.add(ModItems.CREMA_CATALANA);
                        entries.add(ModItems.CROQUETAS);
                        entries.add(ModItems.EMPANADA_DE_ATUN);
                        entries.add(ModItems.ENSAIMADA);
                        entries.add(ModItems.HUEVOS_ROTOS);
                        entries.add(ModItems.JAMON_IBERICO);
                        entries.add(ModItems.LENTEJAS);
                        entries.add(ModItems.PAELLA);
                        entries.add(ModItems.PAPAS_BRAVAS);
                        entries.add(ModItems.PULPO_A_LA_GALLEGA);
                        entries.add(ModItems.ROSCON_DE_REYES);
                        entries.add(ModItems.TORREZNOS);
                        entries.add(ModItems.TORRIJAS);
                        entries.add(ModItems.TORTILLA);


                    }).build());

    public static void registerItemGroups() {
        FloptropicaEssentials.LOGGER.info("Registering Item Groups for " +FloptropicaEssentials.MOD_ID);
    }
}
