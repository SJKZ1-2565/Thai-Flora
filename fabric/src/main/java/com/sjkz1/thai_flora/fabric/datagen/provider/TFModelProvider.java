package com.sjkz1.thai_flora.fabric.datagen.provider;

import com.sjkz1.thai_flora.registry.TFBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;

public class TFModelProvider extends FabricModelProvider
{

    public TFModelProvider(FabricPackOutput output)
    {
        super(output);
    }

    @Override
    public String getName()
    {
        return "Thai Flora Models";
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators)
    {
        blockModelGenerators.createTrivialCube(TFBlocks.LEMONGRASS_BLOCK.get());
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators)
    {

    }
}
