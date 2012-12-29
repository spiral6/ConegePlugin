package com.github.Spiral6.ConegePlugin.listener.player;


import org.bukkit.event.player.PlayerListener;

import com.github.Spiral6.ConegePlugin.ConegePlugin;

public class MyPlayerListener extends PlayerListener 
{
    @SuppressWarnings("unused")
    private final ConegePlugin _plugin;

    public MyPlayerListener(final ConegePlugin plugin)
    {
        _plugin = plugin;
    }
    
}
