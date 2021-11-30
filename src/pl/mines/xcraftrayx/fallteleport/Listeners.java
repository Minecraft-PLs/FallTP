package pl.mines.xcraftrayx.fallteleport;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Listeners implements Listener
{
	@EventHandler
	public void onFall(PlayerMoveEvent e)
	{
		if(e.getPlayer().getWorld().getName().equalsIgnoreCase("world"))
		{
			if(e.getPlayer().getLocation().getY() < -30)
			{
				e.getPlayer().teleport(Bukkit.getWorld("world").getSpawnLocation());
			}
		}
	}
}
