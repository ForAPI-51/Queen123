package com.backend.testing;

public class A2 {
	
	public A2 a() {
		System.out.println("execute mtd a");
		
	return new A2();
	}
	
	public A2 b() {
		System.out.println("execute mtd b");
		
	return new A2();
	}
	
	public B c() {
		System.out.println("execute mtd c");
	
	return new B();
	}


}
