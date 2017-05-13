package de.gi.Listener;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MagicStick implements Listener {

	@EventHandler
	public void onKlickMagicStick(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		ItemStack stick = new ItemStack(Material.STICK);
		ItemMeta stickmeta = stick.getItemMeta();
		stickmeta.setDisplayName(ChatColor.DARK_PURPLE + "MagicStick");
		stick.setItemMeta(stickmeta);
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if (p.getItemInHand().equals(stick)) {
				if (stickmeta.getDisplayName().equals(ChatColor.DARK_PURPLE + "MagicStick"))

					e.getClickedBlock().setType(Material.STONE);
			}
		}
	}

}
