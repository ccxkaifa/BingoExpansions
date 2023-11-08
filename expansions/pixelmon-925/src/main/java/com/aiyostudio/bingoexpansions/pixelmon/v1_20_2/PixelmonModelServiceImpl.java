package com.aiyostudio.bingoexpansions.pixelmon.v1_20_2;

import com.aiyostudio.bingoexpansions.pixelmon.v1_20_2.listen.ForgeListener;
import com.aystudio.core.bukkit.plugin.AyPlugin;

/**
 * @author AiYo Studio
 * @since 1.0.0 - Blank038 - 2023-09-08
 */
public class PixelmonModelServiceImpl extends AyPlugin {

    @Override
    public void onEnable() {
        if (com.pixelmonmod.pixelmon.Pixelmon.getVersion().startsWith("9.2")) {
            ForgeListener.init();
            this.getLogger().info("- Expansion PixelmonLatestModelServiceImpl is loaded.");
        }
    }
}
