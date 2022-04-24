package src.river;

import java.awt.Color;

public interface GameEngine {
    
    int numberOfItems();

    String getItemLabel(Item item);

    Color getItemColor(Item item);
 
    Location getItemLocation(Item item);
 
    void setItemLocation(Item item, Location location);
  
    Location getBoatLocation();
  
    void loadBoat(Item item);
 
    void unloadBoat(Item item);

    void rowBoat();
   
    boolean gameIsWon();
 
    boolean gameIsLost();

    void resetGame();
}
