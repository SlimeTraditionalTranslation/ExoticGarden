package io.github.thebusybiscuit.exoticgarden;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.mini2Dx.gettext.GetText;

public final class ExoticGardenRecipeTypes {

    private ExoticGardenRecipeTypes() {}

    public static final RecipeType KITCHEN = new RecipeType(new NamespacedKey(ExoticGarden.instance, "kitchen"), new SlimefunItemStack("KITCHEN", Material.CAULDRON, GetText.tr("&eKitchen")), "", GetText.tr("&rThis item must be made"), GetText.tr("&rin a Kitchen"));
    public static final RecipeType BREAKING_GRASS = new RecipeType(new NamespacedKey(ExoticGarden.instance, "breaking_grass"), new CustomItemStack(Material.GRASS, GetText.tr("&7Breaking Grass")));
    public static final RecipeType HARVEST_TREE = new RecipeType(new NamespacedKey(ExoticGarden.instance, "harvest_tree"), new CustomItemStack(Material.OAK_LEAVES, GetText.tr("&aHarvesting a Tree"), "", GetText.tr("&rYou can obtain this Item by"), GetText.tr("&rharvesting the shown Tree")));
    public static final RecipeType HARVEST_BUSH = new RecipeType(new NamespacedKey(ExoticGarden.instance, "harvest_bush"), new CustomItemStack(Material.OAK_LEAVES, GetText.tr("&aHarvesting a Bush"), "", GetText.tr("&rYou can obtain this Item by"), GetText.tr("&rharvesting the shown Bush")));

}
