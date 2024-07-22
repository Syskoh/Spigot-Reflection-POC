package de.syskoh.reflectionsTest.listeners2;

import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerJumpListener implements Listener {


    public void onPlayerJump(PlayerInteractEvent event){
        event.getPlayer().sendMessage("Hallo vom Interact Event: " + event.getAction());
    }
}
