package me.dev.lobbymanager.listeners.menuinteractions;

import me.dev.lobbymanager.LobbyManager;
import me.dev.lobbymanager.menus.fireworks.FireworkMenuItems;
import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;

public class FireworksGUIInteractionHandler {
    private static Plugin plugin = LobbyManager.getPlugin();
    public static void HandleFireworkGUI(InventoryClickEvent e) {
        e.setCancelled(true);
        Player p = plugin.getServer().getPlayer(e.getWhoClicked().getName());
        if (p == null) return;
        Location pLoc = p.getLocation();
        int clickedSlot = e.getSlot();
        if (e.getClickedInventory().getItem(clickedSlot) == null) return;
        ItemStack clickedItem;
        switch (ChatColor.stripColor(e.getClickedInventory().getItem(clickedSlot).getItemMeta().getDisplayName()).toLowerCase()) {
            case "rangos":
                Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "launchrankgui " + p.getName());
                break;
            case "poder i":
                p.playSound(p.getLocation(), Sound.CLICK, 10f, 20f);
                e.getClickedInventory().setItem(31, FireworkMenuItems.getItem("fireworkPowerIconII"));
                e.getClickedInventory().setItem(32, FireworkMenuItems.getItem("fireworkPowerIconIII"));
                break;
            case "poder ii":
                p.playSound(p.getLocation(), Sound.CLICK, 10f, 20f);
                if (e.getClickedInventory().getItem(clickedSlot).getDurability() == 7) {
                    e.getClickedInventory().setItem(31, FireworkMenuItems.getItem("fireworkPowerIconIIEnabled"));
                } else if (e.getClickedInventory().getItem(clickedSlot).getDurability() == 5) {
                    e.getClickedInventory().setItem(32, FireworkMenuItems.getItem("fireworkPowerIconIII"));
                }
                break;
            case "poder iii":
                p.playSound(p.getLocation(), Sound.CLICK, 10f, 20f);
                if (e.getClickedInventory().getItem(clickedSlot).getDurability() == 7) {
                    e.getClickedInventory().setItem(31, FireworkMenuItems.getItem("fireworkPowerIconIIEnabled"));
                    e.getClickedInventory().setItem(32, FireworkMenuItems.getItem("fireworkPowerIconIIIEnabled"));

                }
                break;
            case "violeta":
                clickedItem = e.getClickedInventory().getItem(clickedSlot);
                if (clickedItem == null) return;
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10f, 20f);
                if (clickedItem.getItemMeta().getEnchants().containsKey(Enchantment.DURABILITY)) {
                        e.getClickedInventory().setItem(38, FireworkMenuItems.getItem("purpleColor"));
                    } else {
                        e.getClickedInventory().setItem(38, setSelected(clickedItem));
                    }
                break;
            case "rojo":
                clickedItem = e.getClickedInventory().getItem(clickedSlot);
                if (clickedItem == null) return;
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10f, 20f);
                if (clickedItem.getItemMeta().getEnchants().containsKey(Enchantment.DURABILITY)) {
                    e.getClickedInventory().setItem(39, FireworkMenuItems.getItem("redColor"));
                } else {
                    e.getClickedInventory().setItem(39, setSelected(clickedItem));
                }
                break;
            case "azul":
                clickedItem = e.getClickedInventory().getItem(clickedSlot);
                if (clickedItem == null) return;
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10f, 20f);
                if (clickedItem.getItemMeta().getEnchants().containsKey(Enchantment.DURABILITY)) {
                    e.getClickedInventory().setItem(40, FireworkMenuItems.getItem("blueColor"));
                } else {
                    e.getClickedInventory().setItem(40, setSelected(clickedItem));
                }
                break;
            case "verde":
                clickedItem = e.getClickedInventory().getItem(clickedSlot);
                if (clickedItem == null) return;
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10f, 20f);
                if (clickedItem.getItemMeta().getEnchants().containsKey(Enchantment.DURABILITY)) {
                    e.getClickedInventory().setItem(41, FireworkMenuItems.getItem("greenColor"));
                } else {
                    e.getClickedInventory().setItem(41, setSelected(clickedItem));
                }
                break;
            case "blanco":
                clickedItem = e.getClickedInventory().getItem(clickedSlot);
                if (clickedItem == null) return;
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10f, 20f);
                if (clickedItem.getItemMeta().getEnchants().containsKey(Enchantment.DURABILITY)) {
                    e.getClickedInventory().setItem(42, FireworkMenuItems.getItem("whiteColor"));
                } else {
                    e.getClickedInventory().setItem(42, setSelected(clickedItem));
                }
                break;
            case "recorrido":
                clickedItem = e.getClickedInventory().getItem(clickedSlot);
                if (clickedItem == null) return;
                p.playSound(p.getLocation(), Sound.NOTE_PLING, 10f, 20f);
                if (clickedItem.getData().getItemType() == Material.REDSTONE_BLOCK) {
                   clickedItem.setType(Material.EMERALD_BLOCK);
                   ItemMeta meta = clickedItem.getItemMeta();
                   meta.setDisplayName(ChatColor.GREEN + "Recorrido");
                   clickedItem.setItemMeta(meta);
                   e.getClickedInventory().setItem(49, clickedItem);
                } else {
                    e.getClickedInventory().setItem(49, FireworkMenuItems.getItem("trailSelector"));
                }
                break;
        }
    }

    private static ItemStack setSelected(ItemStack item) {
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        itemMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        List<String> lore = itemMeta.getLore();
        lore.add(ChatColor.GREEN + "" + ChatColor.ITALIC + "Seleccionado");
        itemMeta.setLore(lore);
        item.setItemMeta(itemMeta);
        return item;
    }
}
