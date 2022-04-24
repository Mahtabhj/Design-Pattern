/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.river;

import static src.river.ItemStatus.Bank;

/**
 *
 * @author Hp
 */
public class LocationStatus {
    public Location location1;
    public GameObject object1;
     
     
     public static void locate(String[] northbank,String[] southbank) 
    {
         if (Bank[0] == true){
               northbank[0] = "boat";
         } 
         else
         {
            southbank[0] = "boat";
         }
         if (Bank[3] == true){
               northbank[3] = "wolf";
         }
         else
         {
            southbank[3] = "wolf";
         }
         if (Bank[2] == true){
               northbank[2] = "goat";
         }
         else
         {
            southbank[2] = "goat";
         }
         if (Bank[1] == true){
               northbank[1] = "cabbage";
         }
         else
         {
            southbank[1] = "cabbage";
         }
         
    }
     
     public Location getLocation(GameObject object)
     {
        return location1;
     
     }

}
