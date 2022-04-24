/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.river;
import src.river.final_result;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class MoveCommand implements Command {
    private int choice;
    private int final_statement;
    private boolean[] Bank;
    private int num;

     public boolean execute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int execute(int final_result) {
        return false;

    Scanner user_choice = new Scanner(System.in);
		
			System.out.printf("North Bank: " ));
			System.out.println("\n--------------------------------------------------------------------\n" + 
							   "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
							   "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
						        "----------------------------------------------------------------------");
			
			System.out.printf("South Bank: " ));
			if(final_result == 0) {
				System.out.println("\n\nMove was Successful\n");
			}
         
         else if(final_result == 11) {
            System.out.println("\n ***I don't see the item in the bank***");
         }
			else if(final_result == 1) {
				System.out.println("\nAll items transported to north Bank, player won");
      
			}
			else if(final_result == 15) {
				System.out.println("\nI don't see the wolf on the North Bank");
				choice = 5;
				final_statement = 99;
			}
			else if(final_result == 12) {
				System.out.println("\nThe goat ate the cabbage");
				choice = 5;
				final_statement = 99;
			}
			else if(final_result == 13) {
				System.out.println("\nThe wolf ate the goat,  end of the game");
				choice = 5;
				final_statement = 99;
			}
			else {
				System.out.println("\nThe goat ate the cabbage and wolf ate the goat, end of the game");
				choice = 5;
				final_statement = 99;
			}
        return false;

   
        int row(int choice) {
		int result = 0;
      
		switch(choice) {
		case 1:
                {
                    boolean[] Bank = null;
                    if(Bank[0] == true) {
                        Bank[0] = false;
                        num = check();
                    }
                    else {
                        Bank[0] = true;
                        num = check();
                    }
                }
		break;
		
		case 2:{
                    boolean[] Bank = null;
                    if ( Bank[0] == true && Bank[1] == true) {
                        Bank[0] = false;
                        Bank[1] = false;
                        num = check();
                    }
                    
                    else if(Bank[0] == false && Bank[1] == false)  {
                        Bank[0] = true;
                        Bank[1] = true;
                        num=check();
                    }
                    else if ( Bank[0] == true && Bank[1] == false)
                    {
                        System.out.println("\n***I don't see the cabbage in the north bank***");
                        int num = 11;
}
                    else {
                        System.out.println("\n***I don't see the cabbage in the South bank***");
                        int num = 11;
                    }      }
			break;
		
		case 3:{
                    boolean[] Bank = null;
                    if( Bank[0] == true && Bank[2] == true) {
                        Bank[0] = false;
                        Bank[2] = false;
                        num = check();
                    }
                    else if ( Bank[0] == true && Bank[2] == false)
                    {
                        System.out.println("\n***I don't see the goat in the north bank***");
                        int num = 11;
                    }
                    else if ( Bank[0] == false && Bank[2] == false) {
                        Bank[0] = true;
                        Bank[2] = true;
                        num=check();
                    }
                    else
                    {
                        System.out.println("\n***I don't see the goat in the south bank***");
                        num=11;
                    }   }
			break;
			
		case 4://to transport wolf
			if( Bank[0] == true && Bank[3] == true) {
               Bank[0] = false;
               Bank[3] = false;
               num = check();
            }
            else if ( Bank[0] == true && Bank[3] == false)
            {
               System.out.println("\n***I don't see the wolf in the north bank***");
               num  = 11;
            }
            else if ( Bank[0] == false && Bank[3] == false) {
               Bank[0] = true;
               Bank[3] = true;
               num = check();
            }
            else
            {
               System.out.println("\n***I don't see the wolf in the south bank***");
               num = 11 ;
            }
			break;
		case 5:
			result=5;
			break;
		}
		return num;
	}
       
}

    private int check() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
