package com.purbarun.singletonpattern;

import java.util.Scanner;

/**
 * Class to take the input from the user for the maximum no. of objects hw want
 * to create.
 * 
 * @author Purbarun Chakrabarti
 *
 */

public class Driver {
	Scanner sc = new Scanner(System.in);
	int n;

	/**
	 * This is a custom constructor with zero parameters.
	 * <p>
	 * It takes the input from the user every time it is invoked.
	 */

	public Driver() {
		System.out.println("How many objects you want to create?");
		n = sc.nextInt();
	}

	/**
	 * Method with default access specifier which returns an integer.
	 * @return The value entered by the user.
	 */
	int getValue() {
		return n;
	}
}
