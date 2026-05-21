package com.training;
import java.util.Scanner;
public class Demo {
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(true) {
			System.out.println("Enter X to exit or any other key to continue");
			String choice = sc.nextLine();
			if(choice.equalsIgnoreCase("X")) {
				break;
			}
			i++;
			System.out.println("Enter first name for customer:" +i );
			sc.nextLine();
			System.out.println("Enter customer last name:"+i );
			sc.nextLine();
			System.out.println("Enter Age for custumer:"+i );
			sc.nextLine().charAt(0);
		}
		System.out.println("Total number of customer saved:"+i );
		
		for(int j = 0; j<3;j++) {
			System.out.println("Number of iteration: "+ j+1 );
		}
		int k = 0;
		do {
			System.out.println("inside do while loop");
					k++;
		}while(k<3);
		
		//System.out.println("Enter customer name:");
		//String firstName = sc.nextLine();
		//System.out.println("Enter customer last name:");
		//String lastName = sc.nextLine();
		//System.out.println("Enter your Age:");
		/*
		 * int age = sc.nextInt();
		 * 
		 * int customerAge = 20; if(age >= 18) {
		 * System.out.println("Eligible to open an account");
		 * 
		 * } else {
		 * 
		 * System.out.println("Not yet eligible to open an account"); }
		 */
            
		//next() -> will take single string without space 
		//nextINT() -> to input integer values 
		
		
		// Take customer details from user using scanner class
		// check if the customer is more than 18 display 
		// eligible to open an account 
		//else display: not yet eligible to open an account
		String firstName ="Ali";
		String lastName ="Alzadjali";
	     int age = 25;
		
		//byte b = 112;
		//short s = 115;
		//s = b;
		
		System.out.println("Demo class");
		 System.out.println("Demo Details: " + firstName + " "+lastName + " " + age);
	}

}
	
// java is strongly typed  language 
// variable in java is a placeholder of data
// placeholder pointing to memory location

// create a variable that will store customer first name and
// customer last name, customer age.
// and display all customer details in single line 