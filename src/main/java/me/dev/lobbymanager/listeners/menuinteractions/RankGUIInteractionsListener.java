package me.dev.lobbymanager.listeners.menuinteractions;

import me.dev.lobbymanager.LobbyManager;
import me.dev.lobbymanager.menus.fireworks.FireworkCustomizationGUIMenu;
import me.dev.lobbymanager.menus.items.rankbooks.OpenRankBookItem;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.Plugin;

public class RankGUIInteractionsListener {
    private static Plugin plugin = LobbyManager.getPlugin();
    public static void handleRankGUIInteractions (InventoryClickEvent e) {
        e.setCancelled(true);
        try {
            Player p = plugin.getServer().getPlayer(e.getWhoClicked().getName());
            if (p == null) return;
            Location pLoc = p.getLocation();
            int clickedSlot = e.getSlot();
            if (e.getClickedInventory().getItem(clickedSlot) == null) return;
            if (!e.getClickedInventory().getItem(clickedSlot).getItemMeta().hasDisplayName()) return;
            switch (ChatColor.stripColor(e.getClickedInventory().getItem(clickedSlot).getItemMeta().getDisplayName()).toLowerCase()) {
                case "customizacion de cohete":
                    if (p.hasPermission("server.rank.vip")) {
                        p.openInventory(FireworkCustomizationGUIMenu.getFireworksInventory(p));
                    } else {
                        p.sendMessage(ChatColor.RED + "Debes ser " + ChatColor.GREEN + "VIP" + ChatColor.RED + " o superior para poder entrar a este menu.");
                        p.closeInventory();
                    }
                    break;
                case "vip":
                    p.playSound(pLoc, Sound.ENDERMAN_TELEPORT, 10.0f, 30);
                    break;
                case "vip+":
                    p.playSound(pLoc, Sound.ENDERMAN_TELEPORT, 10.0f, 30);
                    break;
                case "mvp":
                    p.playSound(pLoc, Sound.ENDERMAN_TELEPORT, 10.0f, 30);
                    break;
                case "mvp+":
                    p.playSound(pLoc, Sound.ENDERMAN_TELEPORT, 10.0f, 30);
                    break;
                case "mvp++":
                    p.playSound(pLoc, Sound.ENDERMAN_TELEPORT, 10.0f, 30);
                    break;
                case "ver perks [vip]":
                    OpenRankBookItem.OpenRankBook(p, "VIPRankGUI");
                    break;
                case "ver perks [vip+]":
                    OpenRankBookItem.OpenRankBook(p, "VIPpRankGUI");
                    break;
                case "ver perks [mvp]":
                    OpenRankBookItem.OpenRankBook(p, "MVPRankGUI");
                    break;
                case "ver perks [mvp+]":
                    OpenRankBookItem.OpenRankBook(p, "MVPpRankGUI");
                    break;
                case "ver perks [mvp++]":
                    OpenRankBookItem.OpenRankBook(p, "MVPppRankGUI");
                    break;
                case "salir":
                    if (e.getClick() == ClickType.LEFT) p.closeInventory();
                    break;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
