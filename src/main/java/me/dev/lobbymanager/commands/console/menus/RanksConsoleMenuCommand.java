package me.dev.lobbymanager.commands.console.menus;

import me.dev.lobbymanager.command_cooldown.LobbyCommandCooldown;
import me.dev.lobbymanager.command_cooldown.RankGUICooldown;
import me.dev.lobbymanager.menus.RankMenu;
import me.dev.lobbymanager.menus.items.RankMenuItems;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import java.util.concurrent.TimeUnit;

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
                String targetName = target.getName();
                if (target != null) {
                    if (RankGUICooldown.getCooldown(targetName) != 0l) {
                        target.sendMessage(ChatColor.RED + "Espera " + ChatColor.DARK_RED + String.format("%d", TimeUnit.MILLISECONDS.toSeconds(RankGUICooldown.getCooldown(targetName))) + ChatColor.RED + " segundos para volver a interactuar con el menu.");
                    } else {
                        RankGUICooldown.setCooldown(targetName, 3l * 1000l);
                        target.openInventory(RankMenu.getRanksInventoy(target));
                    }
                } else {
                    return true;
                }
            }
        }
        return true;
    }
}
