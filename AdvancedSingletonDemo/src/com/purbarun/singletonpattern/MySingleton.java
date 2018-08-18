package com.purbarun.singletonpattern;

/**
 * 
 * This is an advanced or an improved version of the previous 
 * Singleton Design Concept.<p>This actually demonstrates how
 * to create restrict a class from creating a particular no. 
 * of objects.<p>So we will apply the Singleton Design Pattern
 * with a counter.<p>Steps:<p>1. In this we will take a static 
 * variable counter to check how many objects created.<p>2. As
 * we can access static variables in constructor and static
 * variables are class level we can stake help of static variable
 * to count number object created.<p>3. First three time we will
 * create new objects and forth time we need to return 3rd object
 * reference. If we don't want the same object 4th time we can 
 * return null.<p>4. Finally we will override {@code toString()}
 * method inherited from the {@code Object} Class to print a 
 * meaningfull message that the object is created. 
 * @author Purbarun Chakrabarti
 *
 */
public class MySingleton {
	private static MySingleton mySingletonObject;
	private static int objCount;

	private MySingleton() {
		objCount++;
	}

	static MySingleton getObject(int n) {
		if (objCount < n) {
			mySingletonObject = new MySingleton();
		} else {
			mySingletonObject = null;
		}
		return mySingletonObject;
	}

	@Override
	public String toString() {
		return "Object created";
	}
}
