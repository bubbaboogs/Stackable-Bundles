package com.bubbaboogs.stackable_bundles;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Stackable_bundles implements ModInitializer {
    public static final String MOD_ID = "stackable_bundles";
    public static final Logger LOGGER = LoggerFactory.getLogger("stackable_bundles");
    public static final com.bubbaboogs.stackable_bundles.BundlesConfig CONFIG = com.bubbaboogs.stackable_bundles.BundlesConfig.createAndLoad();

    @Override
    public void onInitialize() {
        LOGGER.info(MOD_ID + " is loaded!");
    }
}
