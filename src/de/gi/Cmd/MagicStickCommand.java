package de.gi.Cmd;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MagicStickCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		Player p = (Player) sender;
		if (args.length == 0) {
			if (cmd.getName().equalsIgnoreCase("getmagicstick")) {
				ItemStack stick = new ItemStack(Material.STICK);
				ItemMeta stickmeta = stick.getItemMeta();

				stickmeta.setDisplayName(ChatColor.DARK_PURPLE + "MagicStick");
				stick.setItemMeta(stickmeta);
				p.getInventory().addItem(stick);

			}
		}

		return false;
	}

}
