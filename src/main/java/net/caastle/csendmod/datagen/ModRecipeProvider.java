package net.caastle.csendmod.datagen;

import net.caastle.csendmod.CaastleAndSnackman1sEndMod;
import net.caastle.csendmod.block.ModBlocks;
import net.caastle.csendmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.VOIDIUM_CRYSTAL, RecipeCategory.DECORATIONS, ModBlocks.VOIDIUM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.VOIDIUM_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.VOIDIUM_CRYSTAL)
                .criterion(hasItem(ModItems.VOIDIUM_CRYSTAL), conditionsFromItem(ModItems.VOIDIUM_CRYSTAL))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.VOIDIUM_CRYSTAL, 9)
                .input(ModBlocks.VOIDIUM_BLOCK)
                .criterion(hasItem(ModBlocks.VOIDIUM_BLOCK), conditionsFromItem(ModBlocks.VOIDIUM_BLOCK))
                .offerTo(exporter, Identifier.of(CaastleAndSnackman1sEndMod.MOD_ID, "voidium_crystal_from_voidium_block"));
    }
}
