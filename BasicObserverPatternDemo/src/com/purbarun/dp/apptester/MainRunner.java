package com.purbarun.dp.apptester;

import com.purbarun.dp.observer.Observer;
import com.purbarun.dp.subject.Subject;

public class MainRunner {
public static void main(String[] args) {
	System.out.println("------------------");
	System.out.println(" OBSERVER PATTERN");
	System.out.println("------------------");
	Observer o1=new Observer();
	Subject sub1=new Subject();
	sub1.register(o1);
	System.out.println("Setting Flag = 5 ");
	sub1.setFlag(5);
	System.out.println("Setting Flag = 25 ");
	sub1.setFlag(25);
	sub1.unregister(o1);
	System.out.println("Setting Flag = 50 ");
	sub1.setFlag(50);
}
}
