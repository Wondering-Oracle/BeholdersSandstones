package com.silicateseer.beholderssandstones;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;

public class BSStairsBlock extends StairsBlock{
	public BSStairsBlock(Block base) {
		super(base.getDefaultState(), FabricBlockSettings.copyOf(base));
	}
}
