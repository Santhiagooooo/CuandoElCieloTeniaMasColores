
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cuandoelcieloteniamascolore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.cuandoelcieloteniamascolore.CuandoElCieloTeniaMasColoreMod;

public class CuandoElCieloTeniaMasColoreModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CuandoElCieloTeniaMasColoreMod.MODID);
	public static final RegistryObject<CreativeModeTab> CETMC = REGISTRY.register("cetmc",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.cuando_el_cielo_tenia_mas_colore.cetmc")).icon(() -> new ItemStack(Blocks.POINTED_DRIPSTONE)).displayItems((parameters, tabData) -> {
				tabData.accept(CuandoElCieloTeniaMasColoreModBlocks.EJEMPLO.get().asItem());
				tabData.accept(CuandoElCieloTeniaMasColoreModBlocks.AAAAAAAAA.get().asItem());
			})

					.build());
}
