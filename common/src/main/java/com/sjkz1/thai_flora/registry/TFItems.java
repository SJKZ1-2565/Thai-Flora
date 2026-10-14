package com.sjkz1.thai_flora.registry;

import com.sjkz1.thai_flora.ThaiFlora;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class TFItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(
                    ThaiFlora.MOD_ID,
                    Registries.ITEM
            );

    public static final RegistrySupplier<BlockItem>
            LEMONGRASS_BLOCK_ITEM =
            ITEMS.register("lemongrass_block", () -> {
                ResourceKey<Item> key = ResourceKey.create(
                        Registries.ITEM,
                        Identifier.fromNamespaceAndPath(
                                ThaiFlora.MOD_ID,
                                "lemongrass_block"
                        )
                );

                return new BlockItem(
                        TFBlocks.LEMONGRASS_BLOCK.get(),
                        new Item.Properties()
                                .arch$tab(
                                        CreativeModeTabs.NATURAL_BLOCKS
                                )
                                .setId(key)
                );
            });

    private TFItems() {
    }

    public static void register() {
        ITEMS.register();
    }
}
