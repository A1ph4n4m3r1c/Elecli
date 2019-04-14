package UserInterface;

import java.util.Scanner;

public class Elecli {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Test\n Please enter a number: ");
		
	    Scanner scanner = new Scanner( System.in );

	    String userMessage = scanner.nextLine();

	    System.out.print("You entered!: " + userMessage);
	    
	    
	}
	

}
