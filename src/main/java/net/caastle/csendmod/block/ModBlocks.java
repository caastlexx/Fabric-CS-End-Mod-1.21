package net.caastle.csendmod.block;

import net.caastle.csendmod.CaastleAndSnackman1sEndMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block VOIDIUM_BLOCK = registerBlock( "voidium_block",
        new Block(AbstractBlock.Settings.create().strength(3f)
                .sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block VOIDIUM_ORE = registerBlock("voidium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool()));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CaastleAndSnackman1sEndMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CaastleAndSnackman1sEndMod.MOD_ID, name),
        new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        CaastleAndSnackman1sEndMod.LOGGER.info("Registering Mod Blocks for " + CaastleAndSnackman1sEndMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.VOIDIUM_BLOCK);
            entries.add(ModBlocks.VOIDIUM_ORE);
        });
    }
}
