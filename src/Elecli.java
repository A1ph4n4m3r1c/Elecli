

import java.util.Scanner;

public class Elecli {
	
	
	Elecli() {
		System.out.println("[========== Welcome to  Elecli: Command Line, Electronics Tool ==========]\n");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner( System.in );
		
		int StopSession = 0;
		String userCommand = "start";
		
		while( !userCommand.equalsIgnoreCase("exit") ){
		
			System.out.print("\n\n\nPlease select an option: \n1: Ohm/'s Law\n"
					+ "2: Opamp Calculator \n3: Resistivity Calculator\nHelp \nExit \n --->: ");
			userCommand = scanner.nextLine();
			
			switch(userCommand.toLowerCase()) {
			case "1":
				OhmsLawCalculator();
				break;
			case "2":
				OpampCalculator();
				break;
			case "3":
				ResistivityCalculator();
				break;
			case "help":
				Help();
				break;
			case "exit":
				break;
		    default:
		    	System.out.println("\n------ Error: Unkown command -----\n");	
			}

	    
		}
	    
	    
	}
	
	private static void OpampCalculator(){
    	System.out.println("\n------ Opamp Calculator-----\n");	
    	
		
	}
	
	private static void OhmsLawCalculator(){
		
	OhmsLawUtility ohm = new OhmsLawUtility();
		
		double r,i,v;
		
		Scanner UserInputRaw = new Scanner( System.in );
		
    	System.out.println("\n------ Ohm\'s Law Calculator-----\n");
    	System.out.print("\nSolve for?:\n1:Resitance\n2:Current\n3:Voltage\n--->: ");
    	
    	String  UserInput = UserInputRaw.nextLine();
    	
    	if(UserInput.equalsIgnoreCase("1")) {
	    	System.out.print("\nEnter Voltage:");	
	    	v = Double.parseDouble(UserInputRaw.nextLine());
	    	System.out.print("\nEnter Current:");	
	    	i = Double.parseDouble(UserInputRaw.nextLine());
	    	
	    	System.out.print("The resistance of the circuit is: " + ohm.CalculateResistance(v, i) );
	    	

    	}
    	
    	else if(UserInput.equalsIgnoreCase("2")) {
    		
    	}
    	
    	else if(UserInput.equalsIgnoreCase("3")) {
    		
    	}
    	
    	else {
	    	System.out.println("\n------ Error: Unkown input -----\n");	

    	}
    	
    	
    	

	}


	private static void ResistivityCalculator(){
    	System.out.println("\n------ Resistivity Calculator-----\n");	

	}
	
	private static void Help() {
    	System.out.println("\n------ Help! ----\n");	

	}

	

}
