package me.dev.lobbymanager.menus.fireworks;

import net.citizensnpcs.npc.ai.speech.Chat;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FireworkMenuItems {
    private static HashMap<String, ItemStack> items = new HashMap<>();
    private static ItemStack fireworkSelector = new ItemStack(Material.FIREWORK);
    private static ItemStack fireworkPowerIcon = new ItemStack(Material.FIREWORK_CHARGE);
    private static ItemStack fireworkPowerIconI = new ItemStack(Material.STAINED_GLASS_PANE);
    private static ItemStack fireworkPowerIconII = new ItemStack(Material.STAINED_GLASS_PANE);
    private static ItemStack fireworkPowerIconIII = new ItemStack(Material.STAINED_GLASS_PANE);
    private static ItemStack fireworkPowerIconIIEnabled = new ItemStack(Material.STAINED_GLASS_PANE);
    private static ItemStack fireworkPowerIconIIIEnabled = new ItemStack(Material.STAINED_GLASS_PANE);
    private static ItemStack purpleColor = new ItemStack(Material.INK_SACK);
    private static ItemStack redColor = new ItemStack(Material.INK_SACK);
    private static ItemStack blueColor = new ItemStack(Material.INK_SACK);
    private static ItemStack greenColor = new ItemStack(Material.INK_SACK);
    private static ItemStack whiteColor = new ItemStack(Material.INK_SACK);
    private static ItemStack trailSelector = new ItemStack(Material.REDSTONE_BLOCK);

    public static void loadFireworkGUIMetas () {
        ItemMeta fireworkSelectorMeta = fireworkSelector.getItemMeta();
        fireworkSelectorMeta.setDisplayName(ChatColor.AQUA + "Customizacion de Cohete");
        fireworkSelectorMeta.setLore(new ArrayList<String>(Arrays.asList(
                "",
                ChatColor.GRAY + "Customiza los cohetes, desde potencia, ",
                ChatColor.GRAY + "color, efecto, y mas!",
                "",
                ChatColor.RED + "Esta opcion esta disponible con rango VIP o mas",
                ""
        )));
        fireworkSelector.setItemMeta(fireworkSelectorMeta);

        ItemMeta fireworkPowerIconMeta = fireworkPowerIcon.getItemMeta();
        fireworkPowerIconMeta.setDisplayName(ChatColor.GREEN + "Poder de Alcance");
        fireworkPowerIconMeta.setLore(new ArrayList<String>(Arrays.asList(
                "",
                ChatColor.GRAY + "Define el alcance (en altura)",
                ChatColor.GRAY + "de tu fuego artificial"
        )));
        fireworkPowerIconMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        fireworkPowerIcon.setItemMeta(fireworkPowerIconMeta);

        ItemMeta fireworkPorwerIconIMeta = fireworkPowerIconI.getItemMeta();
        fireworkPorwerIconIMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.ITALIC + "Poder I");

        fireworkPowerIconI.setItemMeta(fireworkPorwerIconIMeta);
        fireworkPowerIconI.setDurability((short) 5);

        ItemMeta fireworkPorwerIconIIMeta = fireworkPowerIconII.getItemMeta();
        fireworkPorwerIconIIMeta.setDisplayName(ChatColor.RED + "" + ChatColor.ITALIC + "Poder II");

        fireworkPowerIconII.setItemMeta(fireworkPorwerIconIIMeta);
        fireworkPowerIconII.setDurability((short) 7);

        ItemMeta fireworkPorwerIconIIIMeta = fireworkPowerIconIII.getItemMeta();
        fireworkPorwerIconIIIMeta.setDisplayName(ChatColor.RED + "" + ChatColor.ITALIC + "Poder III");

        fireworkPowerIconIII.setItemMeta(fireworkPorwerIconIIIMeta);
        fireworkPowerIconIII.setDurability((short) 7);

        ItemMeta fireworkPowerIconIIMetaEnabled = fireworkPowerIconIIEnabled.getItemMeta();
        fireworkPowerIconIIMetaEnabled.setDisplayName(ChatColor.GREEN + "" + ChatColor.ITALIC + "Poder II");
        fireworkPowerIconIIEnabled.setItemMeta(fireworkPowerIconIIMetaEnabled);
        fireworkPowerIconIIEnabled.setDurability((short) 5);

        ItemMeta fireworkPowerIconIIIMetaEnabled = fireworkPowerIconIIIEnabled.getItemMeta();
        fireworkPowerIconIIIMetaEnabled.setDisplayName(ChatColor.GREEN + "" + ChatColor.ITALIC + "Poder III");
        fireworkPowerIconIIIEnabled.setItemMeta(fireworkPowerIconIIIMetaEnabled);
        fireworkPowerIconIIIEnabled.setDurability((short) 5);

        ItemMeta purpleColorMeta = purpleColor.getItemMeta();
        purpleColorMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Violeta");
        purpleColorMeta.setLore(new ArrayList<String>(Arrays.asList(
                "",
                ChatColor.GRAY + "Agrega el color " + ChatColor.LIGHT_PURPLE + "violeta " + ChatColor.GRAY + "a la",
                ChatColor.GRAY + "explosion de tu cohete.",
                ""
        )));
        purpleColor.setItemMeta(purpleColorMeta);
        purpleColor.setDurability((short) 5);

        ItemMeta redColorMeta = redColor.getItemMeta();
        redColorMeta.setDisplayName(ChatColor.RED + "Rojo");
        redColorMeta.setLore(new ArrayList<String>(Arrays.asList(
                "",
                ChatColor.GRAY + "Agrega el color " + ChatColor.RED + "rojo " + ChatColor.GRAY + "a la",
                ChatColor.GRAY + "explosion de tu cohete.",
                ""
        )));
        redColor.setItemMeta(redColorMeta);
        redColor.setDurability((short) 1);

        ItemMeta blueColorMeta = blueColor.getItemMeta();
        blueColorMeta.setDisplayName(ChatColor.BLUE + "Azul");
        blueColorMeta.setLore(new ArrayList<String>(Arrays.asList(
                "",
                ChatColor.GRAY + "Agrega el color " + ChatColor.BLUE + "azul " + ChatColor.GRAY + "a la",
                ChatColor.GRAY + "explosion de tu cohete.",
                ""
        )));
        blueColor.setItemMeta(blueColorMeta);
        blueColor.setDurability((short) 4);

        ItemMeta greenColorMeta = greenColor.getItemMeta();
        greenColorMeta.setDisplayName(ChatColor.GREEN + "Verde");
        greenColorMeta.setLore(new ArrayList<String>(Arrays.asList(
                "",
                ChatColor.GRAY + "Agrega el color " + ChatColor.GREEN + "verde " + ChatColor.GRAY + "a la",
                ChatColor.GRAY + "explosion de tu cohete.",
                ""
        )));
        greenColor.setItemMeta(greenColorMeta);
        greenColor.setDurability((short) 2);

        ItemMeta whiteColorMeta = whiteColor.getItemMeta();
        whiteColorMeta.setDisplayName(ChatColor.WHITE + "Blanco");
        whiteColorMeta.setLore(new ArrayList<String>(Arrays.asList(
                "",
                ChatColor.GRAY + "Agrega el color " + ChatColor.WHITE + "blanco " + ChatColor.GRAY + "a la",
                ChatColor.GRAY + "explosion de tu cohete.",
                ""
        )));
        whiteColor.setItemMeta(whiteColorMeta);
        whiteColor.setDurability((short) 7);

        ItemMeta trailSelectorMeta = trailSelector.getItemMeta();
        trailSelectorMeta.setDisplayName(ChatColor.RED + "Recorrido");
        trailSelectorMeta.setLore(new ArrayList<String>(Arrays.asList(
                "",
                ChatColor.GRAY + "Marca el recorrido de tu cohete",
                ""
        )));
        trailSelector.setItemMeta(trailSelectorMeta);







        items.put("fireworkSelector", fireworkSelector);
        items.put("fireworkPowerIcon", fireworkPowerIcon);
        items.put("fireworkPowerIconI", fireworkPowerIconI);
        items.put("fireworkPowerIconII", fireworkPowerIconII);
        items.put("fireworkPowerIconIII", fireworkPowerIconIII);
        items.put("fireworkPowerIconIIEnabled", fireworkPowerIconIIEnabled);
        items.put("fireworkPowerIconIIIEnabled", fireworkPowerIconIIIEnabled);

        items.put("purpleColor", purpleColor);
        items.put("redColor", redColor);
        items.put("blueColor", blueColor);
        items.put("greenColor", greenColor);
        items.put("whiteColor", whiteColor);
        items.put("trailSelector", trailSelector);



    }

    public static ItemStack getItem(String item) {
        return items.get(item);
    }
}
