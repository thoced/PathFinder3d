
import org.newdawn.slick.util.pathfinding.PathFindingContext;
import org.newdawn.slick.util.pathfinding.TileBasedMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thonon
 */
public class World implements TileBasedMap{

    private short[] grid3d;

    public World(){
        grid3d = new short[256 * 256 * 256];
    }
    
    
    
    @Override
    public int getWidthInTiles() {
       return 256;
    }

    @Override
    public int getHeightInTiles() {
       return 256;
    }

    @Override
    public void pathFinderVisited(int x, int y) {
       
    }

    @Override
    public boolean blocked(PathFindingContext context, int tx, int ty) {
       return false;
    }

    @Override
    public float getCost(PathFindingContext context, int tx, int ty) {
       return 0;
    }
    
}
