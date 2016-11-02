package com.freetipscentral.lambdaexpressions;

public class Example1 {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> System.out.println("Thread 1"));
		
		//Step 1 : Remove anonymous class declaration  and opening braces
		//Step 2 : Remove method name and replace { with -> Separator
		//Step 3 : Remove closing braces } for method and anonymous class
		//Step 4 : Remove semicolon after the statement unless it is a method block

		Thread t2 = new Thread(() -> System.out.println("Thread 2"));

		Thread t3 = new Thread(() -> System.out.println("Thread 3"));
		t1.start();
		t2.start();
		t3.start();

	}

}
