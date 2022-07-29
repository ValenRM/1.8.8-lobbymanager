package me.dev.lobbymanager.menus.fireworks;

import me.dev.lobbymanager.menus.items.RankMenuItems;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class FireworkCustomizationGUIMenu {
    public static Inventory getFireworksInventory(Player p) {
        Inventory FireworksInventory = Bukkit.createInventory(p, 54, ChatColor.DARK_GRAY + "Cohetes");
        try {
            FireworksInventory.setItem(0, RankMenuItems.getRankInventoryItems("rankSelector"));
            FireworksInventory.setItem(1, FireworkMenuItems.getItem("fireworkSelector"));
            FireworksInventory.setItem(9, RankMenuItems.getRankInventoryItems("offSeparationPane"));
            FireworksInventory.setItem(10, RankMenuItems.getRankInventoryItems("selectedSeparationPane"));
            FireworksInventory.setItem(11, RankMenuItems.getRankInventoryItems("offSeparationPane"));
            FireworksInventory.setItem(12, RankMenuItems.getRankInventoryItems("offSeparationPane"));
            FireworksInventory.setItem(13, RankMenuItems.getRankInventoryItems("offSeparationPane"));
            FireworksInventory.setItem(14, RankMenuItems.getRankInventoryItems("offSeparationPane"));
            FireworksInventory.setItem(15, RankMenuItems.getRankInventoryItems("offSeparationPane"));
            FireworksInventory.setItem(14, RankMenuItems.getRankInventoryItems("offSeparationPane"));
            FireworksInventory.setItem(16, RankMenuItems.getRankInventoryItems("offSeparationPane"));
            FireworksInventory.setItem(17, RankMenuItems.getRankInventoryItems("offSeparationPane"));
            FireworksInventory.setItem(18, FireworkMenuItems.getItem("creeperBurst"));
            FireworksInventory.setItem(27, FireworkMenuItems.getItem("smallBallBurst"));
            FireworksInventory.setItem(36, FireworkMenuItems.getItem("bigBallBurst"));
            FireworksInventory.setItem(26, FireworkMenuItems.getItem("starBurst"));
            FireworksInventory.setItem(35, FireworkMenuItems.getItem("upwardsBurst"));
            FireworksInventory.setItem(29, FireworkMenuItems.getItem("fireworkPowerIcon"));
            FireworksInventory.setItem(30, FireworkMenuItems.getItem("fireworkPowerIconI"));
            FireworksInventory.setItem(31, FireworkMenuItems.getItem("fireworkPowerIconII"));
            FireworksInventory.setItem(32, FireworkMenuItems.getItem("fireworkPowerIconIII"));
            FireworksInventory.setItem(38, FireworkMenuItems.getItem("purpleColor"));
            FireworksInventory.setItem(39, FireworkMenuItems.getItem("redColor"));
            FireworksInventory.setItem(40, FireworkMenuItems.getItem("blueColor"));
            FireworksInventory.setItem(41, FireworkMenuItems.getItem("greenColor"));
            FireworksInventory.setItem(42, FireworkMenuItems.getItem("whiteColor"));
            FireworksInventory.setItem(49, FireworkMenuItems.getItem("trailSelector"));
            FireworksInventory.setItem(45, FireworkMenuItems.getItem("closeItem"));
            FireworksInventory.setItem(53, FireworkMenuItems.getItem("saveItem"));








        } catch (IllegalArgumentException ex) {
            ex.getStackTrace();
        }

        return FireworksInventory;
    }
}
