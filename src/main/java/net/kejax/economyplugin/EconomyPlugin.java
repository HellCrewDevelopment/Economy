package net.kejax.economyplugin;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class EconomyPlugin extends JavaPlugin {

    public static EconomyPlugin plugin; // The plugin instance

    public static PluginManager pluginManager; // The plugin manager

    @Override
    public void onEnable() {
        // Plugin startup logic
        pluginManager = this.getServer().getPluginManager();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
