package it.woodchuck.structure;

import sun.rmi.server.LoaderHandler;

import java.util.List;

/**
 * Created by Catramos on 11/02/2016.
 */
public class Drone {

    int maxLoad;

    Coordinates currentCoordinate;

    List<Coordinates> futureCoordinates;

    List<Product> load;
    
    public Drone(Coordinates c) {
        currentCoordinate = c;
    }

    public double timeToTravel(Coordinates a , Coordinates b){
        int x = a.getX() - b.getX();
        int y = a.getY() - b.getY();
        return Math.sqrt( x * x + y * y);
    }

    public double nextStop(){
        return timeToTravel(currentCoordinate,futureCoordinates.get(0));

    }


}
