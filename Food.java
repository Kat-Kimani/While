package com.test.dowhile;

import java.util.Scanner;

public class Food {
	
	public static void enterFood(String food,String cont) {		
		while(cont != "N") {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a food you like");
			food = scan.next();
			System.out.println("Would you like to continue?");
			cont = scan.next();
			break;
		}
		
	}
	
	
		public static void enterFoodDoWhile() {

		String food;
		String cont;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Please enter a food you like");
			food = scan.next();
			System.out.println("Would you like to continue?");
			cont = scan.next();
		} while (!cont.equals("N"));
		
	}

}
