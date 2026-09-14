package com.sjkz1.thai_flora.neoforge;

import com.sjkz1.thai_flora.ThaiFlora;
import com.sjkz1.thai_flora.config.ThaiFloraConfig;
import me.shedaniel.autoconfig.AutoConfigClient;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(ThaiFlora.MOD_ID)
public final class ThaiFloraNeoForge
{
    public ThaiFloraNeoForge()
    {
        ThaiFlora.init();
        ThaiFlora.registerConfig();
        ModLoadingContext.get().registerExtensionPoint(IConfigScreenFactory.class, () -> (mc, screen) -> AutoConfigClient.getConfigScreen(ThaiFloraConfig.class, screen).get());
    }
}
