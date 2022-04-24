/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.river;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hp
 */
public class NorthBank extends River{
    
    public String getNorthBank(Boolean[] Bank, String[] item) {
		List<String> itemList_north = new ArrayList<String>();
		//System.out.println("FROM NORTH BANK : " + Arrays.deepToString(Bank));
		for(int i = 0; i < 4; i++) {
			if(Bank[i] == true) {
				itemList_north.add(item[i]);
			}
		}
		return itemList_north.toString();
	} 
	
}
