package com.pinont.simplePlugin;

import com.pinont.piXLib.PiXLib;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;
import java.util.Map;

public final class SimplePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        // add listeners and commands here for registration
        PiXLib.listeners.addAll(List.of());
        PiXLib.commands.putAll(Map.of());

        // setup plugin
        PiXLib.setPlugin(this);

        /*
         * add your code here
         */
    }

    @Override
    public void onDisable() {
        /*
         * add your code here
         */

        // unregister the plugin
        PiXLib.unregister();
    }

    public static SimplePlugin getInstance() {
        return (SimplePlugin) PiXLib.getPlugin();
    }
}
