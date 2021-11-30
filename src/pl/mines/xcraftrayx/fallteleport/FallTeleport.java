package pl.mines.xcraftrayx.fallteleport;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class FallTeleport extends JavaPlugin
{
	public void onEnable()
	{
		Bukkit.getPluginManager().registerEvents(new Listeners(), this);
		System.out.println("FallTeleport -30 włączony!");
	}
}