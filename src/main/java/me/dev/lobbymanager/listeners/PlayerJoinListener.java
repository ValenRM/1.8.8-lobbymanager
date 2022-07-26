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
        Location loc = (Location) plugin.getConfig().get("spawn.location");
        if (loc == null) {
            p.sendMessage(ChatColor.RED + "La ubicacion de spawn predeterminada no fue especificada. Usa " + ChatColor.DARK_RED + "/setspawn" + ChatColor.RED + " para establecer una.");
            e.setJoinMessage("");
            return;
        }

        e.setJoinMessage("");
        p.teleport((Location) plugin.getConfig().get("spawn.location"));
        if (p.hasPlayedBefore()) {
            p.sendMessage(ChatColor.DARK_GREEN + "Bienvenido nuevamente, " + ChatColor.YELLOW + p.getName() + ChatColor.DARK_GREEN + "!");
        } else {
            p.getServer().broadcastMessage(ChatColor.YELLOW + p.getName() + ChatColor.DARK_GREEN + " acaba de unirse por primera vez a la comunidad!");
        }
    }
}
