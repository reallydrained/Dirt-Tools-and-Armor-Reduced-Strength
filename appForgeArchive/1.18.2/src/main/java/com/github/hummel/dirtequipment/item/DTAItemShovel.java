package com.github.hummel.dirtequipment.item;

import com.github.hummel.dirtequipment.material.DTAToolMaterials;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ShovelItem;

public class DTAItemShovel extends ShovelItem {
	public DTAItemShovel() {
		super(DTAToolMaterials.DIRT, 1.5f, -3.0f, new Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
