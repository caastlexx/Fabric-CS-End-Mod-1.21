package net.caastle.csendmod.datagen;

import net.caastle.csendmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {



        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.VOIDIUM_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.VOIDIUM_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.VOIDIUM_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.VOIDIUM_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.VOIDIUM_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.VOIDIUM_HELMET)
                .add(ModItems.VOIDIUM_CHESTPLATE)
                .add(ModItems.VOIDIUM_LEGGINGS)
                .add(ModItems.VOIDIUM_BOOTS);

        getOrCreateTagBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.VOIDIUM_HELMET)
                .add(ModItems.VOIDIUM_CHESTPLATE)
                .add(ModItems.VOIDIUM_LEGGINGS)
                .add(ModItems.VOIDIUM_BOOTS);

        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.VOIDIUM_HELMET)
                .add(ModItems.VOIDIUM_CHESTPLATE)
                .add(ModItems.VOIDIUM_LEGGINGS)
                .add(ModItems.VOIDIUM_BOOTS);
    }
}
