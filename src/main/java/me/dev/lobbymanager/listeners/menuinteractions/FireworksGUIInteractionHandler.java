package me.dev.lobbymanager.listeners.menuinteractions;

import me.dev.lobbymanager.LobbyManager;
import me.dev.lobbymanager.menus.fireworks.FireworkMenuItems;
import me.dev.lobbymanager.playersettings.FireworkPlayerSettings;
import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.Arrays;
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
            case "explosion de creeper":
                p.playSound(p.getLocation(), Sound.CLICK, 10f, 20f);
                clickedItem = e.getClickedInventory().getItem(clickedSlot);
                    if (clickedItem.getEnchantments().containsKey(Enchantment.DURABILITY)) {
                        e.getClickedInventory().setItem(18, FireworkMenuItems.getItem("creeperBurst"));
                    } else {
                        e.getClickedInventory().setItem(18, setSelectedSkull(clickedItem));
                    }
                break;
            case "explosion chica":
                p.playSound(p.getLocation(), Sound.CLICK, 10f, 20f);
                clickedItem = e.getClickedInventory().getItem(clickedSlot);
                if (clickedItem.getEnchantments().containsKey(Enchantment.DURABILITY)) {
                    e.getClickedInventory().setItem(27, FireworkMenuItems.getItem("smallBallBurst"));
                } else {
                    e.getClickedInventory().setItem(27, setSelectedSkull(clickedItem));
                }
                break;
            case "explosion grande":
                p.playSound(p.getLocation(), Sound.CLICK, 10f, 20f);
                clickedItem = e.getClickedInventory().getItem(clickedSlot);
                if (clickedItem.getEnchantments().containsKey(Enchantment.DURABILITY)) {
                    e.getClickedInventory().setItem(36, FireworkMenuItems.getItem("bigBallBurst"));
                } else {
                    e.getClickedInventory().setItem(36, setSelectedSkull(clickedItem));
                }
                break;
            case "explosion de estrella":
                p.playSound(p.getLocation(), Sound.CLICK, 10f, 20f);
                clickedItem = e.getClickedInventory().getItem(clickedSlot);
                if (clickedItem.getEnchantments().containsKey(Enchantment.DURABILITY)) {
                    e.getClickedInventory().setItem(26, FireworkMenuItems.getItem("starBurst"));
                } else {
                    e.getClickedInventory().setItem(26, setSelectedSkull(clickedItem));
                }
                break;
            case "explosion especial":
                p.playSound(p.getLocation(), Sound.CLICK, 10f, 20f);
                clickedItem = e.getClickedInventory().getItem(clickedSlot);
                if (clickedItem.getEnchantments().containsKey(Enchantment.DURABILITY)) {
                    e.getClickedInventory().setItem(35, FireworkMenuItems.getItem("upwardsBurst"));
                } else {
                    e.getClickedInventory().setItem(35, setSelectedSkull(clickedItem));
                }
                break;
            case "salir":
                    p.closeInventory();
                break;
            case "guardar":
                    saveSettings(e, p);
                break;
            }
        }
    private static void saveSettings(InventoryClickEvent e, Player p) {
        Location pLoc = p.getLocation();
        int fireworkPower = 1;
        boolean fireworkTrail = false;
        ArrayList<Color> fireworkColors = new ArrayList<Color>();

        for (int i = 38; i <= 42; i++) {
            if (e.getClickedInventory().getItem(i).getEnchantments().containsKey(Enchantment.DURABILITY)) {
                String itemName = ChatColor.stripColor(e.getClickedInventory().getItem(i).getItemMeta().getDisplayName());
                if (itemName.equalsIgnoreCase("violeta")) {
                    fireworkColors.add(Color.PURPLE);
                } else if (itemName.equalsIgnoreCase("rojo")) {
                    fireworkColors.add(Color.RED);
                } else if (itemName.equalsIgnoreCase("azul")) {
                    fireworkColors.add(Color.BLUE);
                } else if (itemName.equalsIgnoreCase("verde")) {
                    fireworkColors.add(Color.GREEN);
                } else if (itemName.equalsIgnoreCase("blanco")) {
                    fireworkColors.add(Color.WHITE);
                }
            }
        }
        for (int i = 30; i <= 32; i++) {
            if (e.getClickedInventory().getItem(i).getDurability() == 5) {
                if (i == 31) {
                    fireworkPower = 2;
                } else if (i == 32) {
                    fireworkPower = 3;
                }
            }
        }
        if (e.getClickedInventory().getItem(49).getData().getItemType() == Material.EMERALD_BLOCK) fireworkTrail = true;
        if (fireworkColors.size() < 1) fireworkColors.add(Color.WHITE);
        Firework f = (Firework) p.getWorld().spawnEntity(pLoc, EntityType.FIREWORK);
        FireworkMeta fMeta = f.getFireworkMeta();
        fMeta.setPower(fireworkPower);
        FireworkEffect fireworkEffect = FireworkEffect.builder().flicker(fireworkTrail).withColor(fireworkColors).withFade(fireworkColors).with(FireworkEffect.Type.CREEPER).trail(fireworkTrail).build();
        fMeta.addEffect(fireworkEffect);
        f.setFireworkMeta(fMeta);
        FireworkPlayerSettings.setFireworkPresets(p.getName(), f);
        p.closeInventory();
        //f.setPassenger(p);
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

    private static ItemStack setSelectedSkull (ItemStack item) {
        SkullMeta skullMeta = (SkullMeta) item.getItemMeta();
        skullMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        skullMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        List<String> lore = new ArrayList<String>(Arrays.asList(
                "",
                ChatColor.GREEN + "" + ChatColor.ITALIC + "Seleccionado"
        ));
        skullMeta.setLore(lore);
        item.setItemMeta(skullMeta);

        return item;
    }
}
