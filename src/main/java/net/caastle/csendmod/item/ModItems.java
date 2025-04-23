package net.caastle.csendmod.item;

import net.caastle.csendmod.CaastleAndSnackman1sEndMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item VOIDIUM_SHARD = registerItem("voidium_shard", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CaastleAndSnackman1sEndMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CaastleAndSnackman1sEndMod.LOGGER.info("Registering Mod Items for " + CaastleAndSnackman1sEndMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(VOIDIUM_SHARD);
        });
    }
}
