package com.sjkz1.thai_flora;

import com.sjkz1.thai_flora.config.ThaiFloraConfig;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ThaiFlora
{
    public static final String MOD_ID = "thai_flora";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static ThaiFloraConfig CONFIG;
    public static boolean DEBUG = false;

    public static void registerConfig()
    {
        AutoConfig.register(ThaiFloraConfig.class, GsonConfigSerializer::new);
        ThaiFlora.CONFIG = AutoConfig.getConfigHolder(ThaiFloraConfig.class).getConfig();
    }

    public static void init()
    {
    }
}
