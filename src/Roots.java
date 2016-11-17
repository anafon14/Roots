/**
 * Name: Ana Luiza Fonseca Teixeira
 * Teacher: Mr. Hardman 
 * Assignment #4, Program #1
 * Date Last Modified: 11/18/2016
 */

import java.util.Scanner;

public class Roots {


	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		double userNumber;
		double result;
		
		System.out.println("Please, enter a number:");
		userNumber = userInput.nextDouble();
		
		do{
			
			if(userNumber < 0){
				System.out.println("ERROR! The number needs to be positive! " + "\nPlease, enter a number:");
				userNumber = userInput.nextDouble();
			}
			
		} while(userNumber < 0);
		
		result = Math.sqrt(userNumber);
		
		System.out.println("The square root of " + userNumber + " is equal to " + result + "!" );
		
		userInput.close();
	
	}

}
