package com.aiyostudio.bingoexpansions.custom.listen.customcrops;

import com.aiyostudio.bingo.api.BingoApi;
import net.momirealms.customcrops.api.event.CropBreakEvent;
import net.momirealms.customcrops.api.event.CropPlantEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

/**
 * @author Blank038
 */
public class CustomCropsListener implements Listener {

    @EventHandler(ignoreCancelled = true)
    public void onCropPlant(CropPlantEvent event) {
        BingoApi.submit(event.getPlayer(), "custom_crops_plant", event.getCropKey(), 1);
    }

    @EventHandler(ignoreCancelled = true)
    public void onCropBreak(CropBreakEvent event) {
        if (event.getEntity() instanceof Player) {
            BingoApi.submit((Player) event.getEntity(), "custom_crops_break", event.getCropKey(), 1);
        }
    }
}
