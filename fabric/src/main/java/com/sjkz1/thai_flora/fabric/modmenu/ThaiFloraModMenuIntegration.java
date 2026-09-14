package com.sjkz1.thai_flora.fabric.modmenu;

import com.sjkz1.thai_flora.config.ThaiFloraConfig;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.shedaniel.autoconfig.AutoConfigClient;

public class ThaiFloraModMenuIntegration implements ModMenuApi
{
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory()
    {
        return parent -> AutoConfigClient.getConfigScreen(ThaiFloraConfig.class, parent).get();
    }
}
