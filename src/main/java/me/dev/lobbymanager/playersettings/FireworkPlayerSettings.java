package me.dev.lobbymanager.playersettings;

import org.bukkit.entity.Firework;
import org.bukkit.inventory.meta.FireworkMeta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FireworkPlayerSettings {
    private static HashMap<String, Firework> fireworkPresets = new HashMap<>();

    public static void setFireworkPresets(String pName, Firework firework) {
        fireworkPresets.put(pName, firework);
    }
    public static FireworkMeta getFireworks(String pName) {
        Firework f = fireworkPresets.get(pName);
        if (f != null) {
            return f.getFireworkMeta();
        }
        return null;
    }
}
