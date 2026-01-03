package net.kiictus.floptropica.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.kiictus.floptropica.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {

    private static final Identifier PIG_ID =
            new Identifier("minecraft", "entities/pig");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, identifier, builder, lootTableSource) -> {
            if(PIG_ID.equals(identifier)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f))
                        .with(ItemEntry.builder(ModItems.JAMON_IBERICO))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                builder.pool(poolBuilder.build());
            }


        });
    }
}
