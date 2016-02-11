package it.woodchuck.structure;

/**
 * Created by Catramos on 11/02/2016.
 */
public class DroneOperation {

    Coordinates coordinates;

    Action action;

    public DroneOperation(Coordinates coordinates, Action action) {
        this.coordinates = coordinates;
        this.action = action;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
