package com.lindgrei.lindmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab LINDMOD_TAB = new CreativeModeTab("lindModTab"){
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(ModItems.TITANIUM_INGOT.get());

        }
    };
}
