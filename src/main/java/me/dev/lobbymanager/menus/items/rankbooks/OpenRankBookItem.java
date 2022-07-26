package me.dev.lobbymanager.menus.items.rankbooks;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import me.dev.lobbymanager.LobbyManager;
import net.minecraft.server.v1_8_R3.PacketDataSerializer;
import net.minecraft.server.v1_8_R3.PacketPlayOutCustomPayload;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class OpenRankBookItem {
    private static Plugin plugin = LobbyManager.getPlugin();
    public static void OpenRankBook(Player p, String book) {

        if (p == null) return;

        int itemSlot = p.getInventory().getHeldItemSlot();
        ItemStack itemOld = p.getInventory().getItem(itemSlot);
        p.getInventory().setItem(itemSlot, RankBooksGuiItem.getRankGUIs(book));

        ByteBuf buf = Unpooled.buffer(256);
        buf.setByte(0, (byte)0);
        buf.writerIndex(1);

        PacketPlayOutCustomPayload packet = new PacketPlayOutCustomPayload("MC|BOpen", new PacketDataSerializer(buf));
        ((CraftPlayer)p).getHandle().playerConnection.sendPacket(packet);
        p.getInventory().setItem(itemSlot, itemOld);
    }
}
