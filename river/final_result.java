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
public class final_result {
    
     public final_result() {
        }
    
                
		int check() {
		int num = 0;
		int i = 0;
         boolean[] Bank = null;
		//The wolf ate the goat, end of the game
		if ((Bank[0]==true && Bank[1]==true && Bank[2]==false && Bank[3]==false) || (Bank[0]==false && Bank[1]==false && Bank[2]==true && Bank[3]==true) ) {
         num = 13;
		}
		//The goat ate the cabbage, end of the game
		else if ((Bank[0]==true && Bank[1]==false && Bank[2]==false && Bank[3]==true) || (Bank[0]==false && Bank[1]==true && Bank[2]==true && Bank[3]==false) ) {
         num = 12;
        
		}
		//The wolf ate the goat, end of the game
		else if (Bank[0]==true && Bank[1]==false && Bank[2]==false && Bank[3]==false) {
        num = 14;
		}
		//All items transported to north Bank, player won
		 else if (Bank[0]==true && Bank[1] ==true && Bank[2]==true && Bank[3]==true) {
         num = 1;
       
      
      }
                	//The move was successful
		else {
			num = 0;
		}
		return num;
	}
}
		
	

