package io.github.thebusybiscuit.exoticgarden;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

public final class ExoticGardenRecipeTypes {

    private ExoticGardenRecipeTypes() {}

    public static final RecipeType KITCHEN = new RecipeType(new NamespacedKey(ExoticGarden.instance, "kitchen"), new SlimefunItemStack("KITCHEN", Material.CAULDRON, "&e廚房(Kitchen)"), "", "&r該物品必須在廚房裡製作");
    public static final RecipeType BREAKING_GRASS = new RecipeType(new NamespacedKey(ExoticGarden.instance, "breaking_grass"), new CustomItemStack(Material.GRASS, "&7破壞雜草"));
    public static final RecipeType HARVEST_TREE = new RecipeType(new NamespacedKey(ExoticGarden.instance, "harvest_tree"), new CustomItemStack(Material.OAK_LEAVES, "&a採收一棵樹", "", "&r可以通過種植特定樹木", "&r來獲得該物品"));
    public static final RecipeType HARVEST_BUSH = new RecipeType(new NamespacedKey(ExoticGarden.instance, "harvest_bush"), new CustomItemStack(Material.OAK_LEAVES, "&a採收一株灌木", "", "&r你可以通過種植特定灌木叢", "&r來獲得該物品"));

}
