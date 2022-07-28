package me.dev.lobbymanager.commands.console.menus;

import me.dev.lobbymanager.menus.RankMenu;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class RanksConsoleMenuCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            p.sendMessage(ChatColor.RED + "No tienes permisos para ejecutar este comando.");
        } else if (sender instanceof ConsoleCommandSender) {
            if (args.length < 1) {
                return true;
            } else {
                Player target = sender.getServer().getPlayer(args[0]);
                if (target != null) {
                    target.openInventory(RankMenu.getRanksInventoy(target));
                } else {
                    return true;
                }
            }
        }
        return true;
    }
}
