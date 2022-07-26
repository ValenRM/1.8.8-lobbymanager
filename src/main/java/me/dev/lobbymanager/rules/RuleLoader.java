package me.dev.lobbymanager.rules;

import org.bukkit.World;

public class RuleLoader {

    public static void LoadRules(World world) {
        world.setGameRuleValue("showDeathMessages", "false");
    }

}
