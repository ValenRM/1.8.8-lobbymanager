package me.dev.lobbymanager.menus.fireworks;

import me.dev.lobbymanager.customheads.CreateCustomHead;
import net.citizensnpcs.npc.ai.speech.Chat;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

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
    private static ItemStack saveItem = new ItemStack(Material.GREEN_RECORD);
    private static ItemStack closeItem = new ItemStack(Material.BARRIER);
    private static ItemStack creeperBurst = new ItemStack(Material.SKULL_ITEM, 1, (byte) 4);
    private static ItemStack smallBallBurst = new ItemStack(Material.SNOW_BALL);
    private static ItemStack bigBallBurst = new ItemStack(Material.SLIME_BALL);
    private static ItemStack starBurst = new ItemStack(Material.NETHER_STAR);





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

        ItemMeta saveItemMeta = saveItem.getItemMeta();
        saveItemMeta.setDisplayName(ChatColor.GREEN + "Guardar");
        saveItemMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        saveItem.setItemMeta(saveItemMeta);

        ItemMeta closeItemMeta = closeItem.getItemMeta();
        closeItemMeta.setDisplayName(ChatColor.RED + "Salir");
        closeItem.setItemMeta(closeItemMeta);

        ItemMeta creeperBurstMeta = creeperBurst.getItemMeta();
        creeperBurstMeta.setDisplayName(ChatColor.GREEN + "Explosion de Creeper");
        creeperBurst.setItemMeta(creeperBurstMeta);

        ItemMeta smallBurstMeta = smallBallBurst.getItemMeta();
        smallBurstMeta.setDisplayName(ChatColor.GREEN + "Explosion Chica");
        smallBallBurst.setItemMeta(smallBurstMeta);

        ItemMeta bigBurstMeta = bigBallBurst.getItemMeta();
        bigBurstMeta.setDisplayName(ChatColor.GREEN + "Explosion Grande");
        bigBallBurst.setItemMeta(bigBurstMeta);

        ItemMeta starBurstMeta = starBurst.getItemMeta();
        starBurstMeta.setDisplayName(ChatColor.GREEN + "Explosion de Estrella");
        starBurst.setItemMeta(starBurstMeta);

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
        items.put("saveItem", saveItem);
        items.put("closeItem", closeItem);
        items.put("creeperBurst", CreateCustomHead.GetSkull(ChatColor.GREEN + "Explosion de Creeper", "e7d7275cbebed85482012941c5cc6c30020765406376e81ffb4b213f1bff4417"));
        items.put("smallBallBurst", CreateCustomHead.GetSkull(ChatColor.GREEN + "Explosion Chica", "b0cc932d8c4916e7fa56344be58029eac0f03e35e8a0d0d7a8c5a1c36a496cff"));
        items.put("bigBallBurst", CreateCustomHead.GetSkull(ChatColor.GREEN + "Explosion Grande", "909b07967457d49da6772108e866e1229d0c948d01ec645a9f610505dd90aca4"));
        items.put("starBurst", CreateCustomHead.GetSkull(ChatColor.GREEN + "Explosion de Estrella", "34fec5cdc2e22401a4b5ba376ffe647279ed3f94fd75f8056d986f33c931ac55"));
        items.put("upwardsBurst", CreateCustomHead.GetSkull(ChatColor.GREEN + "Explosion Especial", "315bbda12e1b832a6a6af85d8439152d9157ce104e6a7f7b36aeaccc863544"));
        items.put("rideFirework", CreateCustomHead.GetSkull(ChatColor.GREEN + "Montar Cohete", "760a08da8d3e73c5addcc103895656ac404ff42f2d5b5b746ccde607ce90443c"));






    }

    public static ItemStack getItem(String item) {
        return items.get(item);
    }
}
