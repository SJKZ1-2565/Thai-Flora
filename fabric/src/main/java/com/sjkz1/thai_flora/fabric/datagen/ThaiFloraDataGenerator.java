package com.sjkz1.thai_flora.fabric.datagen;

import com.sjkz1.thai_flora.fabric.datagen.provider.TFModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ThaiFloraDataGenerator implements DataGeneratorEntrypoint
{
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator dataGenerator)
    {
        var pack = dataGenerator.createPack();
        pack.addProvider(TFModelProvider::new);
    }
}
