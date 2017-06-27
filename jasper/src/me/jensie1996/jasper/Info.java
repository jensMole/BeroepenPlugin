package me.jensie1996.jasper;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Info implements CommandExecutor{
	
	public boolean onCommand(CommandSender zender, Command cmd, String label, String[] args){
		Player speler = (Player) zender;
				speler.sendMessage(ChatColor.DARK_AQUA + "]----------------------------[");
				speler.sendMessage(ChatColor.AQUA + "        Versie 2.1.0");
				speler.sendMessage(ChatColor.AQUA + "        Developed by: het TBG team");
				speler.sendMessage(ChatColor.AQUA + "        www.thebelgiumgames.be");
				speler.sendMessage(ChatColor.DARK_AQUA + "]----------------------------[");			
				return true;
	}
}