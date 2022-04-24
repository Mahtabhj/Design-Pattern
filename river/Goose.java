package src.river;

import java.awt.Color;
import river.*;
import src.river.Location;

public class Goose extends GameObject {

     private river.Location Location;

    public Goose(String label, river.Location location, Color color) {
        super(label, location, color);
    }
    
    public void Beans(river.Location location) {
        String name = "Beans";
        this.Location = Location;
    }

}
