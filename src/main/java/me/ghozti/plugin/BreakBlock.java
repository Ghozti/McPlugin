package me.ghozti.plugin;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BreakBlock implements Listener {

    @EventHandler
    public void onPlayerBreakBlock(BlockBreakEvent event){
        Block block = event.getBlock();

        if (block.getType() == Material.DIAMOND_ORE){

        }
    }
}
