package me.dev.lobbymanager.commands.ranked.commands;

import me.dev.lobbymanager.LobbyManager;
import me.dev.lobbymanager.menus.fireworks.FireworkCustomizationGUIMenu;
import me.dev.lobbymanager.playersettings.FireworkPlayerSettings;
import net.minecraft.server.v1_8_R3.EntityTypes;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;

public class FireworkCommand implements CommandExecutor {
    private static Plugin plugin = LobbyManager.getPlugin();
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("server.rank.vip")) {
                if (args.length < 1) {
                    FireworkMeta fMeta = FireworkPlayerSettings.getFireworks(p.getName());
                    Firework f = (Firework) p.getWorld().spawnEntity(p.getLocation(), EntityType.FIREWORK);
                    if (fMeta == null) {
                        fMeta = f.getFireworkMeta();
                        fMeta.setPower(1);
                        fMeta.addEffect(FireworkEffect.builder().flicker(false).withColor(Color.WHITE).withFade(Color.WHITE).with(FireworkEffect.Type.BALL_LARGE).trail(true).build());
                        f.setFireworkMeta(fMeta);
                    } else {
                        f.setFireworkMeta(fMeta);
                    }

                } else if (args[0].equalsIgnoreCase("ajustes")) {
                    p.openInventory(FireworkCustomizationGUIMenu.getFireworksInventory(p));
                } else {
                    p.sendMessage(ChatColor.RED + "Este comando no existe.");
                }

                    /*Firework f = (Firework) p.getWorld().spawnEntity(p.getLocation(), EntityType.FIREWORK);
                    FireworkMeta fm = f.getFireworkMeta();
                    List<Color> c = new ArrayList<Color>();
                    c.add(Color.RED);
                    FireworkEffect effect = FireworkEffect.builder().flicker(true).withColor(c).withFade(c).with(FireworkEffect.Type.CREEPER).trail(true).build();
                    fm.addEffect(effect);
                    fm.setPower(1);
                    f.setFireworkMeta(fm);*/
            }
        }
        return true;
    }
}
