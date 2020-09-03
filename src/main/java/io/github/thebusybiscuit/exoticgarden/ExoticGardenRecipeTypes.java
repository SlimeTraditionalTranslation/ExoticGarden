package io.github.thebusybiscuit.exoticgarden;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;

public final class ExoticGardenRecipeTypes {

    private ExoticGardenRecipeTypes() {}

    public static final RecipeType KITCHEN = new RecipeType(new NamespacedKey(ExoticGarden.instance, "kitchen"), new SlimefunItemStack("KITCHEN", Material.CAULDRON, "&e廚房(Kitchen)"), "", "&r該物品必須在廚房裡製作");
    public static final RecipeType BREAKING_GRASS = new RecipeType(new NamespacedKey(ExoticGarden.instance, "breaking_grass"), new CustomItem(Material.GRASS, "&7破壞雜草"));
    public static final RecipeType HARVEST_TREE = new RecipeType(new NamespacedKey(ExoticGarden.instance, "harvest_tree"), new CustomItem(Material.OAK_LEAVES, "&a採收一棵樹", "", "&r可以通過種植特定樹木", "&r來獲得該物品"));
    public static final RecipeType HARVEST_BUSH = new RecipeType(new NamespacedKey(ExoticGarden.instance, "harvest_bush"), new CustomItem(Material.OAK_LEAVES, "&a採收一株灌木", "", "&r你可以通過種植特定灌木叢", "&r來獲得該物品"));

}
