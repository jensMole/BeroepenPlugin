package me.jensie1996.jasper;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Versie implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender zender, Command cmd, String label, String[] args){
		Player speler = (Player) zender;
		speler.sendMessage(ChatColor.AQUA + "Deze functie werkt nog niet goed maar je kan het wel zien op");
		speler.sendMessage(ChatColor.AQUA + "onze website http://thebelgiumgames.co.nf/plugins/beroepen/index.html");
		// TODO Auto-generated method stub
		return true;
	}
// todo dit afwerken ! (kijken of er een update is)
}
