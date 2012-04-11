package com.incraftion.j2ther.angrypigzombies;

import java.util.logging.Logger;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public static Main Instance;
	public static final Logger log = Logger.getLogger("Minecraft");
	public final MobListener mListener = new MobListener();

	@Override
	public void onDisable() {
		Main.log.info("AngryPigZombies is disabled!");
	}

	@Override
	public void onEnable() {
		Instance = this;
		PluginDescriptionFile pdf = getDescription();
		Main.log.info(pdf.getName() + " Version" + pdf.getVersion()	+ " is enabled!");
		
		//Register Events
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this.mListener, this);
	}
	

}