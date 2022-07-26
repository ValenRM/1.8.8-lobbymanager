package me.dev.lobbymanager.commands;

import me.dev.lobbymanager.LobbyManager;
import me.dev.lobbymanager.handlers.NoPermissionsHandler;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class GetSpawnCommand implements CommandExecutor {
    private Plugin plugin = LobbyManager.getPlugin();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("lobby.management.get.spawnlocation")) {
                Location loc = (Location) plugin.getConfig().get("spawn.location");
                if (loc == null) {
                    p.sendMessage(ChatColor.RED + "Ocurrio un error al tratar de obtener la ubicacion desde la configuracion. Contactate con el desarrollador para mas informacion sobre este error.");
                } else {
                    p.sendMessage(ChatColor.GOLD + "[" + ChatColor.RED + "Lobby Manager" + ChatColor.GOLD + "] " + ChatColor.GREEN + "La ubicacion de spawn por defecto de todos los jugadores es: " + ChatColor.RED + "World: " + ChatColor.GRAY + loc.getWorld().getName() + ChatColor.RED + ", X: " + ChatColor.GRAY + loc.getX() + ChatColor.RED + ", Y: " + ChatColor.GRAY + loc.getY() + ChatColor.RED + ", Z: " + ChatColor.GRAY + loc.getZ() + ChatColor.RED + ", Pitch: " + ChatColor.GRAY + loc.getPitch() + ChatColor.RED + ", Yaw: " + ChatColor.GRAY + loc.getYaw());
                }
            } else {
                NoPermissionsHandler.NoPermissions(p);
            }
        } else if (sender instanceof ConsoleCommandSender) {
            System.out.println("This command can only be executed as a player.");
        }

        return true;
    }
}
