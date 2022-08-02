package me.dev.lobbymanager.commands.ranked.commands;
import me.dev.lobbymanager.command_cooldown.FireworkCommandCooldown;
import me.dev.lobbymanager.menus.fireworks.FireworkCustomizationGUIMenu;
import me.dev.lobbymanager.playersettings.FireworkPlayerSettings;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;
import java.util.concurrent.TimeUnit;

public class FireworkCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("server.rank.vip")) {
                if (args.length < 1) {
                    try {
                        long cooldown = FireworkCommandCooldown.getCd(p.getName());
                        if (cooldown != 0) {
                            p.sendMessage(ChatColor.RED + "Espera " + ChatColor.DARK_RED +  String.format("%d", TimeUnit.MILLISECONDS.toSeconds(cooldown)) + ChatColor.RED + " segundos para ejecutar nuevamente este comando.");
                        } else {
                            FireworkCommandCooldown.setCooldown(p.getName(), 7 * 1000l);
                            FireworkMeta fMeta = FireworkPlayerSettings.getFireworks(p.getName());
                            Boolean mountPlayer = FireworkPlayerSettings.getMountFirework(p.getName());
                            Firework f = (Firework) p.getWorld().spawnEntity(p.getLocation(), EntityType.FIREWORK);
                            if (fMeta == null) {
                                fMeta = f.getFireworkMeta();
                                fMeta.setPower(1);
                                fMeta.addEffect(FireworkEffect.builder().flicker(false).withColor(Color.WHITE).withFade(Color.WHITE).with(FireworkEffect.Type.BALL_LARGE).trail(true).build());
                                f.setFireworkMeta(fMeta);
                            } else {
                                f.setFireworkMeta(fMeta);
                                if (mountPlayer) f.setPassenger(p);
                            }
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                } else if (args[0].equalsIgnoreCase("ajustes")) {
                    p.openInventory(FireworkCustomizationGUIMenu.getFireworksInventory(p));
                } else {
                    p.sendMessage(ChatColor.RED + "Este comando no existe.");
                }
            }
        }
        return true;
    }
}
