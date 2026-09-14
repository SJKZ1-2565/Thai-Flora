package com.sjkz1.thai_flora.fabric;

import com.sjkz1.thai_flora.ThaiFlora;
import net.fabricmc.api.ModInitializer;

public final class ThaiFloraFabric implements ModInitializer
{
    @Override
    public void onInitialize()
    {
        ThaiFlora.init();
        ThaiFlora.registerConfig();
    }
}
