package com.incraftion.j2ther.angrypigzombies;

import org.bukkit.entity.PigZombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class MobListener implements Listener {
	public static Main plugin;
	public void Moblistener(Main instance) {
		plugin = instance;
	}
	
	@EventHandler
	public void onCreatureSpawn(CreatureSpawnEvent event){
		if(event.getEntity() instanceof PigZombie){
			setAngry(true);						
		}			
		
	}

	private void setAngry(boolean angry){
	}
	
	
}