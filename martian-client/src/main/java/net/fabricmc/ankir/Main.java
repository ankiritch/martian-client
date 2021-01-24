package net.fabricmc.ankir;

import net.fabricmc.ankir.gui.ExampleGui;
import net.fabricmc.ankir.gui.ExampleScreen;
import net.fabricmc.ankir.items.GuiItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.options.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.lwjgl.glfw.GLFW;

public class Main implements ModInitializer {

	private static final Item GUI_ITEM = new GuiItem(new Item.Settings().group(ItemGroup.MISC));

	private static KeyBinding keyBinding;

	@Override
	public void onInitialize() {

		keyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
				"key.ankir.opengui", // The translation key of the keybinding's name
				InputUtil.Type.KEYSYM, // The type of the keybinding, KEYSYM for keyboard, MOUSE for mouse.
				GLFW.GLFW_KEY_K, // The keycode of the key
				"category.ankir.team_mars_client" // The translation key of the keybinding's category.
		));

		Registry.register(Registry.ITEM, new Identifier("mars", "gui_item"), GUI_ITEM);


		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			if (keyBinding.wasPressed()) {
				MinecraftClient.getInstance().openScreen(new ExampleScreen(new ExampleGui()));
			}
		});

		System.out.println("Hello Fabric world!");
	}
}
