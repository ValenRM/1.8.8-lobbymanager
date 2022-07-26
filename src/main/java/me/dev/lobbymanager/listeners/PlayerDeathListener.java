package me.dev.lobbymanager.listeners;

import me.dev.lobbymanager.LobbyManager;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.plugin.Plugin;

public class PlayerDeathListener implements Listener {
    Plugin plugin = LobbyManager.getPlugin();
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        e.setKeepLevel(true);
    }
    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent e) {
        e.setRespawnLocation((Location) plugin.getConfig().get("spawn.location"));
    }
}
