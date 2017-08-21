/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import pathfinding.AStarPathFinder;
import pathfinding.Mover;
import pathfinding.Path;
import pathfinding.Path.Step;
import pathfinding.PathFinder;

/**
 *
 * @author thonon
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        World map = new World();
        System.out.println("creation...");
        AStarPathFinder finder = new AStarPathFinder(map,65535,true);
        System.out.println("creation terminée");
        
        Agent agent = new Agent();
        
        Path path = finder.findPath(agent, 0, 0, 1, 100, 0, 1);
        
        if(path != null)
            System.out.println("Longueur: " + path.getLength());
        else {
            System.out.println("Aucun chemin trouvé");
            return;
        }
        
        for(int i=0;i<path.getLength();i++){
            Step step = path.getStep(i);
            System.out.println("x:" +  step.getX() + " y: " + step.getY() + "z: " + step.getZ());
            
        }
    }
    
}
