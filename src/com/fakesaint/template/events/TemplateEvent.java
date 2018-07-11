package com.fakesaint.template.events;

import com.fakesaint.template.TemplateMain;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class TemplateEvent implements Listener {

    public TemplateMain plugin;
    TemplateEvent(TemplateMain pl){
        plugin = pl;
    }


    @EventHandler
    void onTemplateEvent(PlayerInteractEvent event){

        event.getPlayer().sendMessage("Event Working!");
    }

}
