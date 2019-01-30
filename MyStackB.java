/**
 * Exercise 20B page 151 in Object-Oriented Data Structures 
 * Creates a stack and manipulates the stack by using the peek, push, and pop methods.
 */
/*
 Show what is written given that item1, item2, and item3 are int
 variables, and s is an object that fits the abstract description of a stack as given in the section.
 Assume that you can store and retrieve variables of type int on s.
 */
package chapter2;

import java.util.Stack;

/**
 * @author Olivia Watson-Bonthu
 * @Date 1/28/2019
 * @CIS112 Computer Science
 * @Professor K Kelly
 */
public class MyStackB {

	public static void main(String[] args) {
		
		//Create variables of type int
		int item1 = 4; int item3 = 0; int item2 = item1 + 1;
		
		//Instantiate Stack named s with type INTEGER
		Stack<Integer> s = new Stack<Integer>();
		
				//5				//6					//4
		s.push(item2); s.push(item2 + 1); s.push(item1); //Pushes 5, 6, and 4 onto stack s
		
		//sets item2 to 4	//takes 4 off the list
		item2 = s.peek();  s.pop();  
		
		//item1 is set to 5
		item1 = item2 + 1;
		
		//5 gets added to the stack//0 gets added to the stack
		s.push(item1); s.push(item3); 
		
		
		//While loop to determine if s stack isEmpty method returns false, then iterates if there are elements or an element in the stack
		while(!s.isEmpty())  
		{
			item3 = s.peek(); //sets item1 to the value that is at the top of the stack
			s.pop();//pops the top element off stack
			System.out.println(item3); //prints out the top element of the stack 
		}
		System.out.println(item1 + " " + item2 + " " + item3);
		
		//Prints
		//0
		//5
		//6
		//5
		//5 4 5
	}

}
