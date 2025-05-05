package net.caastle.csendmod.datagen;

import net.caastle.csendmod.block.ModBlocks;
import net.caastle.csendmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VOIDIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VOIDIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FENT_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.VOIDIUM_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.VOIDIUM_CRYSTAL, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.VOIDIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.VOIDIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.VOIDIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.VOIDIUM_BOOTS));

        itemModelGenerator.register(ModItems.VOIDIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.VOIDIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.VOIDIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.VOIDIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.VOIDIUM_HOE, Models.HANDHELD);

    }
}
