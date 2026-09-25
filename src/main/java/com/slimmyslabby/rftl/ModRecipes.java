package com.slimmyslabby.rftl;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class ModRecipes {

    public static void addSmeltingRecipes() {
        final FurnaceRecipes furnaceRecipeManager = FurnaceRecipes.instance();
        final ItemStack input = new ItemStack(Items.ROTTEN_FLESH, 1);
        final ItemStack output = new ItemStack(Items.LEATHER, 1);
        final float xp = 0.1f;
        furnaceRecipeManager.addSmeltingRecipe(input, output, xp);
    }
}
