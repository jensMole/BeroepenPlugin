package me.jensie1996.jasper;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class MainClass extends JavaPlugin{
	File file = new File(getDataFolder(), "config.yml");
	// startup
	@Override
	public void onEnable(){ 
		
		ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
		console.sendMessage(ChatColor.GREEN + "Plugin Beroepen is Geactiveerd !");
		
			//als de file nog niet bestaat eentje aanmaken.
			if(!this.file.exists()){
				getLogger().info("Config.yml niet gevonden, creeren van config.yml");
				saveDefaultConfig(); //config genereren.
			}
		// de website class :)
		
		getCommand("info").setExecutor(new Info());
	}
	
	// einde start up
	//begin command /beroep add
	public boolean onCommand(CommandSender zender, Command cmd, String label, String[] args){
		
		if(cmd.getName().equals("beroep")){
			
			//nakijken als het geen speler is en de code laten stoppen.
			if(!(zender instanceof Player)) {
				zender.sendMessage(ChatColor.RED + this.getConfig().getString("geen_speler_error"));
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
				
// kijk in config voor bericht
			}else speler.sendMessage(ChatColor.RED + this.getConfig().getString("foute_argumenten_1"));
			
			return true;
		}	
		return false;	
	}
}