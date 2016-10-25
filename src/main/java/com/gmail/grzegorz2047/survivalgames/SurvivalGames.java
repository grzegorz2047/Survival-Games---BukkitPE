package com.gmail.grzegorz2047.survivalgames;

import net.BukkitPE.plugin.PluginBase;

/**
 * Created by grzeg on 25.10.2016.
 */
public class SurvivalGames extends PluginBase {

    @Override
    public void onEnable() {
        System.out.println(this.getFullName()+" is enabled!");
    }

    @Override
    public void onDisable() {
        System.out.println(this.getFullName()+" is disabled!");
    }
}
