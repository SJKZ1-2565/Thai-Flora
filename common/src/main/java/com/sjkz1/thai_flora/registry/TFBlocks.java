package com.sjkz1.thai_flora.registry;

import com.sjkz1.thai_flora.ThaiFlora;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class TFBlocks
{
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(
                    ThaiFlora.MOD_ID,
                    Registries.BLOCK
            );

    public static final RegistrySupplier<Block> LEMONGRASS_BLOCK =
            BLOCKS.register("lemongrass_block", () -> {
                ResourceKey<Block> key = ResourceKey.create(
                        Registries.BLOCK,
                        Identifier.fromNamespaceAndPath(
                                ThaiFlora.MOD_ID,
                                "lemongrass_block"
                        )
                );

                return new Block(
                        BlockBehaviour.Properties.of()
                                .strength(1.0F)
                                .setId(key)
                );
            });

    private TFBlocks() {
    }

    public static void register() {
        BLOCKS.register();
    }
}
