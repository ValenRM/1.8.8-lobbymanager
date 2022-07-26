package me.dev.lobbymanager.listeners;

import me.dev.lobbymanager.command_cooldown.LobbyCommandCooldown;
import me.dev.lobbymanager.command_cooldown.RankGUICooldown;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerLeaveListener implements Listener {
    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        e.setQuitMessage("");
        LobbyCommandCooldown.removeCooldown(p);
        RankGUICooldown.removeCooldown(p);
    }
}
