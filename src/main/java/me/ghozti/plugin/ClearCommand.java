package me.ghozti.plugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class ClearCommand implements CommandExecutor {

    final Main main;

    public ClearCommand(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;

            if (player.isOp() || player.hasPermission("clearinventory")){
                Inventory inv = player.getInventory();
                inv.clear();

                player.sendMessage(ChatColor.RED + "your inventory is clear");
            }
        }else {
            main.getLogger().info("hey, console!");
            return true;//returning true will not print an error in the console
        }
        return false;
    }
}
