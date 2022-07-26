package me.dev.lobbymanager.listeners;

import me.dev.lobbymanager.LobbyManager;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class PlayerJoinListener implements Listener {
    Plugin plugin = LobbyManager.getPlugin();
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (p.hasPlayedBefore()) {
            e.setJoinMessage("");
            p.teleport((Location) plugin.getConfig().get("spawn.location"));
            p.sendMessage(ChatColor.DARK_GREEN + "Bienvenido nuevamente, " + ChatColor.YELLOW + p.getName() + ChatColor.DARK_GREEN + "!");
        } else {
            e.setJoinMessage("");
            p.teleport((Location) plugin.getConfig().get("spawn.location"));
            p.getServer().broadcastMessage(ChatColor.YELLOW + p.getName() + ChatColor.DARK_GREEN + " acaba de unirse por primera vez a la comunidad!");
        }
    }
}
