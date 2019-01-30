package chapter2;
//Lab Week 2
/*
 * Using the ArrayBoundedStack class, create an application EditString that prompts the user
 * for a string and then repeatedly prompts the user for changes to the string, until the user enters an X,
 * indicating the end of changes.  Legal change operations are
 * U-make letters all Uppercase
 * L-make all letters Lowercase
 * R-reverse the string
 * c ch1 ch2-change all occurrences of ch1 ch2
 * Z-undo the most recent change
 * 
 * Assume friendly user and that the user will not enter anything illegal.
 */
import java.util.*;
/**
 * @author Olivia Watson-Bonthu
 * @Date 1/28/2019
 * @CIS112 Computer Science
 * @Professor K Kelly
 */
public class EditString {

	public static void main(String[] args) {
		
		StackInterface<String> s = new ArrayBoundedStack<String>();
		
		//Keyboard
		Scanner scan = new Scanner(System.in);
		
		//Strings to save expressions
		String command;
		String currExpression;
		
		//To stop
		final String STOP = "X"; 
		
		//Allow user to type in string
		System.out.print("Please type in a string");
		currExpression = scan.nextLine(); //save in currExpression variable
      
		s.push(currExpression);//push the currExpression onto the stack
		
		do {
			System.out.println("Please type in changes to the string: " +
					"U - Uppercase\n"+
					"L - lowercase\n"+
					"R - reverse string\n" +
					"C ch1 ch2 - change all occurence of ch1 to ch2\n" +
					"Z - undo the most recent change\n" +
					"and then type " + STOP + " to stop!\n");
			command = scan.nextLine();
          
			if(command.equalsIgnoreCase("U"))
			{
				currExpression = currExpression.toUpperCase();
                s.push(currExpression);
			}
			else if(command.equalsIgnoreCase("L"))
			{
				currExpression = currExpression.toLowerCase();
                s.push(currExpression);
			}
			else if(command.equalsIgnoreCase("R")) {
                String rev = "";
                for (int i=0; i < currExpression.length(); i++) {
                    rev = currExpression.charAt(i) + rev;
                }
                currExpression = rev;
                s.push(rev);
            }
			else if(command.toUpperCase().charAt(0) == 'C') {
              String newExp = "";
              for (int i = 0; i < currExpression.length(); i++) {
                if (currExpression.charAt(i) == command.charAt(2))
                    newExp += command.charAt(4);
                else
                    newExp += currExpression.charAt(i);
              }
              currExpression = newExp;
              s.push(newExp);
            }
            else if (command.equalsIgnoreCase("Z")) {
              s.pop(); 
              currExpression = s.top() ;
               if (s.isEmpty()) {
                 s.push(currExpression);
               }
            }
		} while(!STOP.equals(command)) ;
		System.out.println(currExpression);
	
		scan.close();
		}//Close main
	}//close class
		