package net.caastle.csendmod.item;

import net.caastle.csendmod.CaastleAndSnackman1sEndMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item VOIDIUM_SHARD = registerItem("voidium_shard", new Item(new Item.Settings()));
    public static final Item VOIDIUM_CRYSTAL = registerItem("voidium_crystal", new Item(new Item.Settings()));

    public static final Item VOIDIUM_HELMET = registerItem( "voidium_helmet", new Item(new Item.Settings()));
    public static final Item VOIDIUM_CHESTPLATE = registerItem( "voidium_chestplate", new Item(new Item.Settings()));
    public static final Item VOIDIUM_LEGGINGS = registerItem( "voidium_leggings", new Item(new Item.Settings()));
    public static final Item VOIDIUM_BOOTS = registerItem( "voidium_boots", new Item(new Item.Settings()));

    public static final Item VOIDIUM_SWORD = registerItem("voidium_sword",
            new SwordItem(ModToolMaterials.VOIDIUM_CRYSTAL, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.VOIDIUM_CRYSTAL, 5, -2.4f))));
    public static final Item VOIDIUM_PICKAXE = registerItem("voidium_pickaxe",
            new PickaxeItem(ModToolMaterials.VOIDIUM_CRYSTAL, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.VOIDIUM_CRYSTAL, 1, -2.8f))));
    public static final Item VOIDIUM_AXE = registerItem("voidium_axe",
            new AxeItem(ModToolMaterials.VOIDIUM_CRYSTAL, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.VOIDIUM_CRYSTAL, 6, -3.2f))));
    public static final Item VOIDIUM_SHOVEL = registerItem("voidium_shovel",
            new ShovelItem(ModToolMaterials.VOIDIUM_CRYSTAL, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.VOIDIUM_CRYSTAL, 1.5f, -3.0f))));
    public static final Item VOIDIUM_HOE = registerItem("voidium_hoe",
            new HoeItem(ModToolMaterials.VOIDIUM_CRYSTAL, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.VOIDIUM_CRYSTAL, 1.5f, -3.0f))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CaastleAndSnackman1sEndMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CaastleAndSnackman1sEndMod.LOGGER.info("Registering Mod Items for " + CaastleAndSnackman1sEndMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(VOIDIUM_SHARD);
           entries.add(VOIDIUM_CRYSTAL);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register( entries -> {
            entries.add(VOIDIUM_HELMET);
            entries.add(VOIDIUM_CHESTPLATE);
            entries.add(VOIDIUM_LEGGINGS);
            entries.add(VOIDIUM_BOOTS);

            entries.add(VOIDIUM_SWORD);
            entries.add(VOIDIUM_PICKAXE);
            entries.add(VOIDIUM_AXE);
            entries.add(VOIDIUM_SHOVEL);
            entries.add(VOIDIUM_HOE);
        });
    }
}
