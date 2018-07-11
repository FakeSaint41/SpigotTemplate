package com.fakesaint.template.commands;

import com.fakesaint.template.TemplateMain;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TemplateCommand implements CommandExecutor {

    private TemplateMain plugin;

    public TemplateCommand(TemplateMain pl){
        plugin = pl;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
       sender.sendMessage("Command Working");
        return false;
    }
}
