package src.river;

import java.awt.*;
import river.Location;

public class GameObject {

    private final String label;
    private Location location;
    private final Color color;

    public GameObject(String label, Location location, Color color) {
        this.label = label;
        this.location = location;
        this.color = color;
    }

    public String getLabel() {
        return label;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Color getColor() {
        return color;
    }
}
