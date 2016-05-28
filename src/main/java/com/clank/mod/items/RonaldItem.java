package com.clank.mod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class RonaldItem extends Item
{

	public RonaldItem()
	{
		this.setMaxStackSize(1);
		this.setUnlocalizedName("ronaldgun");
		this.setCreativeTab(CreativeTabs.tabMisc);
		
	}
}
