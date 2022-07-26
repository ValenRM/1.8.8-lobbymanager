package me.dev.lobbymanager.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class PlayerDamageListener implements Listener {
    @EventHandler
    public void onPlayerDamageReceived(EntityDamageEvent e) {
        if (e.getEntityType() == EntityType.PLAYER) {
            e.setCancelled(true);
        }
    }
}
