package com.bubbaboogs.stackable_bundles;

import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;

@Modmenu(modId = "stackable_bundles")
@Config(name = "bundles-config", wrapperName = "BundlesConfig")
public class BundlesConfigModel {
    public int slotSize = 8;
}
