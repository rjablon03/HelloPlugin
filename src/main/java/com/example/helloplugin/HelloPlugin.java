package com.example.helloplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class HelloPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("HelloPlugin has been enabled!");
        getServer().getPluginManager().registerEvents(
                new JoinListener(),
                this
        );
    }

    @Override
    public void onDisable() {
        getLogger().info("HelloPlugin has been disabled!");
    }

    @Override
    public boolean onCommand(
            CommandSender sender,
            Command command,
            String label,
            String[] args) {

        if (command.getName().equalsIgnoreCase("hello")) {

            sender.sendMessage("Hello from my Paper plugin!");

            return true;
        }

        return false;
    }
}