package com.purbarun.singletonpattern;

/**
 * Runner Class to Test and Run the Application.
 * <p> Here we will see that the hashcodes of the objects 
 * of the Class {@link com.purbarun.singletonpattern.MySingleton} 
 * are same which implies that they are not different but 
 * same object which is the outcome of Singleton Design Pattern
 * and it stays as it is throughout the entire project i.e only one 
 * object for the entire application.
 * <p>    
 * <p>Date Created: 05.10.2017
 * @author Purbarun Chakrabarti
 *
 */
public class MainRunner {

	public static void main(String[] args) {
		MySingleton obj1=MySingleton.getObject();
		MySingleton obj2=MySingleton.getObject();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}
