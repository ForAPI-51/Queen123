package com.backend.testing;

public class AStatic {
	
	public static AStatic a() {
		System.out.println("execute mtd a");
		
	return new AStatic();
	}
	
	public static AStatic b() {
		System.out.println("execute mtd b");
		
	return new AStatic();
	}
	
	public  static B c() {
		System.out.println("execute mtd c");
	
	return new B();
	}


}
