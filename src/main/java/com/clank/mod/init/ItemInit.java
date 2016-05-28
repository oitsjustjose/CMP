package com.clank.mod.init;

import com.clank.mod.items.RonaldItem;
import com.clank.mod.CMP;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemInit
{
	public static Item ronaldItem;

	public static void init()
	{
		// Item Initialization
		ronaldItem = new RonaldItem();
		GameRegistry.registerItem(ronaldItem, "RonaldItem");

		// Item Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(ronaldItem, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.name_tag));
	}
}
