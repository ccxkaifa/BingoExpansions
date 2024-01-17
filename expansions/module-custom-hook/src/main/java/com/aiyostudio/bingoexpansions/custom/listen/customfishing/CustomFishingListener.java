package com.aiyostudio.bingoexpansions.custom.listen.customfishing;

import com.aiyostudio.bingo.api.BingoApi;
import net.momirealms.customfishing.api.event.FishingResultEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

/**
 * @author Blank038
 */
public class CustomFishingListener implements Listener {

    @EventHandler(ignoreCancelled = true)
    public void onCustomFishing(FishingResultEvent event) {
        if (event.getResult() != FishingResultEvent.Result.SUCCESS) {
            return;
        }
        BingoApi.submit(event.getPlayer(), "custom_fishing_success", event.getLoot().getID(), 1);
    }
}
