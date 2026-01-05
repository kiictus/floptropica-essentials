package net.kiictus.floptropica.item;

import net.kiictus.floptropica.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent RAW_FETUS = new FoodComponent.Builder().meat().hunger(0).saturationModifier(0f)
            .statusEffect(new StatusEffectInstance(ModEffects.PREGGY.value(), 200), 1f).build();
    public static final FoodComponent COOKED_FETUS = new FoodComponent.Builder().meat().hunger(5).saturationModifier(1f).build();
    public static final FoodComponent GIRA = new FoodComponent.Builder().meat().hunger(5).saturationModifier(2f).build();
    public static final FoodComponent KEFIR = new FoodComponent.Builder().meat().hunger(2).saturationModifier(2f).build();
    public static final FoodComponent SAKOTIS = new FoodComponent.Builder().meat().hunger(8).saturationModifier(1.5f).build();
    public static final FoodComponent SALTIBARSCIAI = new FoodComponent.Builder().hunger(13).saturationModifier(1.5f).build();
    public static final FoodComponent KHINKALI = new FoodComponent.Builder().meat().hunger(13).saturationModifier(3f).build();
    public static final FoodComponent CEPELINAI = new FoodComponent.Builder().meat().hunger(12).saturationModifier(3f).build();
    public static final FoodComponent TINGINYS = new FoodComponent.Builder().meat().hunger(6).saturationModifier(1.5f).build();
    public static final FoodComponent ARROZ_CON_LECHE = new FoodComponent.Builder().meat().hunger(13).saturationModifier(2f).build();
    public static final FoodComponent CACHOPO = new FoodComponent.Builder().meat().hunger(13).saturationModifier(3f).build();
    public static final FoodComponent CALDO_GALLEGO = new FoodComponent.Builder().meat().hunger(12).saturationModifier(1.5f).build();
    public static final FoodComponent COCIDO = new FoodComponent.Builder().meat().hunger(12).saturationModifier(1.5f).build();
    public static final FoodComponent CREMA_CATALANA = new FoodComponent.Builder().meat().hunger(13).saturationModifier(3f).build();
    public static final FoodComponent CROQUETAS = new FoodComponent.Builder().meat().hunger(9).saturationModifier(1.5f).build();
    public static final FoodComponent EMPANADA_DE_ATUN = new FoodComponent.Builder().meat().hunger(10).saturationModifier(2f).build();
    public static final FoodComponent ENSAIMADA = new FoodComponent.Builder().meat().hunger(7).saturationModifier(1f).build();
    public static final FoodComponent HUEVOS_ROTOS = new FoodComponent.Builder().meat().hunger(15).saturationModifier(2f).build();
    public static final FoodComponent JAMON_IBERICO = new FoodComponent.Builder().meat().hunger(8).saturationModifier(1f).build();
    public static final FoodComponent LENTEJAS = new FoodComponent.Builder().meat().hunger(13).saturationModifier(2f).build();
    public static final FoodComponent PAELLA = new FoodComponent.Builder().meat().hunger(14).saturationModifier(2.5f).build();
    public static final FoodComponent PAPAS_BRAVAS = new FoodComponent.Builder().meat().hunger(12).saturationModifier(1.3f).build();
    public static final FoodComponent PULPO_A_LA_GALLEGA = new FoodComponent.Builder().meat().hunger(12).saturationModifier(2f).build();
    public static final FoodComponent ROSCON_DE_REYES = new FoodComponent.Builder().meat().hunger(17).saturationModifier(2.5f).build();
    public static final FoodComponent TORREZNOS = new FoodComponent.Builder().snack().hunger(5).saturationModifier(2f).build();
    public static final FoodComponent TORRIJAS = new FoodComponent.Builder().meat().hunger(10).saturationModifier(3f).build();
    public static final FoodComponent TORTILLA = new FoodComponent.Builder().meat().hunger(11).saturationModifier(2f).build();
}
