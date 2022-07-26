package me.dev.lobbymanager;

import me.dev.lobbymanager.commands.GetSpawnCommand;
import me.dev.lobbymanager.commands.LobbyCommand;
import me.dev.lobbymanager.commands.SetSpawnCommand;
import me.dev.lobbymanager.commands.console.menus.RanksConsoleMenuCommand;
import me.dev.lobbymanager.commands.ranked.commands.FireworkCommand;
import me.dev.lobbymanager.commands.ranked.commands.ToggleFlyCommand;
import me.dev.lobbymanager.listeners.PlayerDamageListener;
import me.dev.lobbymanager.listeners.PlayerDeathListener;
import me.dev.lobbymanager.listeners.PlayerJoinListener;
import me.dev.lobbymanager.listeners.PlayerLeaveListener;
import me.dev.lobbymanager.listeners.menuinteractions.RankGUIInteractionsListener;
import me.dev.lobbymanager.menus.items.RankMenuItems;
import me.dev.lobbymanager.menus.items.rankbooks.RankBooksGuiItem;
import me.dev.lobbymanager.rules.RuleLoader;
import org.bukkit.plugin.java.JavaPlugin;

public final class LobbyManager extends JavaPlugin {
    private static LobbyManager plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        //REGISTER EVENTS

        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerDeathListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerDamageListener(), this);

        getServer().getPluginManager().registerEvents(new RankGUIInteractionsListener(), this);

        getServer().getPluginManager().registerEvents(new PlayerLeaveListener(), this);

        //REGISTER COMMANDS

        getCommand("setspawn").setExecutor(new SetSpawnCommand());
        getCommand("getspawn").setExecutor(new GetSpawnCommand());
        getCommand("lobby").setExecutor(new LobbyCommand());

        //RANKED COMMANDS

        getCommand("fly").setExecutor(new ToggleFlyCommand());
        getCommand("firework").setExecutor(new FireworkCommand());

        //GUI COMMANDS TRIGGERED BY HologramController (Console Command Sender)

        getCommand("launchrankgui").setExecutor(new RanksConsoleMenuCommand());

        //LOAD GAME RULES

        RuleLoader.LoadRules(getServer().getWorld("world"));

        //LOAD MENU ITEM METAS

        RankMenuItems.setMetas();
        RankBooksGuiItem.setVIPRankGUIContent();
        RankBooksGuiItem.setVIPpRankGUIContent();
        RankBooksGuiItem.setMVPRankGUIContent();
        RankBooksGuiItem.setMVPpRankGUIContent();
        RankBooksGuiItem.setMVPppRankGUIContent();


        System.out.println("[1.8.8 - Lobby Manager] Lobby Manager has successfully initialized.");
    }

    public static LobbyManager getPlugin() {
        return plugin;
    }
}
