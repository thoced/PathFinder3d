package javaapplication1;


import pathfinding.PathFindingContext;
import pathfinding.TileBasedMap;

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
    public void pathFinderVisited(int x, int y, int z) {
       
    }

    @Override
    public boolean blocked(PathFindingContext context, int tx, int ty, int tz) {
       return false;
    }

    @Override
    public float getCost(PathFindingContext context, int tx, int ty, int tz) {
       return 0;
    }

    @Override
    public int getDepthInTiles() {
        return 256;
    }
    
}
