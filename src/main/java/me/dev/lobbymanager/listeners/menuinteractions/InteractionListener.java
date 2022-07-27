package me.dev.lobbymanager.listeners.menuinteractions;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InteractionListener implements Listener {
    @EventHandler
    public void onPlayerInteraction(InventoryClickEvent e) {
        if (e.getClickedInventory() == null) return;
        if (ChatColor.stripColor(e.getClickedInventory().getName()).equalsIgnoreCase("rangos")) {
            RankGUIInteractionsListener.handleRankGUIInteractions(e);
        } else if (ChatColor.stripColor(e.getClickedInventory().getName()).equalsIgnoreCase("cohetes")) {
            FireworksGUIInteractionHandler.HandleFireworkGUI(e);
        }
    }
}
