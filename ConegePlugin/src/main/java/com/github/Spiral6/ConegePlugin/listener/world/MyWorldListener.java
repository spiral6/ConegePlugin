package com.github.Spiral6.ConegePlugin.listener.world;


import org.bukkit.event.world.WorldListener;

import com.github.Spiral6.ConegePlugin.ConegePlugin;

public class MyWorldListener extends WorldListener 
{
    @SuppressWarnings("unused")
    private final ConegePlugin _plugin;
    
    public MyWorldListener(final ConegePlugin plugin)
    {
        _plugin = plugin;
    }

}
