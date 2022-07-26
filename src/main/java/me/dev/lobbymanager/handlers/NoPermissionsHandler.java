package me.dev.lobbymanager.handlers;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class NoPermissionsHandler {
    public static void NoPermissions(Player player) {
        player.sendMessage(ChatColor.RED + "No tienes permisos para ejecutar este comando.");
    }
}
