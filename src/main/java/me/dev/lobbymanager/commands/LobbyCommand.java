package me.dev.lobbymanager.commands;

import me.dev.lobbymanager.LobbyManager;
import me.dev.lobbymanager.command_cooldown.LobbyCommandCooldown;
import me.dev.lobbymanager.handlers.NoPermissionsHandler;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class LobbyCommand implements CommandExecutor {
    Plugin plugin = LobbyManager.getPlugin();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("lobby.use.execute.lobbycommand")) {
                if (LobbyCommandCooldown.getCooldown(p) != 0l) {
                    p.sendMessage(ChatColor.RED + "Espera " + ChatColor.DARK_RED + String.format("%d", TimeUnit.MILLISECONDS.toSeconds(LobbyCommandCooldown.getCooldown(p))) + ChatColor.RED + " segundos para usar nuevamente este comando.");
                } else {
                    p.teleport((Location) plugin.getConfig().get("spawn.location"));

                    p.sendMessage(ChatColor.GREEN + "Has sido teletransportado al Lobby.");
                    LobbyCommandCooldown.setCooldown(p, 3 * 1000l);
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
