package com.clank.mod.init;

import com.clank.mod.events.RonaldGunEvent;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class EventInit {
	public static void init(){
    	MinecraftForge.EVENT_BUS.register(new RonaldGunEvent());
	}
}
