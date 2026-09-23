package com.slimmyslabby.rftl;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.init.Items;

@Mod(modid=RFTL.MODID, name=RFTL.NAME, version=RFTL.VERSION)
public class RFTL {
    
    public static final String MODID = "rftl";
    public static final String NAME = "Rotten Flesh to Leather";
    public static final String VERSION = "1.1";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        final FurnaceRecipes furnaceRecipeManager = FurnaceRecipes.instance();

        final ItemStack input = new ItemStack(Items.ROTTEN_FLESH, 1);
        final ItemStack output = new ItemStack(Items.LEATHER, 1);
        final float xp = 0.1f;

        furnaceRecipeManager.addSmeltingRecipe(input, output, xp);
    }

}
