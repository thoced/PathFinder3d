package pathfinding.heuristics;

import pathfinding.AStarHeuristic;
import pathfinding.Mover;
import pathfinding.TileBasedMap;

/**
 * A heuristic that uses the tile that is closest to the target
 * as the next best tile.
 * 
 * @author Kevin Glass
 */
public class ClosestHeuristic implements AStarHeuristic {
	/**
	 * @see AStarHeuristic#getCost(TileBasedMap, Mover, int, int, int, int)
	 */
	public float getCost(TileBasedMap map, Mover mover, int x, int y, int z,int tx, int ty, int tz) {		
		float dx = tx - x;
		float dy = ty - y;
                float dz = tz - z;
		
		float result = (float) (Math.sqrt((dx*dx)+(dy*dy)+(dz*dz)));
		
		return result;
	}

}
