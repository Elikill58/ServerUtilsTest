package com.elikill58.sut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import org.bukkit.plugin.java.JavaPlugin;

public class FileProvider {

	public static void load(JavaPlugin pl) {
		try (InputStream input = FileProvider.class.getResourceAsStream("/test.properties")) {
			if (input == null) {
				pl.getLogger().severe("Can't find given file.");
				return;
			}

			pl.getLogger().info("Loaded properties file:");
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8))) {
				String line;
				while ((line = reader.readLine()) != null) {
					pl.getLogger().info("> " + line);
				}
			}
		} catch (IOException e) {
			pl.getLogger().severe("Failed to read file.");
			e.printStackTrace();
		}
	}
}
