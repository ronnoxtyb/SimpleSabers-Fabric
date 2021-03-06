package com.ronnoc.simplesabers;

import com.ronnoc.simplesabers.stuffs.LightsaberMaterial;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import com.ronnoc.simplesabers.stuffs.Blocks;

public class Simplesabers implements ModInitializer{

	public static final ItemGroup simple_sabers = FabricItemGroupBuilder.build(
			new Identifier("simplesabers", "simplesabers"),
			() -> new ItemStack(Simplesabers.KYBER_CRYSTAL_RED));



	//Crystals
	public static final Item KYBER_CRYSTAL_RED = new Item(new FabricItemSettings().group(Simplesabers.simple_sabers).rarity(Rarity.EPIC));
	public static final Item KYBER_CRYSTAL_BLUE = new Item(new FabricItemSettings().group(Simplesabers.simple_sabers).rarity(Rarity.EPIC));
	public static final Item KYBER_CRYSTAL_GREEN = new Item(new FabricItemSettings().group(Simplesabers.simple_sabers).rarity(Rarity.EPIC));
	public static final Item KYBER_CRYSTAL_PURPLE = new Item(new FabricItemSettings().group(Simplesabers.simple_sabers).rarity(Rarity.EPIC));
	public static final Item KYBER_CRYSTAL_YELLOW = new Item(new FabricItemSettings().group(Simplesabers.simple_sabers).rarity(Rarity.EPIC));
	public static final Item KYBER_CRYSTAL_WHITE = new Item(new FabricItemSettings().group(Simplesabers.simple_sabers).rarity(Rarity.EPIC));


	//Lightsabers
	public static ToolItem RED_LIGHTSABER = new SwordItem(LightsaberMaterial.INSTANCE, 4, -3F, new Item.Settings().group(Simplesabers.simple_sabers));
	public static ToolItem BLUE_LIGHTSABER = new SwordItem(LightsaberMaterial.INSTANCE, 4, -2.5F, new Item.Settings().group(Simplesabers.simple_sabers));
	public static ToolItem GREEN_LIGHTSABER = new SwordItem(LightsaberMaterial.INSTANCE, 0, -1.5F, new Item.Settings().group(Simplesabers.simple_sabers));
	public static ToolItem PURPLE_LIGHTSABER = new SwordItem(LightsaberMaterial.INSTANCE, 6, -3.5F, new Item.Settings().group(Simplesabers.simple_sabers));
	public static ToolItem YELLOW_LIGHTSABER = new SwordItem(LightsaberMaterial.INSTANCE, 2, -2F, new Item.Settings().group(Simplesabers.simple_sabers));
	public static ToolItem WHITE_LIGHTSABER = new SwordItem(LightsaberMaterial.INSTANCE, 0, -1F, new Item.Settings().group(Simplesabers.simple_sabers));



	//Blocks


	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("simplesabers", "kyber_crystal_red"), KYBER_CRYSTAL_RED);
		Registry.register(Registry.ITEM, new Identifier("simplesabers", "kyber_crystal_blue"), KYBER_CRYSTAL_BLUE);
		Registry.register(Registry.ITEM, new Identifier("simplesabers", "kyber_crystal_green"), KYBER_CRYSTAL_GREEN);
		Registry.register(Registry.ITEM, new Identifier("simplesabers", "kyber_crystal_purple"), KYBER_CRYSTAL_PURPLE);
		Registry.register(Registry.ITEM, new Identifier("simplesabers", "kyber_crystal_yellow"), KYBER_CRYSTAL_YELLOW);
		Registry.register(Registry.ITEM, new Identifier("simplesabers", "kyber_crystal_white"), KYBER_CRYSTAL_WHITE);

		Registry.register(Registry.ITEM, new Identifier("simplesabers", "red_lightsaber"), RED_LIGHTSABER);
		Registry.register(Registry.ITEM, new Identifier("simplesabers", "blue_lightsaber"), BLUE_LIGHTSABER);
		Registry.register(Registry.ITEM, new Identifier("simplesabers", "green_lightsaber"), GREEN_LIGHTSABER);
		Registry.register(Registry.ITEM, new Identifier("simplesabers", "purple_lightsaber"), PURPLE_LIGHTSABER);
		Registry.register(Registry.ITEM, new Identifier("simplesabers", "yellow_lightsaber"), YELLOW_LIGHTSABER);




		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.RED_ORE, RenderLayer.getCutout());
		Registry.register(Registry.BLOCK, new Identifier("simplesabers", "red_ore"), Blocks.RED_ORE);
		Registry.register(Registry.ITEM, new Identifier("simplesabers", "red_ore"),
				new BlockItem(Blocks.RED_ORE, new FabricItemSettings().group(simple_sabers)));

		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.BLUE_ORE, RenderLayer.getCutout());
		Registry.register(Registry.BLOCK, new Identifier("simplesabers", "blue_ore"), Blocks.BLUE_ORE);
		Registry.register(Registry.ITEM, new Identifier("simplesabers", "blue_ore"),
				new BlockItem(Blocks.BLUE_ORE, new FabricItemSettings().group(simple_sabers)));

		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.GREEN_ORE, RenderLayer.getCutout());
		Registry.register(Registry.BLOCK, new Identifier("simplesabers", "green_ore"), Blocks.GREEN_ORE);
		Registry.register(Registry.ITEM, new Identifier("simplesabers", "green_ore"),
				new BlockItem(Blocks.GREEN_ORE, new FabricItemSettings().group(simple_sabers)));


















	}
}
