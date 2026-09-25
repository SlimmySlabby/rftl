package com.slimmyslabby.rftl;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid=RottenFleshToLeather.MODID, name=RottenFleshToLeather.NAME, version=RottenFleshToLeather.VERSION)
public class RottenFleshToLeather {
    
    public static final String MODID = "rftl";
    public static final String NAME = "Rotten Flesh to Leather";
    public static final String VERSION = "1.2";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.addSmeltingRecipes();
    }
}
