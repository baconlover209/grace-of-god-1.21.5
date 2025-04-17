package net.dart.graceofgod.item;

import net.dart.graceofgod.GraceOfGod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GraceOfGod.MOD_ID,"pink_garnet")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM , Identifier.of(GraceOfGod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        GraceOfGod.LOGGER.info("Registering Mod Items For " + GraceOfGod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PINK_GARNET);
        });
    }
}
