package com.clank.mod.client;

import java.util.ArrayList;
import java.util.List;

import com.clank.mod.CMP;
import com.clank.mod.CommonProxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ClientProxy extends CommonProxy
{
	@SideOnly(Side.CLIENT)
	private static void register(Item item, String customName)
	{
		int meta = 0;

		List<ItemStack> subItems = new ArrayList<ItemStack>();
		item.getSubItems(item, CreativeTabs.tabMisc, subItems);
		for (ItemStack sub : subItems)
		{
			String name = item.getUnlocalizedName(sub).substring(CMP.MODID.length() + 5).toLowerCase();
			ModelBakery.registerItemVariants(item, new ResourceLocation(CMP.MODID.toLowerCase(), name));
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(CMP.MODID.toLowerCase() + ":" + name, "inventory"));
			meta++;
		}
	}
}
