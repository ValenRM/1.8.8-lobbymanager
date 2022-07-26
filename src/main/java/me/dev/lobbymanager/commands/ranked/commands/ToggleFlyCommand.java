package me.dev.lobbymanager.commands.ranked.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ToggleFlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("server.rank.vip")) {
                if (!p.getAllowFlight()) {
                    p.setAllowFlight(true);
                    p.sendMessage(ChatColor.GREEN + "Modo de vuelo " + ChatColor.AQUA + "" + ChatColor.BOLD +  "Activado" + ChatColor.GREEN + "!");
                } else {
                    p.setAllowFlight(false);
                    p.sendMessage(ChatColor.GREEN + "Modo de vuelo " + ChatColor.AQUA + "" + ChatColor.BOLD +  "Desactivado" + ChatColor.GREEN + "!");
                }
            } else {
                p.sendMessage(ChatColor.RED + "No puedes hacer eso!");
            }
        }
        return true;
    }
}
