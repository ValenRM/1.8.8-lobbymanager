package me.dev.lobbymanager.menus.items.rankbooks;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.*;
import net.md_5.bungee.chat.ComponentSerializer;
import net.md_5.bungee.chat.TextComponentSerializer;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_8_R3.inventory.CraftMetaBook;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import java.net.Proxy;
import java.util.HashMap;
import java.util.List;

public class RankBooksGuiItem {
    private static HashMap<String, ItemStack> GUIMap = new HashMap<String, ItemStack>();
    private static ItemStack VIPRankGUI= new ItemStack(Material.WRITTEN_BOOK);
    private static ItemStack VIPpRankGUI= new ItemStack(Material.WRITTEN_BOOK);
    private static ItemStack MVPRankGUI= new ItemStack(Material.WRITTEN_BOOK);
    private static ItemStack MVPpRankGUI= new ItemStack(Material.WRITTEN_BOOK);
    private static ItemStack MVPppRankGUI= new ItemStack(Material.WRITTEN_BOOK);





    public static void setVIPRankGUIContent() {
        BookMeta VIPRankGUIMeta = (BookMeta) VIPRankGUI.getItemMeta();
        VIPRankGUIMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        List<IChatBaseComponent> VIPRankGUIMetaPages = null;

        try {
            VIPRankGUIMetaPages = (List<IChatBaseComponent>) CraftMetaBook.class.getDeclaredField("pages").get(VIPRankGUIMeta);
        } catch (ReflectiveOperationException  ex) {
            ex.printStackTrace();
        }

        TextComponent s1 = new TextComponent(ChatColor.DARK_GRAY + "Perks" + ChatColor.GREEN + " [VIP]\n\n");
        TextComponent s2 = new TextComponent(ChatColor.DARK_GRAY + "- Chat Prefix: " + ChatColor.GREEN + "[VIP]\n");
        s2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Tu rango " + ChatColor.GREEN + "[VIP] " + ChatColor.GRAY + "va a aparecer antes que tu nombre en el chat").create()));
        TextComponent s3 = new TextComponent(ChatColor.DARK_GRAY + "- Nombre: " + ChatColor.GREEN + "VERDE\n");
        s3.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "El color de rango " + ChatColor.GREEN + "VERDE " + ChatColor.GRAY + "afecta el color de tu nombre en el chat").create()));
        TextComponent s4 = new TextComponent(ChatColor.DARK_GRAY + "- 90" + ChatColor.GREEN + "+" + ChatColor.DARK_GRAY + " Cosmeticos Exclusivos\n");
        s4.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Desbloquea la adquisicion de mas de " + ChatColor.GREEN + "90 " + ChatColor.GRAY + "cosmeticos de diferentes modalidades!").create()));
        TextComponent s5 = new TextComponent(ChatColor.DARK_GRAY + "- Comando " + ChatColor.GREEN + "/fly\n");
        s5.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Desbloquea el comando " + ChatColor.GREEN + "/fly " + ChatColor.GRAY + "en lobbys").create()));
        TextComponent s6 = new TextComponent(ChatColor.DARK_GRAY + "- Comando /fw\n");
        s6.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Desbloquea el comando " + ChatColor.GREEN + "/fw" + ChatColor.GRAY + ", que spawnea un cohete en el lobby").create()));
        TextComponent s7 = new TextComponent(ChatColor.DARK_GRAY + "- Cajas " + ChatColor.LIGHT_PURPLE + "☆4\n\n");
        s7.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Desbloquea apertura de cajas " + ChatColor.LIGHT_PURPLE + "☆4" + ChatColor.GRAY + "!").create()));
        TextComponent s8 = new TextComponent(ChatColor.RED + "" + ChatColor.BOLD + " MAS INFORMACION\n\n");

        TextComponent s9 = new TextComponent(ChatColor.GOLD + "" + ChatColor.BOLD + "   RESHARPENED\n       STORE");
        s9.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.spigotmc.org/wiki/interactive-books/"));
        s9.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Abre la tienda del servidor en el navegador").create()));




        IChatBaseComponent VIPRankGUIPage1 = IChatBaseComponent.ChatSerializer.a(ComponentSerializer.toString(s1, s2, s3, s4, s5, s6, s7, s8, s9));

        VIPRankGUIMetaPages.add(VIPRankGUIPage1);

        VIPRankGUI.setItemMeta(VIPRankGUIMeta);

        GUIMap.put("VIPRankGUI", VIPRankGUI);
    }

    public static void setVIPpRankGUIContent() {
        BookMeta VIPpRankGUIMeta = (BookMeta) VIPpRankGUI.getItemMeta();
        VIPpRankGUIMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        List<IChatBaseComponent> VIPpRankGUIMetaPages = null;

        try {
            VIPpRankGUIMetaPages = (List<IChatBaseComponent>) CraftMetaBook.class.getDeclaredField("pages").get(VIPpRankGUIMeta);
        } catch (ReflectiveOperationException  ex) {
            ex.printStackTrace();
        }

        TextComponent s1 = new TextComponent(ChatColor.DARK_GRAY + "Perks" + ChatColor.GREEN + " [VIP" + ChatColor.GOLD + "+" + ChatColor.GREEN + "]\n\n");
        TextComponent s2 = new TextComponent(ChatColor.DARK_GRAY + "- Chat Prefix: " + ChatColor.GREEN + "[VIP" + ChatColor.GOLD + "+" + ChatColor.GREEN + "]\n");
        s2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Tu rango " + ChatColor.GREEN + "[VIP" + ChatColor.GOLD + "+" + ChatColor.GREEN + "] " + ChatColor.GRAY + "va a aparecer antes que tu nombre en el chat").create()));
        TextComponent s3 = new TextComponent(ChatColor.DARK_GRAY + "- Nombre: " + ChatColor.GREEN + "VERDE\n");
        s3.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "El color de rango " + ChatColor.GREEN + "VERDE " + ChatColor.GRAY + "afecta el color de tu nombre en el chat").create()));
        TextComponent s4 = new TextComponent(ChatColor.DARK_GRAY + "- 120" + ChatColor.GREEN + "+" + ChatColor.DARK_GRAY + " Cosmeticos Exclusivos\n");
        s4.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Desbloquea la adquisicion de mas de " + ChatColor.GREEN + "120 " + ChatColor.GRAY + "cosmeticos de diferentes modalidades!").create()));
        TextComponent s5 = new TextComponent(ChatColor.DARK_GRAY + "- Comando " + ChatColor.GREEN + "/fly\n");
        s5.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Desbloquea el comando " + ChatColor.GREEN + "/fly " + ChatColor.GRAY + "en lobbys").create()));
        TextComponent s6 = new TextComponent(ChatColor.DARK_GRAY + "- Comando /fw\n");
        s6.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Desbloquea el comando " + ChatColor.GREEN + "/fw" + ChatColor.GRAY + ", que spawnea un cohete en el lobby").create()));
        TextComponent s7 = new TextComponent(ChatColor.DARK_GRAY + "- Cajas " + ChatColor.LIGHT_PURPLE + "☆4\n");
        s7.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Desbloquea apertura de cajas " + ChatColor.LIGHT_PURPLE + "☆4" + ChatColor.GRAY + "!").create()));
        TextComponent s8 = new TextComponent(ChatColor.DARK_GRAY + "- Crear" + ChatColor.GREEN + " Asociaciones \n\n");
        s8.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Crea asociaciones para competir con otras, y ganar premios" + ChatColor.GREEN + " exclusivos" + ChatColor.GRAY + "!").create()));



        TextComponent s9 = new TextComponent(ChatColor.RED + "" + ChatColor.BOLD + " MAS INFORMACION\n\n");

        TextComponent s10 = new TextComponent(ChatColor.GOLD + "" + ChatColor.BOLD + "   RESHARPENED\n       STORE");
        s10.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.spigotmc.org/wiki/interactive-books/"));
        s10.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Abre la tienda del servidor en el navegador").create()));




        IChatBaseComponent VIPpRankGUIPage1 = IChatBaseComponent.ChatSerializer.a(ComponentSerializer.toString(s1, s2, s3, s4, s5, s6, s7, s8));
        IChatBaseComponent VIPpRankGUIPage2 = IChatBaseComponent.ChatSerializer.a(ComponentSerializer.toString(s9, s10));

        VIPpRankGUIMetaPages.add(VIPpRankGUIPage1);
        VIPpRankGUIMetaPages.add(VIPpRankGUIPage2);

        VIPpRankGUI.setItemMeta(VIPpRankGUIMeta);

        GUIMap.put("VIPpRankGUI", VIPpRankGUI);
    }
    public static void setMVPRankGUIContent() {
        BookMeta MVPRankGUIMeta = (BookMeta) MVPRankGUI.getItemMeta();
        MVPRankGUIMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        List<IChatBaseComponent> MVPRankGUIMetaPages = null;

        try {
            MVPRankGUIMetaPages = (List<IChatBaseComponent>) CraftMetaBook.class.getDeclaredField("pages").get(MVPRankGUIMeta);
        } catch (ReflectiveOperationException  ex) {
            ex.printStackTrace();
        }

        TextComponent s1 = new TextComponent(ChatColor.DARK_GRAY + "Perks" + ChatColor.AQUA + " [MVP]\n\n");
        TextComponent s2 = new TextComponent(ChatColor.DARK_GRAY + "- Chat Prefix: " + ChatColor.AQUA + "[MVP]\n");
        s2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Tu rango " + ChatColor.AQUA + "[MVP] " + ChatColor.GRAY + "va a aparecer antes que tu nombre en el chat").create()));
        TextComponent s3 = new TextComponent(ChatColor.DARK_GRAY + "- Nombre: " + ChatColor.AQUA + "CYAN\n");
        s3.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "El color de rango " + ChatColor.AQUA + "CYAN " + ChatColor.GRAY + "afecta el color de tu nombre en el chat").create()));
        TextComponent s4 = new TextComponent(ChatColor.DARK_GRAY + "- 150" + ChatColor.AQUA + "+" + ChatColor.DARK_GRAY + " Cosmeticos Exclusivos\n");
        s4.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Desbloquea la adquisicion de mas de " + ChatColor.AQUA + "150 " + ChatColor.GRAY + "cosmeticos de diferentes modalidades!").create()));
        TextComponent s5 = new TextComponent(ChatColor.DARK_GRAY + "- Comando " + ChatColor.AQUA + "/fly\n");
        s5.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Desbloquea el comando " + ChatColor.AQUA + "/fly " + ChatColor.GRAY + "en lobbys").create()));
        TextComponent s6 = new TextComponent(ChatColor.DARK_GRAY + "- Comando /fw\n");
        s6.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Desbloquea el comando " + ChatColor.AQUA + "/fw" + ChatColor.GRAY + ", que spawnea un cohete en el lobby").create()));
        TextComponent s7 = new TextComponent(ChatColor.DARK_GRAY + "- Cajas " + ChatColor.LIGHT_PURPLE + "☆5\n");
        s7.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Desbloquea apertura de cajas " + ChatColor.LIGHT_PURPLE + "☆5" + ChatColor.GRAY + "!").create()));
        TextComponent s8 = new TextComponent(ChatColor.DARK_GRAY + "- Crear" + ChatColor.AQUA + " Asociaciones \n");
        s8.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Crea asociaciones para competir con otras, y ganar premios" + ChatColor.AQUA + " exclusivos" + ChatColor.GRAY + "!").create()));
        TextComponent s9 = new TextComponent(ChatColor.DARK_GRAY + "- Boost de " + ChatColor.AQUA + "EXP" + ChatColor.DARK_GRAY + " de Asociaciones\n");
        s9.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Multiplica la cantidad de EXP que obtiene tu asociacion " + ChatColor.AQUA + "x1.50" + ChatColor.GRAY + "!").create()));
        TextComponent s10 = new TextComponent(ChatColor.DARK_GRAY + "- Multiplicador de Monedas\n");
        s10.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Multiplica las monedas obtenidas en minijuegos" + ChatColor.AQUA + " x1.50" + ChatColor.GRAY + "!").create()));



        TextComponent s11 = new TextComponent(ChatColor.RED + "" + ChatColor.BOLD + " MAS INFORMACION\n\n");

        TextComponent s12 = new TextComponent(ChatColor.GOLD + "" + ChatColor.BOLD + "   RESHARPENED\n       STORE");
        s12.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.spigotmc.org/wiki/interactive-books/"));
        s12.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Abre la tienda del servidor en el navegador").create()));




        IChatBaseComponent MVPRankGUIPage1 = IChatBaseComponent.ChatSerializer.a(ComponentSerializer.toString(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10));
        IChatBaseComponent MVPRankGUIPage2 = IChatBaseComponent.ChatSerializer.a(ComponentSerializer.toString(s11, s12));

        MVPRankGUIMetaPages.add(MVPRankGUIPage1);
        MVPRankGUIMetaPages.add(MVPRankGUIPage2);

        MVPRankGUI.setItemMeta(MVPRankGUIMeta);

        GUIMap.put("MVPRankGUI", MVPRankGUI);
    }

    public static void setMVPpRankGUIContent() {
        BookMeta MVPpRankGUIMeta = (BookMeta) MVPpRankGUI.getItemMeta();
        MVPpRankGUIMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        List<IChatBaseComponent> MVPpRankGUIMetaPages = null;

        try {
            MVPpRankGUIMetaPages = (List<IChatBaseComponent>) CraftMetaBook.class.getDeclaredField("pages").get(MVPpRankGUIMeta);
        } catch (ReflectiveOperationException  ex) {
            ex.printStackTrace();
        }

        TextComponent s1 = new TextComponent(ChatColor.DARK_GRAY + "Perks" + ChatColor.AQUA + " [MVP" + ChatColor.GOLD + "+" + ChatColor.AQUA + "]\n");
        TextComponent s2 = new TextComponent(ChatColor.DARK_GRAY + "- Chat Prefix:" + ChatColor.AQUA + " [MVP" + ChatColor.GOLD + "+" + ChatColor.AQUA + "]\n");
        s2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Tu rango " + ChatColor.AQUA + "[MVP" + ChatColor.GOLD + "+" + ChatColor.AQUA + "] " + ChatColor.GRAY + "va a aparecer antes que tu nombre en el chat").create()));
        TextComponent s3 = new TextComponent(ChatColor.DARK_GRAY + "- Nombre: " + ChatColor.AQUA + "CYAN\n");
        s3.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "El color de rango " + ChatColor.AQUA + "CYAN " + ChatColor.GRAY + "afecta el color de tu nombre en el chat").create()));
        TextComponent s4 = new TextComponent(ChatColor.DARK_GRAY + "- 190" + ChatColor.AQUA + "+" + ChatColor.DARK_GRAY + " Cosmeticos Exclusivos\n");
        s4.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Desbloquea la adquisicion de mas de " + ChatColor.AQUA + "190 " + ChatColor.GRAY + "cosmeticos de diferentes modalidades!").create()));
        TextComponent s5 = new TextComponent(ChatColor.DARK_GRAY + "- Comando " + ChatColor.AQUA + "/fly\n");
        s5.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Desbloquea el comando " + ChatColor.AQUA + "/fly " + ChatColor.GRAY + "en lobbys").create()));
        TextComponent s6 = new TextComponent(ChatColor.DARK_GRAY + "- Comando /fw\n");
        s6.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Desbloquea el comando " + ChatColor.AQUA + "/fw" + ChatColor.GRAY + ", que spawnea un cohete en el lobby").create()));
        TextComponent s7 = new TextComponent(ChatColor.DARK_GRAY + "- Cajas " + ChatColor.LIGHT_PURPLE + "☆5\n");
        s7.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Desbloquea apertura de cajas " + ChatColor.LIGHT_PURPLE + "☆5" + ChatColor.GRAY + "!").create()));
        TextComponent s8 = new TextComponent(ChatColor.DARK_GRAY + "- Crear" + ChatColor.AQUA + " Asociaciones \n");
        s8.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Crea asociaciones para competir con otras, y ganar premios" + ChatColor.AQUA + " exclusivos" + ChatColor.GRAY + "!").create()));
        TextComponent s9 = new TextComponent(ChatColor.DARK_GRAY + "- Boost de " + ChatColor.AQUA + "EXP" + ChatColor.DARK_GRAY + " de Asociaciones\n");
        s9.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Multiplica la cantidad de EXP que obtiene tu asociacion " + ChatColor.AQUA + "x1.75" + ChatColor.GRAY + "!").create()));
        TextComponent s10 = new TextComponent(ChatColor.DARK_GRAY + "- Multiplicador de Monedas\n");
        s10.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Multiplica las monedas obtenidas en minijuegos" + ChatColor.AQUA + " x1.75" + ChatColor.GRAY + "!").create()));

        TextComponent s11 = new TextComponent(ChatColor.DARK_GRAY + "- Multiplicador de EXP\n");
        s11.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Multiplica la cantidad de EXP obtenida en minijuegos" + ChatColor.AQUA + " x1.50" + ChatColor.GRAY + "!").create()));
        TextComponent s12 = new TextComponent(ChatColor.DARK_GRAY + "- " + ChatColor.AQUA + "Ajustes Especiales\n\n");
        s12.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Mas informacion en la tienda oficial").create()));

        TextComponent s13 = new TextComponent(ChatColor.RED + "" + ChatColor.BOLD + " MAS INFORMACION\n\n");

        TextComponent s14 = new TextComponent(ChatColor.GOLD + "" + ChatColor.BOLD + "   RESHARPENED\n       STORE");
        s14.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.spigotmc.org/wiki/interactive-books/"));
        s14.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Abre la tienda del servidor en el navegador").create()));




        IChatBaseComponent MVPpRankGUIPage1 = IChatBaseComponent.ChatSerializer.a(ComponentSerializer.toString(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10));
        IChatBaseComponent MVPpRankGUIPage2 = IChatBaseComponent.ChatSerializer.a(ComponentSerializer.toString(s11, s12, s13, s14));

        MVPpRankGUIMetaPages.add(MVPpRankGUIPage1);
        MVPpRankGUIMetaPages.add(MVPpRankGUIPage2);

        MVPpRankGUI.setItemMeta(MVPpRankGUIMeta);

        GUIMap.put("MVPpRankGUI", MVPpRankGUI);
    }

    public static void setMVPppRankGUIContent() {
        BookMeta MVPppRankGUIMeta = (BookMeta) MVPppRankGUI.getItemMeta();
        MVPppRankGUIMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        List<IChatBaseComponent> MVPppRankGUIMetaPages = null;

        try {
            MVPppRankGUIMetaPages = (List<IChatBaseComponent>) CraftMetaBook.class.getDeclaredField("pages").get(MVPppRankGUIMeta);
        } catch (ReflectiveOperationException  ex) {
            ex.printStackTrace();
        }

        TextComponent s1 = new TextComponent(ChatColor.DARK_GRAY + "Perks" + ChatColor.GOLD + " [MVP++]\n");
        TextComponent s2 = new TextComponent(ChatColor.DARK_GRAY + "- Chat Prefix:" + ChatColor.GOLD + " [MVP++]\n");
        s2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Tu rango " + ChatColor.GOLD + "[MVP++] " + ChatColor.GRAY + "va a aparecer antes que tu nombre en el chat").create()));
        TextComponent s3 = new TextComponent(ChatColor.DARK_GRAY + "- Nombre: " + ChatColor.GOLD + "NARANJA\n");
        s3.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "El color de rango " + ChatColor.GOLD + "NARANJA " + ChatColor.GRAY + "afecta el color de tu nombre en el chat").create()));
        TextComponent s4 = new TextComponent(ChatColor.DARK_GRAY + "- 220" + ChatColor.GOLD + "+" + ChatColor.DARK_GRAY + " Cosmeticos Exclusivos\n");
        s4.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Desbloquea la adquisicion de mas de " + ChatColor.GOLD + "220 " + ChatColor.GRAY + "cosmeticos de diferentes modalidades!").create()));
        TextComponent s5 = new TextComponent(ChatColor.DARK_GRAY + "- Comando " + ChatColor.GOLD + "/fly\n");
        s5.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Desbloquea el comando " + ChatColor.GOLD + "/fly " + ChatColor.GRAY + "en lobbys").create()));
        TextComponent s6 = new TextComponent(ChatColor.DARK_GRAY + "- Comando /fw\n");
        s6.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Desbloquea el comando " + ChatColor.GOLD + "/fw" + ChatColor.GRAY + ", que spawnea un cohete en el lobby").create()));
        TextComponent s7 = new TextComponent(ChatColor.DARK_GRAY + "- Cajas " + ChatColor.LIGHT_PURPLE + "☆5\n");
        s7.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Desbloquea apertura de cajas " + ChatColor.LIGHT_PURPLE + "☆5" + ChatColor.GRAY + "!").create()));
        TextComponent s8 = new TextComponent(ChatColor.DARK_GRAY + "- Crear" + ChatColor.GOLD + " Asociaciones \n");
        s8.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Crea asociaciones para competir con otras, y ganar premios" + ChatColor.GOLD + " exclusivos" + ChatColor.GRAY + "!").create()));
        TextComponent s9 = new TextComponent(ChatColor.DARK_GRAY + "- Boost de " + ChatColor.GOLD + "EXP" + ChatColor.DARK_GRAY + " de Asociaciones\n");
        s9.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Multiplica la cantidad de EXP que obtiene tu asociacion " + ChatColor.GOLD + "x2.0" + ChatColor.GRAY + "!").create()));
        TextComponent s10 = new TextComponent(ChatColor.DARK_GRAY + "- Multiplicador de Monedas\n");
        s10.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Multiplica las monedas obtenidas en minijuegos" + ChatColor.GOLD + " x2.0" + ChatColor.GRAY + "!").create()));

        TextComponent s11 = new TextComponent(ChatColor.DARK_GRAY + "- Multiplicador de EXP\n");
        s11.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Multiplica la cantidad de EXP obtenida en minijuegos" + ChatColor.GOLD + " x1.75" + ChatColor.GRAY + "!").create()));
        TextComponent s12 = new TextComponent(ChatColor.DARK_GRAY + "- " + ChatColor.GOLD + "Ajustes Especiales\n");
        s12.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Mas informacion en la tienda oficial").create()));
        TextComponent s13 = new TextComponent(ChatColor.DARK_GRAY + "- Comandos" + ChatColor.GOLD + " Especiales\n");
        s13.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Mas informacion en la tienda oficial").create()));
        TextComponent s14 = new TextComponent(ChatColor.DARK_GRAY + "- Cosmeticos" + ChatColor.GOLD + " Exclusivos\n");
        s14.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Mas informacion en la tienda oficial").create()));
        TextComponent s15 = new TextComponent(ChatColor.DARK_GRAY + "- Titulos" + ChatColor.GOLD + " Exclusivos\n");
        s15.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Mas informacion en la tienda oficial").create()));
        TextComponent s16 = new TextComponent(ChatColor.DARK_GRAY + "- Iconos" + ChatColor.GOLD + " Exclusivos\n\n");
        s16.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Mas informacion en la tienda oficial").create()));

        TextComponent s17 = new TextComponent(ChatColor.RED + "" + ChatColor.BOLD + " MAS INFORMACION\n\n");

        TextComponent s18 = new TextComponent(ChatColor.GOLD + "" + ChatColor.BOLD + "   RESHARPENED\n       STORE");
        s18.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.spigotmc.org/wiki/interactive-books/"));
        s18.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(ChatColor.GRAY + "Abre la tienda del servidor en el navegador").create()));




        IChatBaseComponent MVPppRankGUIPage1 = IChatBaseComponent.ChatSerializer.a(ComponentSerializer.toString(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10));
        IChatBaseComponent MVPppRankGUIPage2 = IChatBaseComponent.ChatSerializer.a(ComponentSerializer.toString(s11, s12, s13, s14, s15, s16, s17, s18));

        MVPppRankGUIMetaPages.add(MVPppRankGUIPage1);
        MVPppRankGUIMetaPages.add(MVPppRankGUIPage2);

        MVPppRankGUI.setItemMeta(MVPppRankGUIMeta);

        GUIMap.put("MVPppRankGUI", MVPppRankGUI);
    }

    public static ItemStack getRankGUIs(String item) {
        return GUIMap.get(item);
    }
}
