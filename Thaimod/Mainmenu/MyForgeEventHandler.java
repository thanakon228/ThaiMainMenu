package Thaimod.Mainmenu;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class MyForgeEventHandler {
	
	@ForgeSubscribe
	public void joint(EntityJoinWorldEvent e) {
		System.out.println("=======================EntityJoinWorldEvent===========================");

	}
	
	@ForgeSubscribe
	@SideOnly(Side.CLIENT)
	public  void OpenGUI(GuiOpenEvent event) {

		System.out.println("=======================Call EventGUI===========================");
		if(event.gui instanceof GuiMainMenu) {
			System.out.println("==========================Change GUI=======================");
			event.setCanceled(true);
			NewMainMenu newgui = new NewMainMenu();
			event.gui = newgui;
			Minecraft.getMinecraft().displayGuiScreen(newgui);
		}
	}
}
