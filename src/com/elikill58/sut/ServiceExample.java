package com.elikill58.sut;

import java.util.ServiceLoader;

import org.bukkit.plugin.java.JavaPlugin;

public abstract class ServiceExample {

	
	public static void load(JavaPlugin pl) {
		ServiceLoader<ServiceExample> loaded = ServiceLoader.load(ServiceExample.class, ServiceExample.class.getClassLoader());
		int nb = 0;
		for(ServiceExample se : loaded) {
			pl.getLogger().info("Loaded " + se.getClass().getSimpleName());
			nb++;
		}
		if(nb == 0)
			pl.getLogger().severe("Failed to load examples services.");
	}
}
