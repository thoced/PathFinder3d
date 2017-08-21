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

    private short[][][] grid3d;

    public World(){
        grid3d = new short[256][256][256];
        
        for(int x=0;x<256;x++){
            for(int y=0;y<256;y++){
                for(int z=0;z<1;z++){
                    grid3d[x][y][z] = 1;
                }
            }
        }
        
        for(int z=0;z<3;z++){
            grid3d[50][0][z] = 1;
        }
        
        
           
        
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
            if(grid3d[tx][ty][tz] == 1)
                return true;
            if(grid3d[tx][ty][tz-1] == 0)
                return true;
            
                return false;
    }

    @Override
    public float getCost(PathFindingContext context, int tx, int ty, int tz) {
       return 1f;
    }

    @Override
    public int getDepthInTiles() {
        return 256;
    }
    
}
