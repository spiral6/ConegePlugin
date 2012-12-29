package com.github.Spiral6.ConegePlugin.listener.block;


import org.bukkit.event.block.BlockListener;

import com.github.Spiral6.ConegePlugin.ConegePlugin;

public class MyBlockListener extends BlockListener 
{
    @SuppressWarnings("unused")
    private final ConegePlugin _plugin;
    
    public MyBlockListener(final ConegePlugin plugin)
    {
        _plugin = plugin;
    }
    
}
