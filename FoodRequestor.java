package com.test.dowhile;

import java.util.Scanner;

public class FoodRequestor {
	
	public static void main(String[] args) {
	
		//Requesting user for input
		System.out.println("Please enter a food you like");
		
		Scanner scan = new Scanner(System.in);
		String food = scan.next();
		
		System.out.println("Would you like to continue?");
		String cont = scan.next();
		Food newFood = new Food();
		newFood.enterFood(food,cont);
		newFood.enterFoodDoWhile();
			
	}
}
