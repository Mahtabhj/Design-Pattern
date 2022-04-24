/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.river;

/**
 *
 * @author Hp
 */
public class ItemStatus {
    private static int itemstatus;
    private static GameObject[] northbank;
    private static GameObject[] southbank;

   	int item_size = 4;
	
	public static Boolean[] Bank = new Boolean[4];
	 private GameObject[] item;
    
    	    public static int getItemStatus(GameObject item) // create a method which returns the status of the items
    {      
      for(int i=0;i<northbank.length;i++)
         {
            if (northbank[i] == item) {
               itemstatus = 1;
            } 
         }
         
      for(int i=0;i<southbank.length;i++)
         {
            if (southbank[i] == item) {
               itemstatus = 0;
            } 
         }
      
            
        return itemstatus;
    }
}
