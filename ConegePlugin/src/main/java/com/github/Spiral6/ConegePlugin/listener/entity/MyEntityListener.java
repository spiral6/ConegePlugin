package com.github.Spiral6.ConegePlugin.listener.entity;


import org.bukkit.event.entity.EntityListener;

import com.github.Spiral6.ConegePlugin.ConegePlugin;

public class MyEntityListener extends EntityListener 
{
    @SuppressWarnings("unused")
    private final ConegePlugin _plugin;

    public MyEntityListener(final ConegePlugin plugin)
    {
        _plugin = plugin;
    }
    
}
