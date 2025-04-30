package net.caastle.csendmod.util;


import net.caastle.csendmod.CaastleAndSnackman1sEndMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_VOIDIUM_TOOL = createTag( "needs_voidium_tool");
        public static final TagKey<Block> INCORRECT_FOR_VOIDIUM_TOOL = createTag("incorrect_for_voidium_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(CaastleAndSnackman1sEndMod.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(CaastleAndSnackman1sEndMod.MOD_ID, name));
        }
    }
}
