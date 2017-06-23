package me.jensie1996.jasper;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class website implements CommandExecutor{
	
	public boolean onCommand(CommandSender zender, Command cmd, String label, String[] args){
		Player speler = (Player) zender;
				speler.sendMessage(ChatColor.GOLD + "Gemaakt door Jens en Jasper Copyright Thebelgiumgames 2017");
				return true;
	}
}