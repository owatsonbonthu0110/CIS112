/**
 * Exercise 20 page 151 in Object-Oriented Data Structures 
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
public class MyStack {

	public static void main(String[] args) {
		
		//Create variables of type int
		int item1 = 1; int item2 = 0; int item3 = 4;
		
		//Instantiate Stack named s with type INTEGER
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(item2); s.push(item1); s.push(item1+ item3); //Pushes 0, 1, and 5 onto stack s
		
		item2 = s.peek(); //Item2 is set to the top of the stack value which is 5  
		
		s.push(item3*item3); //multiplies 4 * 4 = 16 and pushes 16 onto the stack
		s.push(item2);//pushes 5 onto the stack
		s.push(3);//pushes 3 onto the stack
		
		item1 = s.peek(); //Peeks at top of stack and sets item1 to value 3
		s.pop();//takes 3 off the top of stack //removes top element from the stack
		
		System.out.println(item1 + " " + item2 + " " + item3); //prints 3 5 4
		
		//While loop to determine if s stack isEmpty method returns false, then iterates if there are elements or an element in the stack
		while(!s.isEmpty())  
		{
			item1 = s.peek(); //sets item1 to the value that is at the top of the stack
			s.pop();//pops the top element off stack
			System.out.println(item1); //prints out the top element of the stack 
		}
		//Program prints
		//3 5 4
		//5
		//16
		//5
		//1
		//0
	}

}
