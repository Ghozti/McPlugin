package me.ghozti.plugin;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BreakBlock implements Listener {

    @EventHandler
    public void onPlayerBreakBlock(BlockBreakEvent event){
        Block block = event.getBlock();

        if (block.getType() == Material.DIAMOND_ORE){
            event.setCancelled(true);
            block.setType(Material.WHITE_WOOL);
            ItemStack diamonds = new ItemStack(Material.DIAMOND, 55);
            block.getWorld().dropItemNaturally(block.getLocation(),diamonds);
        }
    }
}
