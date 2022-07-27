package me.dev.lobbymanager.commands.ranked.commands;

import me.dev.lobbymanager.LobbyManager;
import me.dev.lobbymanager.menus.fireworks.FireworkCustomizationGUIMenu;
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
                p.openInventory(FireworkCustomizationGUIMenu.getFireworksInventory(p));

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
