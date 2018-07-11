package com.fakesaint.template;

import com.fakesaint.template.commands.TemplateCommand;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class TemplateMain extends JavaPlugin {
   private FileConfiguration config;


    @Override
    public void onEnable() {
       initializeConfig();
       registerEvents();
       registerCommands();
    }

    private void registerEvents() {
        PluginManager pm = getServer().getPluginManager();


    }

    private void registerCommands(){
        getCommand("template").setExecutor(new TemplateCommand(this));

    }

    private void initializeConfig() {
        config = this.getConfig();
        config.options().copyDefaults(true);
        this.saveDefaultConfig();
    }


    @Override
    public void onDisable() {
        super.onDisable();
    }
}
