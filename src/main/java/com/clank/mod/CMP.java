package com.clank.mod;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import com.clank.mod.events.RonaldGunEvent;
import com.clank.mod.init.BlockInit;
import com.clank.mod.init.EventInit;
import com.clank.mod.init.ItemInit;

@Mod(modid = CMP.MODID, version = CMP.VERSION)
public class CMP
{
	public static final String MODID = "CMP";
	public static final String VERSION = "1.0";

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		BlockInit.init();
		ItemInit.init();
		EventInit.init();

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
	}
}
