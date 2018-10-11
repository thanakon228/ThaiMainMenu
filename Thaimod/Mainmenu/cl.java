package Thaimod.Mainmenu;

import net.minecraftforge.common.MinecraftForge;

public class cl extends sv {
	@Override
	public void register() {	
		MinecraftForge.EVENT_BUS.register(new MyForgeEventHandler());
	}
}
