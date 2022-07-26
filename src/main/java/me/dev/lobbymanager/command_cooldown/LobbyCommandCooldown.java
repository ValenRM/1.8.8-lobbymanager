package me.dev.lobbymanager.command_cooldown;

import org.bukkit.entity.Player;

import java.util.HashMap;

public class LobbyCommandCooldown {

    private static HashMap<String, Long> cd = new HashMap<String, Long>();

    public static void setCooldown(String p, Long cooldown) {
        cd.put(p, System.currentTimeMillis() + cooldown);
    }

    public static Long getCooldown(String pName) {
        Long pCooldown = cd.get(pName);
        if (pCooldown == null) return 0l;
        if (pCooldown > System.currentTimeMillis()) return pCooldown - System.currentTimeMillis();
        return 0l;
    }

    public static boolean removeCooldown(String pName) {
        if (cd.remove(pName) == null) return false;
        return true;
    }

}
