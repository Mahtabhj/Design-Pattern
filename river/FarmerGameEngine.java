package src.river;

import java.awt.*;
import java.util.HashMap;

public class FarmerGameEngine extends AbstractGameEngine {

    public static final Beans BEANS = new Beans();
    public static final Goose GOOSE = new Goose();
    public static final Wolf WOLF = new Wolf();
    public static final Farmer FARMER = new Farmer();

    @Override
    public int numberOfItems() {
        return itemMap.size();
    }

    @Override
    public void rowBoat() {
        assert (boatLocation != Location.BOAT);
        if (boatLocation == Location.START && getItemLocation(FARMER) == Location.BOAT) {
            boatLocation = Location.FINISH;
        } else if (boatLocation == Location.FINISH && getItemLocation(FARMER) == Location.BOAT) {
            boatLocation = Location.START;
        }
    }

    @Override
    public boolean gameIsLost() {
        if (getItemLocation(GOOSE) == Location.BOAT || getItemLocation(GOOSE) == getItemLocation(FARMER)
                || getItemLocation(GOOSE) == boatLocation) {
            return false;
        }
        return getItemLocation(GOOSE) == getItemLocation(WOLF) || getItemLocation(GOOSE) == getItemLocation(BEANS);
    }

    private Location getItemLocation(Farmer FARMER) {
        return getItemLocation(FARMER);
    }

    private Location getItemLocation(Beans FARMER) {
        return getItemLocation(FARMER);
    }

    private Location getItemLocation(Goose FARMER) {
        return getItemLocation(FARMER);
    }

    private Location getItemLocation(Wolf FARMER) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
