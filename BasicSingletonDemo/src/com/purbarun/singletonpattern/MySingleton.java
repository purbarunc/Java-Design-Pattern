package com.purbarun.singletonpattern;

/**
 * This is a Singleton class which returns a single Connection Object and
 * follows Singleton Design Pattern.<p>Singleton is a design pattern which
 * is used to create only one object or reference of that Singleton Class.
 * <p>Rules to be followed for Singleton Class:<p>1. Constructor should be
 * made private<p>2. It should have a field of its own type whose access 
 * modifier is private,access specifier are static and final.<p>3. It
 * should contain a static block inside which it should initialise(create)
 * field of its own type which should be initialised.<p>4. It should contain
 * a public static method which returns the object 
 * 
 * @author Purbarun Chakrabarti
 *
 */
public class MySingleton {
	private static final MySingleton mySingletonObject;

	private MySingleton() {
		System.out.println("Singleton Object Created");
	}
	static {
		mySingletonObject=new MySingleton();
	}
	static MySingleton getObject() {
		return mySingletonObject;
	}
}
