package de.syskoh.reflectionsTest.listeners2;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.ItemDisplay;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerInteractListener implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event){
        event.getPlayer().sendMessage("Hallo vom Interact Event: " + event.getAction());


        if(event.getAction() == Action.RIGHT_CLICK_BLOCK){
            Location loc = event.getClickedBlock().getLocation().add(0.5,1.5,0.5);
            Material mat = event.getClickedBlock().getType();
            ItemDisplay itemDisplay = loc.getWorld().spawn(loc, ItemDisplay.class);
            itemDisplay.setItemStack(new ItemStack(mat));

        }
    }
}
