package com.purbarun.singletonpattern;

/**
 * Runner Class to test and execute the program.
 * <p>This program creates only a specific no. of 
 * objects as per the user`s choice.
 * <p>Test this program with objects less than 5(n<5).
 * Then you can find that the last objects are null and 
 * you can`t create more than the specified no of objects.
 * 
 * Date Created:05.10.2017
 * @author Purbarun Chakrabarti
 *
 */
public class MainRunner {
	public static void main(String[] args) {
		Driver driver=new Driver();
		MySingleton obj1=MySingleton.getObject(driver.getValue());
		MySingleton obj2=MySingleton.getObject(driver.getValue());
		MySingleton obj3=MySingleton.getObject(driver.getValue());
		MySingleton obj4=MySingleton.getObject(driver.getValue());
		MySingleton obj5=MySingleton.getObject(driver.getValue());
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		System.out.println(obj5);
	}
}
