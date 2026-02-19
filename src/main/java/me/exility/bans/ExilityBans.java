package me.exility.bans;

import org.bukkit.plugin.java.JavaPlugin;

public class ExilityBans extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("ExilityBans ativado!");
    }

    @Override
    public void onDisable() {
        getLogger().info("ExilityBans desativado!");
    }
}
