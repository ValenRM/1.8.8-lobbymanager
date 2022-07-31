package me.dev.lobbymanager.playersettings;
import org.bukkit.entity.Firework;
import org.bukkit.inventory.meta.FireworkMeta;
import java.util.HashMap;

public class FireworkPlayerSettings {
    private static HashMap<String, Firework> fireworkPresets = new HashMap<>();
    private static HashMap<String, Boolean> mountFirework = new HashMap<>();

    public static void setFireworkPresets(String pName, Firework firework) {
        fireworkPresets.put(pName, firework);
    }
    public static void setMountFirework(String pName, Boolean condition) {
        mountFirework.put(pName, condition);
    }
    public static Boolean getMountFirework(String pName) {
        Boolean mountF = mountFirework.get(pName);
        if (mountF == null) return false;
        return mountF;
    }
    public static FireworkMeta getFireworks(String pName) {
        Firework f = fireworkPresets.get(pName);
        if (f != null) {
            return f.getFireworkMeta();
        }
        return null;
    }
}
