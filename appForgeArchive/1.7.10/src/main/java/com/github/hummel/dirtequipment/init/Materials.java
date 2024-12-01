package com.github.hummel.dirtequipment.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@SuppressWarnings("WeakerAccess")
public class Materials {
	public static final ItemArmor.ArmorMaterial DIRT_ARMOR;
	public static final Item.ToolMaterial DIRT_TOOL;

	private Materials() {
	}

	static {
		DIRT_ARMOR = EnumHelper.addArmorMaterial("dirt", 2.5, new int[]{1, 1, 1, 1}, 1);
		DIRT_ARMOR.customCraftingMaterial = new ItemStack(Blocks.dirt).getItem();
		DIRT_TOOL = EnumHelper.addToolMaterial("dirt", 0, 29, 3.0f, 1.0f, 1);
		DIRT_TOOL.setRepairItem(new ItemStack(Blocks.dirt));
	}
}
