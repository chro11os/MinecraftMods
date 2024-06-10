package com.arrow.item;

import com.arrow.explodingArrow;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class modItem {
    public static final Item ExplodingArrow = registerItem("exp", new Item(new FabricItemSettings()));

    private static void addItemsToIngridientsItemGroup(FabricItemGroupEntries entries) {
        entries.add(ExplodingArrow);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(explodingArrow.MOD_ID, name), item);
    }

    public static void registermodItem() {
        explodingArrow.LOGGER.info("Registering Items " + explodingArrow.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(modItem::addItemsToIngridientsItemGroup);

    }
}
