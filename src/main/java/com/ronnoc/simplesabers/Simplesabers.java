package com.ronnoc.simplesabers;

import com.ronnoc.simplesabers.stuffs.LightsaberMaterial;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class Simplesabers implements ModInitializer {

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
	public static final Block BLUE_CRYSTAL_BLOCK = new Block(FabricBlockSettings.of(Material.AMETHYST).luminance(3));

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
		Registry.register(Registry.ITEM, new Identifier("simplesabers", "white_lightsaber"), WHITE_LIGHTSABER);

		Registry.register(Registry.BLOCK, new Identifier("simplesabers", "blue_crystal_block"), BLUE_CRYSTAL_BLOCK);

		Registry.register(Registry.ITEM, new Identifier("simplesabers", "blue_crystal_block"),
				new BlockItem(BLUE_CRYSTAL_BLOCK, new FabricItemSettings().group(Simplesabers.simple_sabers)));
	}
}
