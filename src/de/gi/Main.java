package de.gi;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import de.gi.Cmd.MagicStickCommand;
import de.gi.Listener.MagicStick;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		
		registerCommand();
		registerEvent();
		
		System.out.println("Plugin gestartet");

		ItemStack chest = new ItemStack(Material.CHEST);
		ItemMeta meta = chest.getItemMeta();

		meta.setDisplayName("§6LuckyChest");
		chest.setItemMeta(meta);

		ShapedRecipe luckychest = new ShapedRecipe(chest);
		luckychest.shape("AAA", "AGA", "AAA");
		luckychest.setIngredient('A', Material.WOOD);
		luckychest.setIngredient('G', Material.GOLD_BLOCK);
		
		
		
		Bukkit.addRecipe(luckychest);
	}
	
	public void registerEvent() {
		
		this.getServer().getPluginManager().registerEvents(new MagicStick(), this);
		
	}
	
	public void registerCommand() {
		
		getCommand("getmagicstick").setExecutor(new MagicStickCommand());
		
	}

	public void ConfigReloader() {

		reloadConfig();
		getConfig().options().header("Dies ist eine Config");
		getConfig().addDefault("ChestInhalt", Material.DIAMOND);
		getConfig().addDefault("ItemAnzahlMeist", 10);
		getConfig().options().copyDefaults(true);
		saveConfig();
	}

}
