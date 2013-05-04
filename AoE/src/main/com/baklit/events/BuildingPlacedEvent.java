package main.com.baklit.events;

import java.util.HashMap;


import main.com.baklit.util.BuildBuilding;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.sk89q.worldedit.CuboidClipboard;
import com.sk89q.worldedit.WorldVector;

public class BuildingPlacedEvent extends Event{
	
	final HashMap<Integer, Integer> runi = new HashMap<Integer, Integer>();
	final HashMap<Integer, Integer> runo = new HashMap<Integer, Integer>();
	final HashMap<Integer, Integer> runp = new HashMap<Integer, Integer>();

	private static final HandlerList handlers = new HandlerList();
	
	public BuildingPlacedEvent(final Player playerIn, final CuboidClipboard clipBoardIn, final WorldVector blockVectorIn){
		BuildBuilding build = new BuildBuilding();
		build.buildBuilding(playerIn, clipBoardIn, blockVectorIn);
	}
		
		
	
	public HandlerList getHandlers() {
		return handlers;
	}

}
