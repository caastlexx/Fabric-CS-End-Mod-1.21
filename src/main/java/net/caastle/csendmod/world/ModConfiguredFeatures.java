package net.caastle.csendmod.world;

import net.caastle.csendmod.CaastleAndSnackman1sEndMod;
import net.caastle.csendmod.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

import static net.caastle.csendmod.world.ModPlacedFeatures.registerKey;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> VOIDIUM_ORE_KEY = registerKey("voidium_ore");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        RuleTest endReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> voidiumOres =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.VOIDIUM_ORE.getDefaultState()));

        register(context, VOIDIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(voidiumOres, 3));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(CaastleAndSnackman1sEndMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
