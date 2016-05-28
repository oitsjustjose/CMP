package com.clank.mod.events;

import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.clank.mod.CMP;
import com.clank.mod.items.RonaldItem;

public class RonaldGunEvent {
	@SubscribeEvent
	public void registerEvent(EntityInteractEvent event){
		if (event.target == null || !(event.target instanceof EntitySheep))
			return;
		
		EntitySheep sheep = (EntitySheep) event.target;
		EntityPlayer player = event.entityPlayer;
		
		if(!sheep.isChild())
			if (player.getHeldItem() != null){
				if(player.getHeldItem().getItem() instanceof RonaldItem ){
					
				--player.getHeldItem().stackSize;
				sheep.setFleeceColor(EnumDyeColor.RED);
				sheep.setCustomNameTag("Ronald");
			}
			}
	}
}
