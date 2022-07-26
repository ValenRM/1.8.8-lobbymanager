package me.dev.lobbymanager.menus.items;

import net.citizensnpcs.npc.ai.speech.Chat;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RankMenuItems {

    private static ItemStack rankSelector = new ItemStack(Material.EMERALD);
    private static ItemStack separatorPane = new ItemStack(Material.STAINED_GLASS_PANE);
    private static ItemStack offSeparatorPane = new ItemStack(Material.STAINED_GLASS_PANE);
    private static ItemStack VIPRankIcon = new ItemStack(Material.EMERALD);
    private static ItemStack VIPpRankIcon = new ItemStack(Material.EMERALD);
    private static ItemStack MVPRankIcon = new ItemStack(Material.DIAMOND);
    private static ItemStack MVPpRankIcon = new ItemStack(Material.DIAMOND);
    private static ItemStack MVPppRankIcon = new ItemStack(Material.GOLD_INGOT);
    private static ItemStack VIPRankBook = new ItemStack(Material.BOOK);
    private static ItemStack VIPpRankBook = new ItemStack(Material.BOOK);
    private static ItemStack MVPRankBook = new ItemStack(Material.BOOK);
    private static ItemStack MVPpRankBook = new ItemStack(Material.BOOK);
    private static ItemStack MVPppRankBook = new ItemStack(Material.BOOK);
    private static ItemStack CloseIcon = new ItemStack(Material.BARRIER);
    private static HashMap<String, ItemStack> items = new HashMap<>();

    public static void setMetas() {
        ItemMeta rankSelectorMeta = rankSelector.getItemMeta();
        rankSelectorMeta.setDisplayName(ChatColor.GREEN + "Rangos");
        rankSelectorMeta.setLore(new ArrayList<String>(Arrays.asList(
                "",
                ChatColor.GRAY + "Los rangos mejoran tu experiencia sin ofrecer ninguna",
                ChatColor.GRAY + "ventaja dentro del juego, cada rango contiene las mismas",
                ChatColor.GRAY + "perks de los rangos anteriores. Pon el cursor sobre cualquier",
                ChatColor.GRAY + "rango para ver que es lo que ofrecen!",
                "",
                ChatColor.YELLOW + "El valor actual de tu rango es automaticamente descontado",
                ChatColor.YELLOW + "de cualquier mejora de rango futura.",
                ""
        )));
        rankSelector.setItemMeta(rankSelectorMeta);
        ItemMeta separationGlassPaneMeta = separatorPane.getItemMeta();
        separationGlassPaneMeta.setDisplayName(ChatColor.GRAY + "⬆ Categoria");
        separationGlassPaneMeta.setLore(new ArrayList<String>(Arrays.asList(
                ChatColor.GRAY + "⬇ Item"
        )));
        separatorPane.setItemMeta(separationGlassPaneMeta);
        separatorPane.setDurability((short) 5);

        ItemMeta offSeparationGlassPaneMeta = offSeparatorPane.getItemMeta();
        offSeparationGlassPaneMeta.setDisplayName(ChatColor.GRAY + "⬆ Categoria");
        offSeparationGlassPaneMeta.setLore(new ArrayList<String>(Arrays.asList(
                ChatColor.GRAY + "⬇ Item"
        )));
        offSeparatorPane.setItemMeta(separationGlassPaneMeta);
        offSeparatorPane.setDurability((short) 7);


        ItemMeta VIPRankIconMeta = VIPRankIcon.getItemMeta();
        VIPRankIconMeta.setDisplayName(ChatColor.GREEN + "VIP");
        VIPRankIconMeta.setLore(new ArrayList<String>(Arrays.asList(
                ChatColor.GRAY + "El rango " + ChatColor.GREEN + "VIP " + ChatColor.GRAY + "es uno de los rangos mas",
                ChatColor.GRAY + "basicos que otorga perks y cosmeticos basicos",
                ChatColor.GRAY + "que mejoran la experiencia de juego!",
                "",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "Perfix de Chat: " + ChatColor.GREEN + "[VIP]",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "Color de Nombre: " + ChatColor.GREEN + "VERDE",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "90" + ChatColor.GREEN + "+ " + ChatColor.GRAY + "Cosmeticos Exclusivos",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "Comando " + ChatColor.GREEN + "/fly " + ChatColor.GRAY + "en Lobbys",
                ChatColor.GRAY + "Y mas...",
                "",
                ChatColor.YELLOW + "Para ver mas perks dale click al libro de abajo."
        )));
        VIPRankIcon.setItemMeta(VIPRankIconMeta);

        ItemMeta VIPpRankIconMeta = VIPpRankIcon.getItemMeta();
        VIPpRankIconMeta.setDisplayName(ChatColor.GREEN + "VIP" + ChatColor.GOLD + "+");
        VIPpRankIconMeta.setLore(new ArrayList<String>(Arrays.asList(
                ChatColor.GRAY + "El rango " + ChatColor.GREEN + "VIP" + ChatColor.GOLD + "+ " + ChatColor.GRAY + "contiene todos los",
                ChatColor.GRAY + "perks del rango " + ChatColor.GREEN + "VIP " + ChatColor.GRAY + "y mas!",
                "",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "Perfix de Chat: " + ChatColor.GREEN + "[VIP" + ChatColor.GOLD + "+" + ChatColor.GREEN + "]",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "Color de Nombre: " + ChatColor.GREEN + "VERDE",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "120" + ChatColor.GREEN + "+ " + ChatColor.GRAY + "Cosmeticos Exclusivos",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "Crear Asociaciones",
                ChatColor.GRAY + "Y mas...",
                "",
                ChatColor.YELLOW + "Para ver mas perks dale click al libro de abajo."
        )));
        VIPpRankIconMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        VIPpRankIconMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        VIPpRankIcon.setItemMeta(VIPpRankIconMeta);

        ItemMeta MVPRankIconMeta = MVPRankIcon.getItemMeta();
        MVPRankIconMeta.setDisplayName(ChatColor.AQUA + "MVP");
        MVPRankIconMeta.setLore(new ArrayList<String>(Arrays.asList(
                ChatColor.GRAY + "El rango " + ChatColor.AQUA + "MVP" + ChatColor.GRAY + " es un rango intermedio y contiene",
                ChatColor.GRAY + "todos los perks del rango " + ChatColor.GREEN + "VIP" + ChatColor.GRAY + ", " + ChatColor.GREEN + "VIP" + ChatColor.GOLD + "+ " + ChatColor.GRAY + "y mas!",
                "",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "Perfix de Chat: " + ChatColor.AQUA + "[MVP]",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "Color de Nombre: " + ChatColor.AQUA + "CYAN",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "150" + ChatColor.AQUA + "+ " + ChatColor.GRAY + "Cosmeticos Exclusivos",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "Crear Asociaciones",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "Jaulas Exclusivas",
                ChatColor.GRAY + "Y mas...",
                "",
                ChatColor.YELLOW + "Para ver mas perks dale click al libro de abajo."
        )));
        MVPRankIcon.setItemMeta(MVPRankIconMeta);

        ItemMeta MVPpRankIconMeta = MVPpRankIcon.getItemMeta();
        MVPpRankIconMeta.setDisplayName(ChatColor.AQUA + "MVP" + ChatColor.GOLD + "+");
        MVPpRankIconMeta.setLore(new ArrayList<String>(Arrays.asList(
                ChatColor.GRAY + "El rango " + ChatColor.AQUA + "MVP" + ChatColor.GOLD + "+" + ChatColor.GRAY + " es un rango avanzado y contiene",
                ChatColor.GRAY + "todos los perks del rango " + ChatColor.GREEN + "VIP" + ChatColor.GRAY + ", " + ChatColor.GREEN + "VIP" + ChatColor.GOLD + "+ " + ChatColor.GRAY + ", " + ChatColor.AQUA + "MVP " + ChatColor.GRAY + "y mas!",
                "",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "Perfix de Chat: " + ChatColor.AQUA + "[MVP" + ChatColor.GOLD + "+" + ChatColor.AQUA + "]",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "Color de Nombre: " + ChatColor.AQUA + "CYAN",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "190" + ChatColor.AQUA + "+ " + ChatColor.GRAY + "Cosmeticos Exclusivos",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "Boost de Niveles",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "Ajustes Especiales",
                ChatColor.GRAY + "Y mas...",
                "",
                ChatColor.YELLOW + "Para ver mas perks dale click al libro de abajo."
        )));
        MVPpRankIconMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        MVPpRankIconMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        MVPpRankIcon.setItemMeta(MVPpRankIconMeta);

        ItemMeta MVPppRankIconMeta = MVPppRankIcon.getItemMeta();
        MVPppRankIconMeta.setDisplayName(ChatColor.GOLD + "MVP++");
        MVPppRankIconMeta.setLore(new ArrayList<String>(Arrays.asList(
                ChatColor.GRAY + "El rango " + ChatColor.GOLD + "MVP++" + ChatColor.GRAY + " es un rango " + ChatColor.GOLD + "exclusivo " + ChatColor.GRAY +  "y contiene",
                ChatColor.GRAY + "todos los perks del rango " + ChatColor.GREEN + "VIP" + ChatColor.GRAY + ", " + ChatColor.GREEN + "VIP" + ChatColor.GOLD + "+" + ChatColor.GRAY + ", " + ChatColor.AQUA + "MVP " + ChatColor.GRAY + ", " + ChatColor.AQUA + "MVP" + ChatColor.GOLD + "+ " + ChatColor.GRAY + "y mas!",
                "",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "Perfix de Chat: " + ChatColor.GOLD + "[MVP++]",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "Color de Nombre: " + ChatColor.GOLD + "NARANJA",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "220" + ChatColor.GOLD + "+ " + ChatColor.GRAY + "Cosmeticos Exclusivos",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "Boost de Niveles",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "Ajustes Especiales",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "Comandos Especiales",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "Crear Asociaciones",
                ChatColor.GREEN + "✔ " + ChatColor.GRAY + "Iconos Especiales",
                ChatColor.GRAY + "Y mas...",
                "",
                ChatColor.YELLOW + "Para ver mas perks dale click al libro de abajo."
        )));
        MVPppRankIconMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        MVPppRankIconMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        MVPppRankIcon.setItemMeta(MVPppRankIconMeta);

        ItemMeta VIPRankBookMeta = VIPRankBook.getItemMeta();
        VIPRankBookMeta.setDisplayName(ChatColor.YELLOW + "Ver Perks " + ChatColor.GREEN + "[VIP]");
        VIPRankBookMeta.setLore(new ArrayList<String>(Arrays.asList(
                ChatColor.GRAY + "Click para ver los perks del rango " + ChatColor.GREEN + "[VIP]"
        )));

        VIPRankBook.setItemMeta(VIPRankBookMeta);

        ItemMeta VIPpRankBookMeta = VIPpRankBook.getItemMeta();
        VIPpRankBookMeta.setDisplayName(ChatColor.YELLOW + "Ver Perks " + ChatColor.GREEN + "[VIP" + ChatColor.GOLD + "+" + ChatColor.GREEN + "]");
        VIPpRankBookMeta.setLore(new ArrayList<String>(Arrays.asList(
                ChatColor.GRAY + "Click para ver los perks del rango " + ChatColor.GREEN + "[VIP" + ChatColor.GOLD + "+" + ChatColor.GREEN + "]"
        )));

        VIPpRankBook.setItemMeta(VIPpRankBookMeta);

        ItemMeta MVPRankBookMeta = MVPRankBook.getItemMeta();
        MVPRankBookMeta.setDisplayName(ChatColor.YELLOW + "Ver Perks " + ChatColor.AQUA + "[MVP]");
        MVPRankBookMeta.setLore(new ArrayList<String>(Arrays.asList(
                ChatColor.GRAY + "Click para ver los perks del rango " + ChatColor.AQUA + "[MVP]"
        )));

        MVPRankBook.setItemMeta(MVPRankBookMeta);

        ItemMeta MVPpRankBookMeta = MVPpRankBook.getItemMeta();
        MVPpRankBookMeta.setDisplayName(ChatColor.YELLOW + "Ver Perks " + ChatColor.AQUA + "[MVP" + ChatColor.GOLD + "+" + ChatColor.AQUA + "]");
        MVPpRankBookMeta.setLore(new ArrayList<String>(Arrays.asList(
                ChatColor.GRAY + "Click para ver los perks del rango " + ChatColor.AQUA + "[MVP" + ChatColor.GOLD + "+" + ChatColor.AQUA + "]"
        )));

        MVPpRankBook.setItemMeta(MVPpRankBookMeta);

        ItemMeta MVPppRankBookMeta = MVPppRankBook.getItemMeta();
        MVPppRankBookMeta.setDisplayName(ChatColor.YELLOW + "Ver Perks " + ChatColor.GOLD + "[MVP++]");
        MVPppRankBookMeta.setLore(new ArrayList<String>(Arrays.asList(
                ChatColor.GRAY + "Click para ver los perks del rango " + ChatColor.GOLD + "[MVP++]"
        )));

        MVPppRankBook.setItemMeta(MVPppRankBookMeta);

        ItemMeta CloseIconMeta = CloseIcon.getItemMeta();
        CloseIconMeta.setDisplayName(ChatColor.RED + "Salir");

        CloseIcon.setItemMeta(CloseIconMeta);


        items.put("rankSelector", rankSelector);
        items.put("selectedSeparationPane", separatorPane);
        items.put("offSeparationPane", offSeparatorPane);
        items.put("VIPRankIcon", VIPRankIcon);
        items.put("VIPpRankIcon", VIPpRankIcon);
        items.put("MVPRankIcon", MVPRankIcon);
        items.put("MVPpRankIcon", MVPpRankIcon);
        items.put("MVPppRankIcon", MVPppRankIcon);
        items.put("VIPRankBook", VIPRankBook);
        items.put("VIPpRankBook", VIPpRankBook);
        items.put("MVPRankBook", MVPRankBook);
        items.put("MVPpRankBook", MVPpRankBook);
        items.put("MVPppRankBook", MVPppRankBook);
        items.put("CloseIcon", CloseIcon);

    }


    public static ItemStack getRankInventoryItems (String iName){
        return items.get(iName);
    }




}
