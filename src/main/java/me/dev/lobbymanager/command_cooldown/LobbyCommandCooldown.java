package me.dev.lobbymanager.command_cooldown;

import org.bukkit.entity.Player;

import java.util.HashMap;

public class LobbyCommandCooldown {

    private static HashMap<Player, Long> cd = new HashMap<Player, Long>();

    public static void setCooldown(Player p, Long cooldown) {
        cd.put(p, System.currentTimeMillis() + cooldown);
    }

    public static Long getCooldown(Player p) {
        Long pCooldown = cd.get(p);
        if (pCooldown == null) return 0l;
        if (pCooldown > System.currentTimeMillis()) return pCooldown - System.currentTimeMillis();
        return 0l;
    }

}
