
package src.river;
import java.awt.Color;
import river.*;
import river.Location;

public class Farmer extends GameObject {

   private Location Location;

    public Farmer(String label, Location location, Color color) {
        super(label, location, color);
    }
    
    public void Beans(Location location) {
        String name = "Beans";
        this.Location = Location;
    }

}
