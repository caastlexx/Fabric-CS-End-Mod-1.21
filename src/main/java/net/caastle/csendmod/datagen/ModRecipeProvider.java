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

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.VOIDIUM_CRYSTAL)
                .pattern(" # ")
                .pattern("#x#")
                .pattern(" # ")
                .input('#', ModItems.VOIDIUM_SHARD)
                .input('x', Items.ENDER_PEARL)
                .criterion(FabricRecipeProvider.hasItem(ModItems.VOIDIUM_CRYSTAL),
                        FabricRecipeProvider.conditionsFromItem(ModItems.VOIDIUM_CRYSTAL))
                .offerTo(exporter, Identifier.of(CaastleAndSnackman1sEndMod.MOD_ID, "voidium_crystal_from_shards"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.VOIDIUM_SWORD)
                .pattern(" # ")
                .pattern("###")
                .pattern(" x ")
                .input('#', ModItems.VOIDIUM_CRYSTAL)
                .input('x', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.VOIDIUM_CRYSTAL),
                        FabricRecipeProvider.conditionsFromItem(ModItems.VOIDIUM_CRYSTAL))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.VOIDIUM_PICKAXE)
                .pattern("###")
                .pattern(" x ")
                .pattern(" x ")
                .input('#', ModItems.VOIDIUM_CRYSTAL)
                .input('x', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.VOIDIUM_CRYSTAL),
                        FabricRecipeProvider.conditionsFromItem(ModItems.VOIDIUM_CRYSTAL))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.VOIDIUM_AXE)
                .pattern("#x#")
                .pattern("#x#")
                .pattern(" x ")
                .input('#', ModItems.VOIDIUM_CRYSTAL)
                .input('x', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.VOIDIUM_CRYSTAL),
                        FabricRecipeProvider.conditionsFromItem(ModItems.VOIDIUM_CRYSTAL))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.VOIDIUM_SHOVEL)
                .pattern("#")
                .pattern("x")
                .pattern("x")
                .input('#', ModItems.VOIDIUM_CRYSTAL)
                .input('x', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.VOIDIUM_CRYSTAL),
                        FabricRecipeProvider.conditionsFromItem(ModItems.VOIDIUM_CRYSTAL))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.VOIDIUM_HOE)
                .pattern("##")
                .pattern(" x")
                .pattern(" x")
                .input('#', ModItems.VOIDIUM_CRYSTAL)
                .input('x', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.VOIDIUM_CRYSTAL),
                        FabricRecipeProvider.conditionsFromItem(ModItems.VOIDIUM_CRYSTAL))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.VOIDIUM_HELMET)
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.VOIDIUM_CRYSTAL)
                .criterion(FabricRecipeProvider.hasItem(ModItems.VOIDIUM_CRYSTAL),
                        FabricRecipeProvider.conditionsFromItem(ModItems.VOIDIUM_CRYSTAL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.VOIDIUM_CHESTPLATE)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.VOIDIUM_CRYSTAL)
                .criterion(FabricRecipeProvider.hasItem(ModItems.VOIDIUM_CRYSTAL),
                        FabricRecipeProvider.conditionsFromItem(ModItems.VOIDIUM_CRYSTAL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.VOIDIUM_LEGGINGS)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.VOIDIUM_CRYSTAL)
                .criterion(FabricRecipeProvider.hasItem(ModItems.VOIDIUM_CRYSTAL),
                        FabricRecipeProvider.conditionsFromItem(ModItems.VOIDIUM_CRYSTAL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.VOIDIUM_BOOTS)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.VOIDIUM_CRYSTAL)
                .criterion(FabricRecipeProvider.hasItem(ModItems.VOIDIUM_CRYSTAL),
                        FabricRecipeProvider.conditionsFromItem(ModItems.VOIDIUM_CRYSTAL))
                .offerTo(exporter);
    }
}
