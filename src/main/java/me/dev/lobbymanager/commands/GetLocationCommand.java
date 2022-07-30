package me.dev.lobbymanager.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GetLocationCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("lobby.management.get.location")) {
                Location loc = p.getLocation();
                p.sendMessage(ChatColor.GRAY + "Tu ubicacion actual es: X: " + ChatColor.RED + loc.getX() + ChatColor.GRAY + ", Y: " + ChatColor.RED + loc.getY() + ChatColor.GRAY + ", Z: " + ChatColor.RED + loc.getZ() + ChatColor.GRAY + ".");
            } else {
                p.sendMessage(ChatColor.RED + "No puedes hacer eso!");
            }
        }
        return true;
    }
}
