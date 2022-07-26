package me.dev.lobbymanager.command_cooldown;

import org.bukkit.entity.Player;

import java.util.HashMap;

public class RankGUICooldown {

    private static HashMap<String, Long> cd = new HashMap<String, Long>();

    public static void setCooldown(String pName, Long cooldown) {
        cd.put(pName, System.currentTimeMillis() + cooldown);
    }

    public static Long getCooldown(String pName) {
        Long pCooldown = cd.get(pName);
        if (pCooldown == null) return 0l;
        if (pCooldown > System.currentTimeMillis()) return pCooldown - System.currentTimeMillis();
        return 0l;
    }

    public static boolean removeCooldown (String pName) {
        if (cd.remove(pName) == null) return false;
        return true;
    }

}
