package com.elikill58.sut;

import org.bukkit.plugin.java.JavaPlugin;

public class SutPlugin extends JavaPlugin {

	@Override
	public void onEnable() {
		ServiceExample.load(this);
		FileProvider.load(this);
	}
}
