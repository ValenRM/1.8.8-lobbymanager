package me.dev.lobbymanager.commands;

import me.dev.lobbymanager.LobbyManager;
import me.dev.lobbymanager.handlers.NoPermissionsHandler;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class SetSpawnCommand implements CommandExecutor {
    private Plugin plugin = LobbyManager.getPlugin();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("lobby.management.set.spawnlocation")) {
                Location pLoc = p.getLocation();
                plugin.getConfig().set("spawn.location", pLoc);
                plugin.saveConfig();

                p.sendMessage(ChatColor.GOLD + "[" + ChatColor.RED + "Lobby Manager" + ChatColor.GOLD + "] " + ChatColor.GREEN + "La ubicacion de spawn por defecto ha sido asignada en: " + ChatColor.RED + "World: " + ChatColor.GRAY + pLoc.getWorld().getName() + ChatColor.RED + ", X: " + ChatColor.GRAY + pLoc.getX() + ChatColor.RED + ", Y: " + ChatColor.GRAY + pLoc.getY() + ChatColor.RED + ", Z: " + ChatColor.GRAY + pLoc.getZ() + ChatColor.RED + ", Pitch: " + ChatColor.GRAY + pLoc.getPitch() + ChatColor.RED + ", Yaw: " + ChatColor.GRAY + pLoc.getYaw());
            } else {
                NoPermissionsHandler.NoPermissions(p);
            }
        } else if (sender instanceof ConsoleCommandSender) {
            System.out.println("This command can only be executed as a player.");
        }

        return true;
    }
}
