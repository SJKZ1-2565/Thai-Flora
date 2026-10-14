package com.sjkz1.thai_flora.config;

import com.sjkz1.thai_flora.ThaiFlora;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = ThaiFlora.MOD_ID)
@Config.Gui.Background("minecraft:textures/block/cherry_planks.png")
public final class ThaiFloraConfig implements ConfigData
{
    @ConfigEntry.Category("hotbar")
    @ConfigEntry.Gui.TransitiveObject
    public General general;

    public ThaiFloraConfig()
    {
        this.general = new General();
    }

    public static class General
    {

    }
}
