package me.dev.lobbymanager.menus;

import me.dev.lobbymanager.menus.fireworks.FireworkMenuItems;
import me.dev.lobbymanager.menus.items.RankMenuItems;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class RankMenu {


    public static Inventory getRanksInventoy(Player p) {

        Inventory inventory = Bukkit.createInventory(p, 54, ChatColor.DARK_GRAY + "Rangos");
        try {
            inventory.setItem(0, RankMenuItems.getRankInventoryItems("rankSelector"));
            inventory.setItem(1, FireworkMenuItems.getItem("fireworkSelector"));
            inventory.setItem(9, RankMenuItems.getRankInventoryItems("selectedSeparationPane"));
            inventory.setItem(10, RankMenuItems.getRankInventoryItems("offSeparationPane"));
            inventory.setItem(11, RankMenuItems.getRankInventoryItems("offSeparationPane"));
            inventory.setItem(12, RankMenuItems.getRankInventoryItems("offSeparationPane"));
            inventory.setItem(13, RankMenuItems.getRankInventoryItems("offSeparationPane"));
            inventory.setItem(14, RankMenuItems.getRankInventoryItems("offSeparationPane"));
            inventory.setItem(15, RankMenuItems.getRankInventoryItems("offSeparationPane"));
            inventory.setItem(14, RankMenuItems.getRankInventoryItems("offSeparationPane"));
            inventory.setItem(16, RankMenuItems.getRankInventoryItems("offSeparationPane"));
            inventory.setItem(17, RankMenuItems.getRankInventoryItems("offSeparationPane"));
            inventory.setItem(27, RankMenuItems.getRankInventoryItems("VIPRankIcon"));
            inventory.setItem(29, RankMenuItems.getRankInventoryItems("VIPpRankIcon"));
            inventory.setItem(31, RankMenuItems.getRankInventoryItems("MVPRankIcon"));
            inventory.setItem(33, RankMenuItems.getRankInventoryItems("MVPpRankIcon"));
            inventory.setItem(35, RankMenuItems.getRankInventoryItems("MVPppRankIcon"));
            inventory.setItem(36, RankMenuItems.getRankInventoryItems("VIPRankBook"));
            inventory.setItem(38, RankMenuItems.getRankInventoryItems("VIPpRankBook"));
            inventory.setItem(40, RankMenuItems.getRankInventoryItems("MVPRankBook"));
            inventory.setItem(42, RankMenuItems.getRankInventoryItems("MVPpRankBook"));
            inventory.setItem(44, RankMenuItems.getRankInventoryItems("MVPppRankBook"));
            inventory.setItem(49, RankMenuItems.getRankInventoryItems("CloseIcon"));
        } catch (IllegalArgumentException ex) {
            ex.getStackTrace();
        }



        return inventory;
    }

}
