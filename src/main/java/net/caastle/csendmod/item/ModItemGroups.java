package net.caastle.csendmod.item;

import net.caastle.csendmod.CaastleAndSnackman1sEndMod;
import net.caastle.csendmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup THE_VOID_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CaastleAndSnackman1sEndMod.MOD_ID, "the_void"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.VOIDIUM_SHARD))
                    .displayName(Text.translatable("itemgroup.csendmod.the_void"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.VOIDIUM_SHARD);
                        entries.add(ModItems.VOIDIUM_CRYSTAL);

                        entries.add(ModBlocks.VOIDIUM_BLOCK);
                        entries.add(ModBlocks.VOIDIUM_ORE);

                        entries.add(ModItems.VOIDIUM_HELMET);
                        entries.add(ModItems.VOIDIUM_CHESTPLATE);
                        entries.add(ModItems.VOIDIUM_LEGGINGS);
                        entries.add(ModItems.VOIDIUM_BOOTS);

                        entries.add(ModItems.VOIDIUM_SWORD);
                        entries.add(ModItems.VOIDIUM_PICKAXE);
                        entries.add(ModItems.VOIDIUM_AXE);
                        entries.add(ModItems.VOIDIUM_SHOVEL);
                        entries.add(ModItems.VOIDIUM_HOE);
                    }).build());

    public static void registerItemGroups() {
        CaastleAndSnackman1sEndMod.LOGGER.info("Registering Item Groups for " + CaastleAndSnackman1sEndMod.MOD_ID);
    }
}
