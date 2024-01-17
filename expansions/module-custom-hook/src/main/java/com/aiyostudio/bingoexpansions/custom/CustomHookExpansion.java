package com.aiyostudio.bingoexpansions.custom;

import com.aiyostudio.bingo.Bingo;
import com.aiyostudio.bingoexpansions.custom.listen.customcrops.CustomCropsListener;
import com.aiyostudio.bingoexpansions.custom.listen.customfishing.CustomFishingListener;
import com.aiyostudio.bingo.service.IModelService;
import com.aystudio.core.bukkit.plugin.AyPlugin;
import org.bukkit.Bukkit;

/**
 * @author Blank038
 */
public class CustomHookExpansion extends AyPlugin {

    @Override
    public void onEnable() {
        if (Bukkit.getPluginManager().getPlugin("CustomCrops") != null) {
            Bukkit.getPluginManager().registerEvents(new CustomCropsListener(), this);
        }
        if (Bukkit.getPluginManager().getPlugin("CustomFishing") != null) {
            Bukkit.getPluginManager().registerEvents(new CustomFishingListener(), this);
        }
    }
}
