package me.dev.lobbymanager.command_cooldown;

import java.util.HashMap;

public class FireworkCommandCooldown {
    private static HashMap<String, Long> cd = new HashMap<>();

    public static long getCd(String pName) {
        Long pCooldown = cd.get(pName);
        if (pCooldown == null) return 0l;
        if (pCooldown > System.currentTimeMillis()) return pCooldown - System.currentTimeMillis();
        return 0l;
    }

    public static void setCooldown(String pName, Long time) {
        cd.put(pName, System.currentTimeMillis() + time);
    }

    public static boolean removeCooldown(String pName) {
        if (cd.remove(pName) == null) return false;
        return true;
    }
}
