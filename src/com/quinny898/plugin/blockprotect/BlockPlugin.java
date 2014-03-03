package com.quinny898.plugin.blockprotect;

import com.mbserver.api.MBServerPlugin;
import com.mbserver.api.Manifest;

@Manifest(name = "BlockProtect")
public class BlockPlugin extends MBServerPlugin {
	static BlockPlugin context;

	public void onEnable() {
		this.getPluginManager().registerEventHandler(new BlockListener());
	}

}