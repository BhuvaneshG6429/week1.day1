package assignment3.week1;

public class NegativeToPostive {

	public static void main(String[] args) {
		
		//1. Initialize an integer with a negative number
				int number=-40;
				int finalNum=0;
				
				//2. Check if the number is a negative number 
				if(number<0) {
					
				//3. If so, convert the number to a positive number
					finalNum = number*(-1);
					System.out.println("The number "+number+" is converted to "+finalNum);
				}
				else {
					finalNum = number;
					System.out.println("The number is positive");
				}
	}

}
