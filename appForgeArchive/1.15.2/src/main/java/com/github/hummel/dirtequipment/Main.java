package com.github.hummel.dirtequipment;

import com.github.hummel.dirtequipment.init.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("dirtequipment")
public class Main {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "111229022024";

	public Main() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		Items.register(modEventBus);
	}
}