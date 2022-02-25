package assignment1.week1;

public class PrimeNumber {
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare an int Input and assign a value 13

		int number=13;

				// Declare a boolean variable flag as false

				boolean flag=false;

				// Iterate from 2 to half of the input
				// Divide the input with each for loop variable and check the remainder
				for(int i=2;i<number/2;i++) {
					
					// Set the flag as true when there is no remainder
					if(number%i==0) {
						flag=true;
					}
						
					// break the iterator
					break;

				}
				// Check the flag (Provide a condition)
					
				if(!flag) {
					

					// Print 'Prime' when the condition matches

					System.out.println("Prime");
					
				}

					// Print 'Not a Prime' when the condition doesn't match 
				
				else {
					System.out.println("Not a Prime");
				}
					

				

	}

}
