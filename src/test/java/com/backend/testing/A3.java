package com.backend.testing;

public class A3 {
	
	public A3 a() {
		System.out.println("execute mtd a");
		
	return new A3();
	}
	
	public void b() {
		System.out.println("execute mtd b");
		
	//return new A2();
	}
	
	public A3 c() {
		System.out.println("execute mtd c");
	
	return new A3();
	}

}
