package net.fabricmc.ankir;

import net.fabricmc.ankir.items.GuiItem;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

	private static Item GUI_ITEM = new GuiItem(new Item.Settings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {

		Registry.register(Registry.ITEM, new Identifier("mars", "gui_item"), GUI_ITEM);

		System.out.println("Hello Fabric world!");
	}
}
