package com.github.Spiral6.ConegePlugin.listener.vehicle;


import org.bukkit.event.vehicle.VehicleListener;

import com.github.Spiral6.ConegePlugin.ConegePlugin;

public class MyVehicleListener extends VehicleListener 
{
    @SuppressWarnings("unused")
    private final ConegePlugin _plugin;
    
    public MyVehicleListener(final ConegePlugin plugin)
    {
        _plugin = plugin;
    }    

}
