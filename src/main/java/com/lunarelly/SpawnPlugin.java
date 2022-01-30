package com.lunarelly;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

public class SpawnPlugin extends PluginBase {

    public void onEnable() {
        getLogger().info("Плагин запущен!");
    }

    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
        if (command.getName().equals("spawn")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("Only in-game!");
                return true;
            }

            sender.sendMessage("(Spawn) Телепортация на спавн...");
            ((Player) sender).teleport(getServer().getDefaultLevel().getSafeSpawn());
        }
        return false;
    }
}