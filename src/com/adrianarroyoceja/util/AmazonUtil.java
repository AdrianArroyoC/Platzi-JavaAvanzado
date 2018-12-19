package com.adrianarroyoceja.util;

import java.util.Scanner;

public class AmazonUtil {
	
	public static int validateUserResponseMenu(int min, int max) {
		
		// Read user response
		Scanner sc = new Scanner(System.in);
		final String ERROR_MESSAGE = "Not valid option, try again";
		
		// Validate int type
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println(ERROR_MESSAGE);
		}
		
		int response = sc.nextInt();
		
		// Validate range
		while(response < min || response > max) {
			
			System.out.println(ERROR_MESSAGE);
			
			while(!sc.hasNextInt()) {
				sc.next();
				System.out.println(ERROR_MESSAGE);
			}
			
			response = sc.nextInt();
		}
		
		System.out.println("You choose: " + response + "\n");
		
		return response;
		
	}

}