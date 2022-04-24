package src.river;
import river.*;
import java.awt.*;

import river.Location;

public class Beans extends GameObject {
    private Location Location;

    public Beans(String label, Location location, Color color) {
        super(label, location, color);
    }
    
    public void Beans(Location location) {
        String name = "Beans";
        this.Location = Location;
    }

}
