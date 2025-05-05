package net.caastle.csendmod;

import net.caastle.csendmod.item.ModItemGroups;
import net.caastle.csendmod.block.ModBlocks;
import net.caastle.csendmod.item.ModItems;
import net.caastle.csendmod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// test commit
// firstBlock
public class CaastleAndSnackman1sEndMod implements ModInitializer {
	public static final String MOD_ID = "csendmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();
	}
}