package com.github.Spiral6.ConegePlugin.listener.server;


import org.bukkit.event.server.ServerListener;

import com.github.Spiral6.ConegePlugin.ConegePlugin;

public class MyServerListener extends ServerListener 
{
    @SuppressWarnings("unused")
    private final ConegePlugin _plugin;

    public MyServerListener(final ConegePlugin plugin)
    {
        _plugin = plugin;
    }
}
