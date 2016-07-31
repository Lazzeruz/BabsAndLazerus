package com.BabsAndLazerus.BabsLazerus.init;

import com.BabsAndLazerus.BabsLazerus.Reference;
import com.BabsAndLazerus.BabsLazerus.items.ItemSeaShell;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item SeaShell;
	
	public static void init() {
		SeaShell = new ItemSeaShell();
		
	}
	
	public static void register() {
		GameRegistry.register(SeaShell);
	}
	
	public static void registerRenders() {
		registerRender(SeaShell);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
