package com.quinny898.plugin.blockprotect;

import com.mbserver.api.events.BlockBreakEvent;
import com.mbserver.api.events.BlockPlaceEvent;
import com.mbserver.api.events.EventHandler;
import com.mbserver.api.events.Listener;

public class BlockListener implements Listener {

	@EventHandler
	public void onBlockBreak(BlockBreakEvent event) {
		if (event.getPlayer().getHandItem() == 416) {
			// Player is using hammer
			if (event.getPlayer().hasPermission("op")) {
				// Player is mod/admin, we're good
				event.setCancelled(false);
			} else {
				event.getPlayer().sendMessage(
						"You do not have the permission to use this tool!");
				event.setCancelled(true);
			}
		}
	}

	@EventHandler
	public void onBlockPlace(BlockPlaceEvent event) {
		short block = event.getBlock().getBlockID();
		if (block == 327 || block == 10 || block == 11 || block == 326
				|| block == 8 || block == 9 || block == 7) {
			if (event.getPlayer().hasPermission("op")) {
				// Player is mod/admin, we're good
				event.setCancelled(false);
			} else {
				event.getPlayer().sendMessage(
						"You do not have the permission to place this block!");
				event.setCancelled(true);
			}
		}
	}

}