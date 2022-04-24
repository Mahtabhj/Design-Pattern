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
public class SouthBank extends River{
    public ItemStatus item;
   
    public String getSouthBank(Boolean[] Bank, String[] item) {
		List<String> itemList_south = new ArrayList<String>();
		//System.out.println("FROM SOUTH BANK: " + Arrays.deepToString(Bank));
		for(int i = 0; i < 4; i++) {
			if(!Bank[i]) {
				itemList_south.add(item[i]);
			}
		}
		return itemList_south.toString();
	}
   
}
