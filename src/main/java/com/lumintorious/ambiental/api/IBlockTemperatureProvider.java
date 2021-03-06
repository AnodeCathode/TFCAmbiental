package com.lumintorious.ambiental.api;

import com.lumintorious.ambiental.modifiers.BlockModifier;
import com.lumintorious.ambiental.modifiers.ModifierStorage;

import net.dries007.tfc.util.climate.ITemperatureBlock;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;

// Add an example of this into TemperatureRegistry for blocks you didn't create personally
@FunctionalInterface
public interface IBlockTemperatureProvider extends ITemperatureProvider{
	public BlockModifier getModifier(IBlockState state, BlockPos blockPos, EntityPlayer player);
}
