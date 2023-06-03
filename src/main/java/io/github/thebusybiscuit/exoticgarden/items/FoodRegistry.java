package io.github.thebusybiscuit.exoticgarden.items;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import io.github.thebusybiscuit.exoticgarden.CustomPotion;
import io.github.thebusybiscuit.exoticgarden.ExoticGarden;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.food.Juice;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.mini2Dx.gettext.GetText;

/**
 * In plugin class we register all our items and recipes for the dishes.
 * 
 * @author TheBusyBiscuit
 * @author SoSeDiK
 * @author yurinogueira
 * @author Hellcode48
 * @author CURVX
 *
 */
public final class FoodRegistry {

    private FoodRegistry() {}

    public static void register(@Nonnull ExoticGarden plugin, @Nonnull ItemGroup misc, @Nonnull ItemGroup drinks, @Nonnull ItemGroup food) {
        new Juice(drinks, new SlimefunItemStack("LIME_SMOOTHIE", new CustomPotion(GetText.tr("&aLime Smoothie"), Color.LIME, new PotionEffect(PotionEffectType.SATURATION, 10, 0), "", GetText.tr("&7&oRestores &b&o") + "5.0" + GetText.tr(" &7&oHunger"))), RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {getItem("LIME_JUICE"), getItem("ICE_CUBE"), null, null, null, null, null, null, null})
        .register(plugin);

        new Juice(drinks, new SlimefunItemStack("TOMATO_JUICE", new CustomPotion(GetText.tr("&4Tomato Juice"), Color.FUCHSIA, new PotionEffect(PotionEffectType.SATURATION, 6, 0), "", GetText.tr("&7&oRestores &b&o") + "3.0" + GetText.tr(" &7&oHunger"))), RecipeType.JUICER,
        new ItemStack[] {getItem("TOMATO"), null, null, null, null, null, null, null, null})
        .register(plugin);

        new Juice(drinks, new SlimefunItemStack("WINE", new CustomPotion(GetText.tr("&cWine"), Color.RED, new PotionEffect(PotionEffectType.SATURATION, 10, 0), "", GetText.tr("&7&oRestores &b&o") + "5.0" + GetText.tr(" &7&oHunger"))), RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {getItem("GRAPE"), new ItemStack(Material.SUGAR), null, null, null, null, null, null, null})
        .register(plugin);

        new Juice(drinks, new SlimefunItemStack("LEMON_ICED_TEA", new CustomPotion(GetText.tr("&eLemon Iced Tea"), Color.YELLOW, new PotionEffect(PotionEffectType.SATURATION, 13, 0), "", GetText.tr("&7&oRestores &b&o") + "6.5" + GetText.tr(" &7&oHunger"))), RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {getItem("LEMON"), getItem("ICE_CUBE"), getItem("TEA_LEAF"), null, null, null, null, null, null})
        .register(plugin);

        new Juice(drinks, new SlimefunItemStack("RASPBERRY_ICED_TEA", new CustomPotion(GetText.tr("&dRaspberry Iced Tea"), Color.FUCHSIA, new PotionEffect(PotionEffectType.SATURATION, 13, 0), "", GetText.tr("&7&oRestores &b&o") + "6.5" + GetText.tr(" &7&oHunger"))), RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {getItem("RASPBERRY"), getItem("ICE_CUBE"), getItem("TEA_LEAF"), null, null, null, null, null, null})
        .register(plugin);

        new Juice(drinks, new SlimefunItemStack("PEACH_ICED_TEA", new CustomPotion(GetText.tr("&dPeach Iced Tea"), Color.FUCHSIA, new PotionEffect(PotionEffectType.SATURATION, 13, 0), "", GetText.tr("&7&oRestores &b&o") + "6.5" + GetText.tr(" &7&oHunger"))), RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {getItem("PEACH"), getItem("ICE_CUBE"), getItem("TEA_LEAF"), null, null, null, null, null, null})
        .register(plugin);

        new Juice(drinks, new SlimefunItemStack("STRAWBERRY_ICED_TEA", new CustomPotion(GetText.tr("&4Strawberry Iced Tea"), Color.FUCHSIA, new PotionEffect(PotionEffectType.SATURATION, 13, 0), "", GetText.tr("&7&oRestores &b&o") + "6.5" + GetText.tr(" &7&oHunger"))), RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {getItem("STRAWBERRY"), getItem("ICE_CUBE"), getItem("TEA_LEAF"), null, null, null, null, null, null})
        .register(plugin);

        new Juice(drinks, new SlimefunItemStack("CHERRY_ICED_TEA", new CustomPotion(GetText.tr("&cCherry Iced Tea"), Color.FUCHSIA, new PotionEffect(PotionEffectType.SATURATION, 13, 0), "", GetText.tr("&7&oRestores &b&o") + "6.5" + GetText.tr(" &7&oHunger"))), RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {getItem("CHERRY"), getItem("ICE_CUBE"), getItem("TEA_LEAF"), null, null, null, null, null, null})
        .register(plugin);

        new Juice(drinks, new SlimefunItemStack("THAI_TEA", new CustomPotion(GetText.tr("&6Thai Tea"), Color.RED, new PotionEffect(PotionEffectType.SATURATION, 14, 0), "", GetText.tr("&7&oRestores &b&o") + "7.0" + GetText.tr(" &7&oHunger"))), RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {getItem("TEA_LEAF"), new ItemStack(Material.SUGAR), SlimefunItems.HEAVY_CREAM, getItem("COCONUT_MILK"), null, null, null, null, null})
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("PUMPKIN_BREAD", "f3487d457f9062d787a3e6ce1c4664bf7402ec67dd111256f19b38ce4f670", GetText.tr("&rPumpkin Bread"), "", GetText.tr("&7&oRestores &b&o") + "4.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {new ItemStack(Material.PUMPKIN), new ItemStack(Material.SUGAR), SlimefunItems.WHEAT_FLOUR, null, null, null, null, null, null},
        8)
        .register(plugin);

        new SlimefunItem(misc, new SlimefunItemStack("MAYO", "7f8d536c8c2c2596bcc1709590a9d7e33061c56e658974cd81bb832ea4d8842", GetText.tr("&rMayo")), RecipeType.GRIND_STONE,
        new ItemStack[] {new ItemStack(Material.EGG), null, null, null, null, null, null, null, null})
        .register(plugin);

        new SlimefunItem(misc, new SlimefunItemStack("MUSTARD", "9b9e99621b9773b29e375e62c6495ff1ac847f85b29816c2eb77b587874ba62", GetText.tr("&eMustard")), RecipeType.GRIND_STONE,
        new ItemStack[] {getItem("MUSTARD_SEED"), null, null, null, null, null, null, null, null})
        .register(plugin);

        new SlimefunItem(misc, new SlimefunItemStack("BBQ_SAUCE", "a86f19bf23d248e662c9c8b7fa15efb8a1f1d5bdacd3b8625a9b59e93ac8a", GetText.tr("&cBBQ Sauce")), RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {getItem("TOMATO"), getItem("MUSTARD"), getItem("SALT"), new ItemStack(Material.SUGAR), null, null, null, null, null})
        .register(plugin);

        new SlimefunItem(misc, new SlimefunItemStack("VEGETABLE_OIL", "2acb28fb8a310443af02c7a1283ace95a9906b2e0e6f3636597edbe8cad4e", GetText.tr("&rVegetable Oil")), RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.BEETROOT_SEEDS), new ItemStack(Material.WATER_BUCKET), null, null, null, null, null, null, null})
        .register(plugin);

        new SlimefunItem(misc, new SlimefunItemStack("CORNMEAL", Material.SUGAR, GetText.tr("&rCornmeal")), RecipeType.GRIND_STONE,
        new ItemStack[] {getItem("CORN"), null, null, null, null, null, null, null, null})
        .register(plugin);

        new SlimefunItem(misc, new SlimefunItemStack("YEAST", "606be2df2122344bda479feece365ee0e9d5da276afa0e8ce8d848f373dd131", GetText.tr("&rYeast")), RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.SUGAR), new ItemStack(Material.WATER_BUCKET), null, null, null, null, null, null, null})
        .register(plugin);

        new SlimefunItem(misc, new SlimefunItemStack("MOLASSES", "f21d7b155edf440cb87ec94487cba64e8d128171eb1187c26d5ffe58bd794c", GetText.tr("&8Molasses")), RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.BEETROOT), new ItemStack(Material.SUGAR_CANE), new ItemStack(Material.WATER_BUCKET), null, null, null, null, null, null})
        .register(plugin);

        new SlimefunItem(misc, new SlimefunItemStack("BROWN_SUGAR", "964d4247278e1498374aa6b0e47368fe4f138abc94e583e8839965fbe241be", GetText.tr("&rBrown Sugar")), RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {new ItemStack(Material.SUGAR), getItem("MOLASSES"), null, null, null, null, null, null, null})
        .register(plugin);

        new SlimefunItem(misc, new SlimefunItemStack("COUNTRY_GRAVY", "f21fa9439bfd8384464146f9c67ebd4c5fbf4196924892627eadf3bce1ff", GetText.tr("&rCountry Gravy")), RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {SlimefunItems.WHEAT_FLOUR, new ItemStack(Material.SUGAR), getItem("BLACK_PEPPER"), null, null, null, null, null, null})
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("CHOCOLATE_BAR", "819f948d17718adace5dd6e050c586229653fef645d7113ab94d17b639cc466", GetText.tr("&rChocolate Bar"), "", GetText.tr("&7&oRestores &b&o") + "1.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {new ItemStack(Material.COCOA_BEANS), SlimefunItems.HEAVY_CREAM, null, null, null, null, null, null, null},
        3)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("POTATO_SALAD", "1fe92e11a67b56935446a214caa3723d29e6db56c55fa8d43179a8a3176c6c1", GetText.tr("&rPotato Salad"), "", GetText.tr("&7&oRestores &b&o") + "6.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {new ItemStack(Material.BAKED_POTATO), getItem("MAYO"), getItem("ONION"), new ItemStack(Material.BOWL), null, null, null, null, null},
        12)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("CHICKEN_SANDWICH", "a14216d10714082bbe3f412423e6b19232352f4d64f9aca3913cb46318d3ed", GetText.tr("&rChicken Sandwich"), "", GetText.tr("&7&oRestores &b&o") + "5.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {new ItemStack(Material.COOKED_CHICKEN), getItem("MAYO"), new ItemStack(Material.BREAD), null, null, null, null, null, null},
        11)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("FISH_SANDWICH", "a14216d10714082bbe3f412423e6b19232352f4d64f9aca3913cb46318d3ed", GetText.tr("&rFish Sandwich"), "", GetText.tr("&7&oRestores &b&o") + "5.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {new ItemStack(Material.COOKED_COD), getItem("MAYO"), new ItemStack(Material.BREAD), null, null, null, null, null, null},
        11)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("BAGEL", "502e92f13de3bee69228c384478e761230681e5fce9bda195daeaf8484139331", GetText.tr("&rBagel"), "", GetText.tr("&7&oRestores &b&o") + "2.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("YEAST"), SlimefunItems.WHEAT_FLOUR, null, null, null, null, null, null, null},
        4)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("EGG_SALAD", "1fe92e11a67b56935446a214caa3723d29e6db56c55fa8d43179a8a3176c6c1", GetText.tr("&rEgg Salad"), "", GetText.tr("&7&oRestores &b&o") + "6.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {new ItemStack(Material.EGG), getItem("MAYO"), new ItemStack(Material.BOWL), null, null, null, null, null, null},
        12)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("TOMATO_SOUP", "76366f17428a4990126844f74a02dbf5524f35be1323f8fab0bf61a57ff41de3", GetText.tr("&4Tomato Soup"), "", GetText.tr("&7&oRestores &b&o") + "5.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {new ItemStack(Material.BOWL), getItem("TOMATO"), null, null, null, null, null, null, null},
        11)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("STRAWBERRY_SALAD", "1fe92e11a67b56935446a214caa3723d29e6db56c55fa8d43179a8a3176c6c1", GetText.tr("&cStrawberry Salad"), "", GetText.tr("&7&oRestores &b&o") + "5.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {new ItemStack(Material.BOWL), getItem("STRAWBERRY"), getItem("LETTUCE"), getItem("TOMATO"), null, null, null, null, null},
        10)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("GRAPE_SALAD", "1fe92e11a67b56935446a214caa3723d29e6db56c55fa8d43179a8a3176c6c1", GetText.tr("&cGrape Salad"), "", GetText.tr("&7&oRestores &b&o") + "5.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {new ItemStack(Material.BOWL), getItem("GRAPE"), getItem("LETTUCE"), getItem("TOMATO"), null, null, null, null, null},
        10)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("CHICKEN_CURRY", "d09e0dd5489f03efdc8083088f521b82946cdec98fc1c94c4e09792e4735184a", GetText.tr("&rChicken Curry"), "", GetText.tr("&7&oRestores &b&o") + "8.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CILANTRO"), new ItemStack(Material.COOKED_CHICKEN), getItem("BROWN_SUGAR"), getItem("CURRY_LEAF"), getItem("VEGETABLE_OIL"), getItem("CURRY_LEAF"), getItem("ONION"), new ItemStack(Material.BOWL), getItem("GARLIC")},
        16)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("COCONUT_CHICKEN_CURRY", "d09e0dd5489f03efdc8083088f521b82946cdec98fc1c94c4e09792e4735184a", GetText.tr("&rCoconut Chicken Curry"), "", GetText.tr("&7&oRestores &b&o") + "9.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("COCONUT"), getItem("COCONUT"), getItem("CHICKEN_CURRY"), null, null, null, null, null, null},
        19)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("BISCUIT", "ef094456fd794b6531fc6dec6f396b680b9536002063e11ce24d0a74b0b7d885", GetText.tr("&6Biscuit"), "", GetText.tr("&7&oRestores &b&o") + "2.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {SlimefunItems.WHEAT_FLOUR, SlimefunItems.BUTTER, null, null, null, null, null, null, null},
        4)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("BISCUITS_GRAVY", "28bbb835e22d9ec62e22411b8e015138d5597283ad36e618fe44ba5f1a6b60fd", GetText.tr("&rBiscuits and Country Gravy"), "", GetText.tr("&7&oRestores &b&o") + "6.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("COUNTRY_GRAVY"), getItem("COUNTRY_GRAVY"), getItem("COUNTRY_GRAVY"), getItem("BISCUIT"), getItem("BISCUIT"), getItem("BISCUIT"), null, new ItemStack(Material.BOWL), null},
        13)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("CHEESECAKE", "6365b61e79fcb913bc860f4ec635d4a6ab1b74bfab62fb6ea6d89a16aa841", GetText.tr("&rCheesecake"), "", GetText.tr("&7&oRestores &b&o") + "8.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {new ItemStack(Material.SUGAR), SlimefunItems.WHEAT_FLOUR, SlimefunItems.HEAVY_CREAM, new ItemStack(Material.EGG), null, null, null, null, null},
        16)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("CHERRY_CHEESECAKE", "6365b61e79fcb913bc860f4ec635d4a6ab1b74bfab62fb6ea6d89a16aa841", GetText.tr("&cCherry Cheesecake"), "", GetText.tr("&7&oRestores &b&o") + "8.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CHEESECAKE"), getItem("CHERRY"), null, null, null, null, null, null, null},
        17)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("BLUEBERRY_CHEESECAKE", "6365b61e79fcb913bc860f4ec635d4a6ab1b74bfab62fb6ea6d89a16aa841", GetText.tr("&9Blueberry Cheesecake"), "", GetText.tr("&7&oRestores &b&o") + "8.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CHEESECAKE"), getItem("BLUEBERRY"), null, null, null, null, null, null, null},
        17)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("PUMPKIN_CHEESECAKE", "6365b61e79fcb913bc860f4ec635d4a6ab1b74bfab62fb6ea6d89a16aa841", GetText.tr("&6Pumpkin Cheesecake"), "", GetText.tr("&7&oRestores &b&o") + "8.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CHEESECAKE"), new ItemStack(Material.PUMPKIN), null, null, null, null, null, null, null},
        17)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("SWEETENED_PEAR_CHEESECAKE", "6365b61e79fcb913bc860f4ec635d4a6ab1b74bfab62fb6ea6d89a16aa841", GetText.tr("&6Sweetened Pear Cheesecake"), "", GetText.tr("&7&oRestores &b&o") + "9.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CHEESECAKE"), new ItemStack(Material.SUGAR), getItem("PEAR"), null, null, null, null, null, null},
        18)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("BLACKBERRY_COBBLER", "c6c36523c2d11b8c8ea2e992291c52a654760ec72dcc32da2cb63616481ee", GetText.tr("&8Blackberry Cobbler"), "", GetText.tr("&7&oRestores &b&o") + "6.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {new ItemStack(Material.SUGAR), getItem("BLACKBERRY"), SlimefunItems.WHEAT_FLOUR, null, null, null, null, null, null},
        12)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("PAVLOVA", "6365b61e79fcb913bc860f4ec635d4a6ab1b74bfab62fb6ea6d89a16aa841", GetText.tr("&rPavlova"), "", GetText.tr("&7&oRestores &b&o") + "9.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("LEMON"), getItem("STRAWBERRY"), new ItemStack(Material.SUGAR), new ItemStack(Material.EGG), SlimefunItems.HEAVY_CREAM, null, null, null, null},
        18)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("CORN_ON_THE_COB", Material.GOLDEN_CARROT, GetText.tr("&6Corn on the Cob"), "", GetText.tr("&7&oRestores &b&o") + "4.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {SlimefunItems.BUTTER, getItem("CORN"), null, null, null, null, null, null, null},
        9)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("CREAMED_CORN", "9174b34c549eed8bafe727618bab6821afcb1787b5decd1eecd6c213e7e7c6d", GetText.tr("&rCreamed Corn"), "", GetText.tr("&7&oRestores &b&o") + "4.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {SlimefunItems.HEAVY_CREAM, getItem("CORN"), new ItemStack(Material.BOWL), null, null, null, null, null, null},
        8)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("BACON", "e7ba22d5df21e821a6de4b8c9d373a3aa187d8ae74f288a82d2b61f272e5", GetText.tr("&rBacon"), "", GetText.tr("&7&oRestores &b&o") + "1.5" + GetText.tr(" &7&oHunger")),
        3,
        new ItemStack[] {new ItemStack(Material.COOKED_PORKCHOP), null, null, null, null, null, null, null, null},
        3)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("SANDWICH", "a14216d10714082bbe3f412423e6b19232352f4d64f9aca3913cb46318d3ed", GetText.tr("&rSandwich"), "", GetText.tr("&7&oRestores &b&o") + "9.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {new ItemStack(Material.BREAD), getItem("MAYO"), new ItemStack(Material.COOKED_BEEF), getItem("TOMATO"), getItem("LETTUCE"), null, null, null, null},
        19)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("BLT", "a14216d10714082bbe3f412423e6b19232352f4d64f9aca3913cb46318d3ed", GetText.tr("&rBLT"), "", GetText.tr("&7&oRestores &b&o") + "9.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {new ItemStack(Material.BREAD), new ItemStack(Material.COOKED_PORKCHOP), getItem("TOMATO"), getItem("LETTUCE"), null, null, null, null, null},
        18)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("LEAFY_CHICKEN_SANDWICH", "a14216d10714082bbe3f412423e6b19232352f4d64f9aca3913cb46318d3ed", GetText.tr("&rLeafy Chicken Sandwich"), "", GetText.tr("&7&oRestores &b&o") + "6.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CHICKEN_SANDWICH"), getItem("LETTUCE"), null, null, null, null, null, null, null},
        13)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("LEAFY_FISH_SANDWICH", "a14216d10714082bbe3f412423e6b19232352f4d64f9aca3913cb46318d3ed", GetText.tr("&rLeafy Fish Sandwich"), "", GetText.tr("&7&oRestores &b&o") + "6.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("FISH_SANDWICH"), getItem("LETTUCE"), null, null, null, null, null, null, null},
        13)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("HAMBURGER", "cdadf1744433e1c79d1d59d2777d939de159a24cf57e8a61c82bc4fe3777553c", GetText.tr("&rHamburger"), "", GetText.tr("&7&oRestores &b&o") + "5.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {new ItemStack(Material.BREAD), new ItemStack(Material.COOKED_BEEF), null, null, null, null, null, null, null},
        10)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("CHEESEBURGER", "cdadf1744433e1c79d1d59d2777d939de159a24cf57e8a61c82bc4fe3777553c", GetText.tr("&rCheeseburger"), "", GetText.tr("&7&oRestores &b&o") + "6.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("HAMBURGER"), SlimefunItems.CHEESE, null, null, null, null, null, null, null},
        13)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("BACON_CHEESEBURGER", "cdadf1744433e1c79d1d59d2777d939de159a24cf57e8a61c82bc4fe3777553c", GetText.tr("&rBacon Cheeseburger"), "", GetText.tr("&7&oRestores &b&o") + "8.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CHEESEBURGER"), getItem("BACON"), null, null, null, null, null, null, null},
        17)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("DELUXE_CHEESEBURGER", "cdadf1744433e1c79d1d59d2777d939de159a24cf57e8a61c82bc4fe3777553c", GetText.tr("&rDeluxe Cheeseburger"), "", GetText.tr("&7&oRestores &b&o") + "8.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CHEESEBURGER"), getItem("LETTUCE"), getItem("TOMATO"), null, null, null, null, null, null},
        16)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("GARLIC_BREAD", "a33fa7d3e63b280a5d7e2bb09332dff86b17decd2b09eccdd62da5265597f74d", GetText.tr("&rGarlic Bread"), "", GetText.tr("&7&oRestores &b&o") + "5.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("GARLIC"), new ItemStack(Material.BREAD), null, null, null, null, null, null, null},
        10)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("GARLIC_CHEESE_BREAD", "a33fa7d3e63b280a5d7e2bb09332dff86b17decd2b09eccdd62da5265597f74d", GetText.tr("&rGarlic Cheese Bread"), "", GetText.tr("&7&oRestores &b&o") + "6.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {SlimefunItems.CHEESE, getItem("GARLIC"), new ItemStack(Material.BREAD), null, null, null, null, null, null},
        13)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("CARROT_CAKE", "f9136514f342e7c5208a1422506a866158ef84d2b249220139e8bf6032e193", GetText.tr("&rCarrot Cake"), "", GetText.tr("&7&oRestores &b&o") + "6.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {new ItemStack(Material.CARROT), SlimefunItems.WHEAT_FLOUR, new ItemStack(Material.SUGAR), new ItemStack(Material.EGG), null, null, null, null, null},
        12)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("CHICKEN_BURGER", "cdadf1744433e1c79d1d59d2777d939de159a24cf57e8a61c82bc4fe3777553c", GetText.tr("&rChickenburger"), "", GetText.tr("&7&oRestores &b&o") + "5.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {new ItemStack(Material.BREAD), new ItemStack(Material.COOKED_CHICKEN), null, null, null, null, null, null, null},
        10)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("CHICKEN_CHEESEBURGER", "cdadf1744433e1c79d1d59d2777d939de159a24cf57e8a61c82bc4fe3777553c", GetText.tr("&rChicken Cheeseburger"), "", GetText.tr("&7&oRestores &b&o") + "6.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CHICKEN_BURGER"), SlimefunItems.CHEESE, null, null, null, null, null, null, null},
        13)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("BACON_BURGER", "cdadf1744433e1c79d1d59d2777d939de159a24cf57e8a61c82bc4fe3777553c", GetText.tr("&rBacon Burger"), "", GetText.tr("&7&oRestores &b&o") + "5.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {new ItemStack(Material.BREAD), getItem("BACON"), null, null, null, null, null, null, null},
        10)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("BACON_SANDWICH", "a14216d10714082bbe3f412423e6b19232352f4d64f9aca3913cb46318d3ed", GetText.tr("&rBacon Sandwich"), "", GetText.tr("&7&oRestores &b&o") + "9.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {new ItemStack(Material.BREAD), getItem("BACON"), getItem("MAYO"), getItem("TOMATO"), getItem("LETTUCE"), null, null, null, null},
        19)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("TACO", "98ced74a22021a535f6bce21c8c632b273dc2d9552b71a38d57269b3538cf", GetText.tr("&rTaco"), "", GetText.tr("&7&oRestores &b&o") + "9.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CORNMEAL"), new ItemStack(Material.COOKED_BEEF), getItem("LETTUCE"), getItem("TOMATO"), getItem("CHEESE"), null, null, null, null},
        18)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("FISH_TACO", "98ced74a22021a535f6bce21c8c632b273dc2d9552b71a38d57269b3538cf", GetText.tr("&rFish Taco"), "", GetText.tr("&7&oRestores &b&o") + "9.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CORNMEAL"), new ItemStack(Material.COOKED_COD), getItem("LETTUCE"), getItem("TOMATO"), getItem("CHEESE"), null, null, null, null},
        18)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("STREET_TACO", "1ad7c0a04f1485c7a3ef261a48ee83b2f1aa701ab11f3fc911e0366a9b97e", GetText.tr("&rStreet Taco"), "", GetText.tr("&7&oRestores &b&o") + "9.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CORNMEAL"), new ItemStack(Material.COOKED_BEEF), getItem("CILANTRO"), getItem("ONION"), null, null, null, null, null},
        18)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("JAMMY_DODGER", "1d00dfb3a57c068a0cc7b624d8d8852070435d2634c0e5da9cbbab46174af0df", GetText.tr("&cJammy Dodger"), "", GetText.tr("&7&oRestores &b&o") + "5.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {null, getItem("BISCUIT"), null, null, getItem("RASPBERRY_JUICE"), null, null, getItem("BISCUIT"), null},
        10)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("PANCAKES", "347f4f5a74c6691280cd80e7148b49b2ce17dcf64fd55368627f5d92a976a6a8", GetText.tr("&rPancakes"), "", GetText.tr("&7&oRestores &b&o") + "6.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("WHEAT_FLOUR"), new ItemStack(Material.SUGAR), getItem("BUTTER"), new ItemStack(Material.EGG), new ItemStack(Material.EGG), null, null, null, null},
        12)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("BLUEBERRY_PANCAKES", "347f4f5a74c6691280cd80e7148b49b2ce17dcf64fd55368627f5d92a976a6a8", GetText.tr("&rBlueberry Pancakes"), "", GetText.tr("&7&oRestores &b&o") + "6.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("PANCAKES"), getItem("BLUEBERRY"), null, null, null, null, null, null, null},
        13)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("SWEET_BERRY_PANCAKES", "e44ca99e308a186b30281b2017c44189acafb591152f81feea96fecbe57", GetText.tr("&rSweet Berry Pancakes"), "", GetText.tr("&7&oRestores &b&o") + "6.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("PANCAKES"), new ItemStack(Material.SWEET_BERRIES), null, null, null, null, null, null, null},
        13)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("FRIES", "563b8aeaf1df11488efc9bd303c233a87ccba3b33f7fba9c2fecaee9567f053", GetText.tr("&rFries"), "", GetText.tr("&7&oRestores &b&o") + "6.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {new ItemStack(Material.POTATO), getItem("SALT"), null, null, null, null, null, null, null},
        12)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("POPCORN", "1497b147cfae52205597f72e3c4ef52512e9677020e4b4fa7512c3c6acdd8c1", GetText.tr("&rPopcorn"), "", GetText.tr("&7&oRestores &b&o") + "4.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CORN"), getItem("BUTTER"), null, null, null, null, null, null, null},
        8)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("SWEET_POPCORN", "1497b147cfae52205597f72e3c4ef52512e9677020e4b4fa7512c3c6acdd8c1", GetText.tr("&rPopcorn &7(Sweet)"), "", GetText.tr("&7&oRestores &b&o") + "6.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CORN"), getItem("BUTTER"), new ItemStack(Material.SUGAR), null, null, null, null, null, null},
        12)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("SALTY_POPCORN", "1497b147cfae52205597f72e3c4ef52512e9677020e4b4fa7512c3c6acdd8c1", GetText.tr("&rPopcorn &7(Salty)"), "", GetText.tr("&7&oRestores &b&o") + "6.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CORN"), getItem("BUTTER"), getItem("SALT"), null, null, null, null, null, null},
        12)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("SHEPARDS_PIE", "3418c6b0a29fc1fe791c89774d828ff63d2a9fa6c83373ef3aa47bf3eb79", GetText.tr("&rShepard's Pie"), "", GetText.tr("&7&oRestores &b&o") + "8.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CABBAGE"), new ItemStack(Material.CARROT), SlimefunItems.WHEAT_FLOUR, new ItemStack(Material.COOKED_BEEF), getItem("TOMATO"), null, null, null, null},
        16)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("CHICKEN_POT_PIE", "3418c6b0a29fc1fe791c89774d828ff63d2a9fa6c83373ef3aa47bf3eb79", GetText.tr("&rChicken Pot Pie"), "", GetText.tr("&7&oRestores &b&o") + "8.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {new ItemStack(Material.COOKED_CHICKEN), new ItemStack(Material.CARROT), SlimefunItems.WHEAT_FLOUR, new ItemStack(Material.POTATO), null, null, null, null, null},
        17)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("CHOCOLATE_CAKE", "9119fca4f28a755d37fbe5dcf6d8c3ef50fe394c1a7850bc7e2b71ee78303c4c", GetText.tr("&rChocolate Cake"), "", GetText.tr("&7&oRestores &b&o") + "8.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CHOCOLATE_BAR"), new ItemStack(Material.SUGAR), SlimefunItems.WHEAT_FLOUR, SlimefunItems.BUTTER, new ItemStack(Material.EGG), null, null, null, null},
        17)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("CREAM_COOKIE", "dfd71e20fc50abf0de2ef7decfc01ce27ad51955759e072ceaab96355f594f0", GetText.tr("&rCream Cookie"), "", GetText.tr("&7&oRestores &b&o") + "6.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CHOCOLATE_BAR"), new ItemStack(Material.SUGAR), SlimefunItems.WHEAT_FLOUR, SlimefunItems.BUTTER, SlimefunItems.HEAVY_CREAM, null, null, null, null},
        12)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("BLUEBERRY_MUFFIN", "83794c736fc76e45706830325b95969466d86f8d7b28fce8edb2c75e2ab25c", GetText.tr("&rBlueberry Muffin"), "", GetText.tr("&7&oRestores &b&o") + "6.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("BLUEBERRY"), new ItemStack(Material.SUGAR), SlimefunItems.WHEAT_FLOUR, SlimefunItems.BUTTER, SlimefunItems.HEAVY_CREAM, new ItemStack(Material.EGG), null, null, null},
        13)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("PUMPKIN_MUFFIN", "83794c736fc76e45706830325b95969466d86f8d7b28fce8edb2c75e2ab25c", GetText.tr("&rPumpkin Muffin"), "", GetText.tr("&7&oRestores &b&o") + "6.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {new ItemStack(Material.PUMPKIN), new ItemStack(Material.SUGAR), SlimefunItems.WHEAT_FLOUR, SlimefunItems.BUTTER, SlimefunItems.HEAVY_CREAM, new ItemStack(Material.EGG), null, null, null},
        13)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("CHOCOLATE_CHIP_MUFFIN", "83794c736fc76e45706830325b95969466d86f8d7b28fce8edb2c75e2ab25c", GetText.tr("&rChocolate Chip Muffin"), "", GetText.tr("&7&oRestores &b&o") + "6.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CHOCOLATE_BAR"), new ItemStack(Material.SUGAR), SlimefunItems.WHEAT_FLOUR, SlimefunItems.BUTTER, SlimefunItems.HEAVY_CREAM, new ItemStack(Material.EGG), null, null, null},
        13)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("BOSTON_CREAM_PIE", "dfd71e20fc50abf0de2ef7decfc01ce27ad51955759e072ceaab96355f594f0", GetText.tr("&rBoston Cream Pie"), "", GetText.tr("&7&oRestores &b&o") + "4.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {null, getItem("CHOCOLATE_BAR"), null, null, SlimefunItems.HEAVY_CREAM, null, null, getItem("BISCUIT"), null},
        9)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("HOT_DOG", "33f2d7d7a8b1b969142881eb5a87e737b5f75fb808b9a157adddb2c6aec382", GetText.tr("&rHot Dog"), "", GetText.tr("&7&oRestores &b&o") + "5.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {null, null, null, null, new ItemStack(Material.COOKED_PORKCHOP), null, null, new ItemStack(Material.BREAD), null},
        10)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("BACON_WRAPPED_CHEESE_FILLED_HOT_DOG", "33f2d7d7a8b1b969142881eb5a87e737b5f75fb808b9a157adddb2c6aec382", GetText.tr("&rBacon wrapped Cheese filled Hot Dog"), GetText.tr("&7&o\"When I chef\" - @Eyamaz"), "", GetText.tr("&7&oRestores &b&o") + "8.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("BACON"), getItem("HOT_DOG"), getItem("BACON"), null, getItem("CHEESE"), null, null, null, null},
        17)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("BBQ_BACON_WRAPPED_HOT_DOG", "33f2d7d7a8b1b969142881eb5a87e737b5f75fb808b9a157adddb2c6aec382", GetText.tr("&rBBQ Bacon wrapped Hot Dog"), GetText.tr("&7&o\"wanna talk about hot dogs?\" - @Pahimar"), "", GetText.tr("&7&oRestores &b&o") + "8.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("BACON"), getItem("HOT_DOG"), getItem("BACON"), null, getItem("BBQ_SAUCE"), null, null, null, null},
        17)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("BBQ_DOUBLE_BACON_WRAPPED_HOT_DOG_IN_A_TORTILLA_WITH_CHEESE", "33f2d7d7a8b1b969142881eb5a87e737b5f75fb808b9a157adddb2c6aec382", GetText.tr("&rBBQ Double Bacon wrapped Hot Dog in a Tortilla with Cheese"), GetText.tr("&7&o\"When I chef\" - @Eyamaz"), "", GetText.tr("&7&oRestores &b&o") + "10.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("BACON"), getItem("BBQ_SAUCE"), getItem("BACON"), getItem("BACON"), new ItemStack(Material.COOKED_PORKCHOP), getItem("BACON"), getItem("CORNMEAL"), getItem("CHEESE"), getItem("CORNMEAL")},
        20)
        .register(plugin);

        new CustomFood(drinks, new SlimefunItemStack("SWEETENED_TEA", "d8e94ddd769a5bea748376b4ec7383fd36d267894d7c3bee011e8e4f5fcd7", GetText.tr("&aSweetened Tea"), "", GetText.tr("&7&oRestores &b&o") + "3.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("TEA_LEAF"), new ItemStack(Material.SUGAR), null, null, null, null, null, null, null},
        6)
        .register(plugin);

        new CustomFood(drinks, new SlimefunItemStack("HOT_CHOCOLATE", "411511bdd55bcb82803c8039f1c155fd43062636e23d4d46c4d761c04d22c2", GetText.tr("&6Hot Chocolate"), "", GetText.tr("&7&oRestores &b&o") + "4.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CHOCOLATE_BAR"), SlimefunItems.HEAVY_CREAM, null, null, null, null, null, null, null},
        8)
        .register(plugin);

        new CustomFood(drinks, new SlimefunItemStack("PINACOLADA", "2a8f1f70e85825607d28edce1a2ad4506e732b4a5345a5ea6e807c4b313e88", GetText.tr("&6Pinacolada"), "", GetText.tr("&7&oRestores &b&o") + "7.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("PINEAPPLE"), getItem("ICE_CUBE"), getItem("COCONUT_MILK"), null, null, null, null, null, null},
        14)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("CHOCOLATE_STRAWBERRY", "6d4ed7c73ac2853dfcaa9ca789fb18da1d47b17ad68b2da748dbd11de1a49ef", GetText.tr("&cChocolate Strawberry"), "", GetText.tr("&7&oRestores &b&o") + "2.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CHOCOLATE_BAR"), getItem("STRAWBERRY"), null, null, null, null, null, null, null},
        5)
        .register(plugin);

        new Juice(drinks, new SlimefunItemStack("LEMONADE", new CustomPotion(GetText.tr("&eLemonade"), Color.YELLOW, new PotionEffect(PotionEffectType.SATURATION, 8, 0), "", GetText.tr("&7&oRestores &b&o") + "4.0" + GetText.tr(" &7&oHunger"))), RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {getItem("LEMON_JUICE"), new ItemStack(Material.SUGAR), null, null, null, null, null, null, null})
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("SWEET_POTATO_PIE", "3418c6b0a29fc1fe791c89774d828ff63d2a9fa6c83373ef3aa47bf3eb79", GetText.tr("&rSweet Potato Pie"), "", GetText.tr("&7&oRestores &b&o") + "6.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("SWEET_POTATO"), new ItemStack(Material.EGG), SlimefunItems.HEAVY_CREAM, SlimefunItems.WHEAT_FLOUR, null, null, null, null, null},
        13)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("LAMINGTON", "9119fca4f28a755d37fbe5dcf6d8c3ef50fe394c1a7850bc7e2b71ee78303c4c", GetText.tr("&rLamington"), "", GetText.tr("&7&oRestores &b&o") + "9.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CHOCOLATE_BAR"), new ItemStack(Material.SUGAR), SlimefunItems.WHEAT_FLOUR, SlimefunItems.BUTTER, getItem("COCONUT"), null, null, null, null},
        18)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("WAFFLES", "347f4f5a74c6691280cd80e7148b49b2ce17dcf64fd55368627f5d92a976a6a8", GetText.tr("&rWaffles"), "", GetText.tr("&7&oRestores &b&o") + "6.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("WHEAT_FLOUR"), new ItemStack(Material.EGG), new ItemStack(Material.SUGAR), getItem("BUTTER"), null, null, null, null, null},
        12)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("CLUB_SANDWICH", "a14216d10714082bbe3f412423e6b19232352f4d64f9aca3913cb46318d3ed", GetText.tr("&rClub Sandwich"), "", GetText.tr("&7&oRestores &b&o") + "9.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {new ItemStack(Material.BREAD), getItem("MAYO"), getItem("BACON"), getItem("TOMATO"), getItem("LETTUCE"), getItem("MUSTARD"), null, null, null},
        19)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("BURRITO", "a387a621e266186e60683392eb274ebb225b04868ab959177d9dc181d8f286", GetText.tr("&rBurrito"), "", GetText.tr("&7&oRestores &b&o") + "9.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CORNMEAL"), new ItemStack(Material.COOKED_BEEF), getItem("LETTUCE"), getItem("TOMATO"), getItem("HEAVY_CREAM"), getItem("CHEESE"), null, null, null},
        18)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("CHICKEN_BURRITO", "a387a621e266186e60683392eb274ebb225b04868ab959177d9dc181d8f286", GetText.tr("&rChicken Burrito"), "", GetText.tr("&7&oRestores &b&o") + "9.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CORNMEAL"), new ItemStack(Material.COOKED_CHICKEN), getItem("LETTUCE"), getItem("TOMATO"), getItem("HEAVY_CREAM"), getItem("CHEESE"), null, null, null},
        18)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("GRILLED_SANDWICH", "baee84d19c85aff796c88abda21ec4c92c655e2d67b72e5e77b5aa5e99ed", GetText.tr("&rGrilled Sandwich"), "", GetText.tr("&7&oRestores &b&o") + "5.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {new ItemStack(Material.BREAD), new ItemStack(Material.COOKED_PORKCHOP), getItem("CHEESE"), null, null, null, null, null, null},
        11)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("LASAGNA", "03a3574a848f36ae37121e9058aa61c12a261ee5a3716f6d8269e11e19e37", GetText.tr("&rLasagna"), "", GetText.tr("&7&oRestores &b&o") + "8.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("TOMATO"), getItem("CHEESE"), SlimefunItems.WHEAT_FLOUR, getItem("TOMATO"), getItem("CHEESE"), new ItemStack(Material.COOKED_BEEF), null, null, null},
        17)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("ICE_CREAM", "95366ca17974892e4fd4c7b9b18feb11f05ba2ec47aa5035c81a9533b28", GetText.tr("&rIce Cream"), "", GetText.tr("&7&oRestores &b&o") + "8.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("HEAVY_CREAM"), getItem("ICE_CUBE"), new ItemStack(Material.SUGAR), new ItemStack(Material.COCOA_BEANS), getItem("STRAWBERRY"), null, null, null, null},
        16)
        .register(plugin);

        new Juice(drinks, new SlimefunItemStack("PINEAPPLE_JUICE", new CustomPotion(GetText.tr("&6Pineapple Juice"), Color.ORANGE, new PotionEffect(PotionEffectType.SATURATION, 6, 0), "", GetText.tr("&7&oRestores &b&o") + "3.0" + GetText.tr(" &7&oHunger"))), RecipeType.JUICER,
        new ItemStack[] {getItem("PINEAPPLE"), null, null, null, null, null, null, null, null})
        .register(plugin);

        new Juice(drinks, new SlimefunItemStack("PINEAPPLE_SMOOTHIE", new CustomPotion(GetText.tr("&6Pineapple Smoothie"), Color.ORANGE, new PotionEffect(PotionEffectType.SATURATION, 10, 0), "", GetText.tr("&7&oRestores &b&o") + "5.0" + GetText.tr(" &7&oHunger"))), RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[] {getItem("PINEAPPLE_JUICE"), getItem("ICE_CUBE"), null, null, null, null, null, null, null})
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("TIRAMISU", "169091d288022c7b0eb6d3e3f44b0fea7f2c069f497491a1dcab587eb1d56d4", GetText.tr("&rTiramisu"), "", GetText.tr("&7&oRestores &b&o") + "8.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("HEAVY_CREAM"), new ItemStack(Material.EGG), new ItemStack(Material.SUGAR), new ItemStack(Material.COCOA_BEANS), new ItemStack(Material.EGG), null, null, null, null},
        16)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("TIRAMISU_WITH_STRAWBERRIES", "169091d288022c7b0eb6d3e3f44b0fea7f2c069f497491a1dcab587eb1d56d4", GetText.tr("&rTiramisu with Strawberries"), "", GetText.tr("&7&oRestores &b&o") + "9.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("TIRAMISU"), getItem("STRAWBERRY"), null, null, null, null, null, null, null},
        18)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("TIRAMISU_WITH_RASPBERRIES", "169091d288022c7b0eb6d3e3f44b0fea7f2c069f497491a1dcab587eb1d56d4", GetText.tr("&rTiramisu with Raspberries"), "", GetText.tr("&7&oRestores &b&o") + "9.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("TIRAMISU"), getItem("RASPBERRY"), null, null, null, null, null, null, null},
        18)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("TIRAMISU_WITH_BLACKBERRIES", "169091d288022c7b0eb6d3e3f44b0fea7f2c069f497491a1dcab587eb1d56d4", GetText.tr("&rTiramisu with Blackberries"), "", GetText.tr("&7&oRestores &b&o") + "9.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("TIRAMISU"), getItem("BLACKBERRY"), null, null, null, null, null, null, null},
        18)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("CHOCOLATE_PEAR_CAKE", "9119fca4f28a755d37fbe5dcf6d8c3ef50fe394c1a7850bc7e2b71ee78303c4c", GetText.tr("&rChocolate Pear Cake"), "", GetText.tr("&7&oRestores &b&o") + "9.5" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("CHOCOLATE_BAR"), new ItemStack(Material.SUGAR), SlimefunItems.WHEAT_FLOUR, SlimefunItems.BUTTER, getItem("PEAR"), new ItemStack(Material.EGG), null, null, null},
        19)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("APPLE_PEAR_CAKE", "3418c6b0a29fc1fe791c89774d828ff63d2a9fa6c83373ef3aa47bf3eb79", GetText.tr("&cApple Pear Cake"), "", GetText.tr("&7&oRestores &b&o") + "9.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("OAK_APPLE"), new ItemStack(Material.SUGAR), SlimefunItems.WHEAT_FLOUR, SlimefunItems.BUTTER, getItem("PEAR"), new ItemStack(Material.EGG), null, null, null},
        18)
        .register(plugin);

        new CustomFood(food, new SlimefunItemStack("STUFFED_RED_BELL_PEPPER", "b6c98b410123b0944422303798fc2db8cea0feeb09d0da40f5361b59498f3e8b", GetText.tr("&cStuffed Red Bell Pepper"), "", GetText.tr("&7&oRestores &b&o") + "7.0" + GetText.tr(" &7&oHunger")),
        new ItemStack[] {getItem("RED_BELL_PEPPER"), getItem("ONION"), getItem("GARLIC"), getItem("TOMATO"), null, null, null, null, null},
        14)
        .register(plugin);

    }
    
    @Nullable
    private static ItemStack getItem(@Nonnull String id) {
        SlimefunItem item = SlimefunItem.getById(id);
        return item != null ? item.getItem() : null;
    }
}
