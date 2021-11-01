package com.silicateseer.beholderssandstones;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.SandBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class BeholdersSandstones implements ModInitializer {
	public static final String MODID = "beholderssandstones";
	
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	public static final Block CUT_SANDSTONE_WALL = register("cut_sandstone_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block SMOOTH_SANDSTONE_WALL = register("smooth_sandstone_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE)), ItemGroup.DECORATIONS);
	
	public static final Block CUT_RED_SANDSTONE_WALL = register("cut_red_sandstone_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.CUT_RED_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block SMOOTH_RED_SANDSTONE_WALL = register("smooth_red_sandstone_wall",
			new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_RED_SANDSTONE)), ItemGroup.DECORATIONS);

	public static final Block BLACK_SAND = register("black_sand",
			new SandBlock(14866662, FabricBlockSettings.of(Material.AGGREGATE, MapColor.IRON_GRAY).strength(0.5F).sounds(BlockSoundGroup.SAND)), ItemGroup.BUILDING_BLOCKS);
	public static final Block BLACK_SANDSTONE = register("black_sandstone",
			new Block(FabricBlockSettings.of(Material.STONE, MapColor.IRON_GRAY).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block BLACK_SANDSTONE_SLAB = register("black_sandstone_slab",
			new SlabBlock(FabricBlockSettings.copyOf(BLACK_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block BLACK_SANDSTONE_STAIRS = register("black_sandstone_stairs",
			new BSStairsBlock(BLACK_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block BLACK_SANDSTONE_WALL = register("black_sandstone_wall",
			new WallBlock(FabricBlockSettings.copyOf(BLACK_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block CUT_BLACK_SANDSTONE = register("cut_black_sandstone",
			new Block(FabricBlockSettings.of(Material.STONE, MapColor.IRON_GRAY).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CUT_BLACK_SANDSTONE_SLAB = register("cut_black_sandstone_slab",
			new SlabBlock(FabricBlockSettings.copyOf(CUT_BLACK_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block CUT_BLACK_SANDSTONE_WALL = register("cut_black_sandstone_wall",
			new WallBlock(FabricBlockSettings.copyOf(CUT_BLACK_SANDSTONE)), ItemGroup.DECORATIONS);
	public static final Block CHISELED_BLACK_SANDSTONE = register("chiseled_black_sandstone",
			new Block(FabricBlockSettings.of(Material.STONE, MapColor.IRON_GRAY).requiresTool().strength(0.8F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_BLACK_SANDSTONE = register("smooth_black_sandstone",
			new Block(FabricBlockSettings.of(Material.STONE, MapColor.IRON_GRAY).requiresTool().strength(2.0F, 6.0F)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_BLACK_SANDSTONE_SLAB = register("smooth_black_sandstone_slab",
			new SlabBlock(FabricBlockSettings.copyOf(SMOOTH_BLACK_SANDSTONE)), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_BLACK_SANDSTONE_STAIRS = register("smooth_black_sandstone_stairs",
			new BSStairsBlock(SMOOTH_BLACK_SANDSTONE), ItemGroup.BUILDING_BLOCKS);
	public static final Block SMOOTH_BLACK_SANDSTONE_WALL = register("smooth_black_sandstone_wall",
			new WallBlock(FabricBlockSettings.copyOf(SMOOTH_BLACK_SANDSTONE)), ItemGroup.DECORATIONS);
	
	public static final Block PRISMARINE_SAND = register("prismarine_sand",
			new SandBlock(6200996, FabricBlockSettings.of(Material.AGGREGATE, MapColor.CYAN).strength(0.5F).sounds(BlockSoundGroup.SAND)), ItemGroup.BUILDING_BLOCKS);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
	public static Block register(String name, Block block, ItemGroup tab) {
		Registry.register(Registry.BLOCK, new Identifier(BeholdersSandstones.MODID, name), block);
		BlockItem item = new BlockItem(block, new Item.Settings().group(tab));
		register(name, item);
		return block;
	}

	public static Item register(String name, Item item) {
		Registry.register(Registry.ITEM, new Identifier(BeholdersSandstones.MODID, name), item);
		return item;
	}
}
