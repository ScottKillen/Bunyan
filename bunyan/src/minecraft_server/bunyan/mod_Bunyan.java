/**
 * Copyright (c) Scott Killen, 2012
 * 
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license
 * located in /MMPL-1.0.txt
 */

package bunyan;

import java.util.Random;

import net.minecraft.src.World;
import net.minecraft.src.forge.NetworkMod;

/**
 * This class appears only to communicate with the mod loader.
 * Everything is delegated to {@link Bunyan.Bunyan}
 * 
 */
public class mod_Bunyan extends NetworkMod {

	@Override
	public boolean clientSideRequired() {
		return Bunyan.clientSideRequired();
	}

	@Override
	public void generateSurface(World world, Random random, int chunkX,
			int chunkZ)
	{
		Bunyan.onGenerateSurface(world, random, chunkX, chunkZ);
	}

	@Override
	public String getVersion() {
		return Bunyan.getVersion();
	}

	@Override
	public void load() {
		Bunyan.onLoad(this);
	}

	@Override
	public void modsLoaded() {
		Bunyan.onModsLoaded();
	}

}
