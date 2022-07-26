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
        String pName = e.getPlayer().getName();
        e.setQuitMessage("");
        LobbyCommandCooldown.removeCooldown(pName);
        RankGUICooldown.removeCooldown(pName);
    }
}
