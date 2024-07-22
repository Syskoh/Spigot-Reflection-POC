package de.syskoh.reflectionsTest.listeners1;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerPickup(PlayerJoinEvent event){
        event.getPlayer().sendMessage("Hallo von PlayerJoinListener!");
    }
}
