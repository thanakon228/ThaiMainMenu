package Thaimod.Mainmenu;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid="MainMenuMod", name="MainMenuMod", version="1.6.4")
@NetworkMod(clientSideRequired = true ,serverSideRequired =  false)
public class MainMenuMod {

	@SidedProxy(clientSide = "Thaimod.Mainmenu.cl",serverSide = "Thaimod.Mainmenu.sv")
	public static sv proxy ;
	@EventHandler
	public void load (FMLPreInitializationEvent e) {

		System.out.println("=======================FMLInitializationEvent===========================");
	
		proxy.register();
	}
	
}
