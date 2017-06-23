package me.jensie1996.jasper;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class MainClass extends JavaPlugin{
	
	@Override
	public void onEnable(){ 
		ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
		console.sendMessage(ChatColor.GREEN + "Plugin Jasper is aangezet.");
	}
	
	public boolean onCommand(CommandSender zender, Command cmd, String label, String[] args){
		
		if(cmd.getName().equals("beroep")){
			
			//nakijken als het geen speler is en de code laten stoppen.
			if(!(zender instanceof Player)) {
				zender.sendMessage("Je bent geen speler.");
				return true;
			}
			
			Player speler = (Player) zender;
			
			int lengte = args.length;
			
			if(lengte == 1){
				
//				if(Bukkit.getPlayer(args[1])== null){
					
//					speler.sendMessage(ChatColor.RED + "Speler " + args[1] + " is niet gevonden.");
//					return true;	
//					//als je je eigen wilt genezen.
//				}else{
					
					if(args[0].equals("add")){
						
						speler.sendMessage("test");
						
					}
					
//				}
				

			}else speler.sendMessage("Foute argumenten. Gebruik /beroep add.");
			
			return true;
		}	
		return false;	
	}
}