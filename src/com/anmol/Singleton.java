package com.anmol;

public class Singleton {	
	
	public static  int topCount = 100;
	private int anmol = 500;
	
	{
		System.out.println("Normal block called Only if class is constructed :: "
							+ "count " + count);
		System.out.println(topCount);
		count++;
	}
	
	static  {
		System.out.println("Static Block Called ");
	}
	
	public static final Singleton INSTANCE = new Singleton();
	private static int privateCount = 10;
	public static int count = 1;
	
	private Singleton() {
		System.out.println("Called only once --> Singleton Property"
							+ "Inside private constructor");
		System.out.println("Inside private constructor count " + count);
		System.out.println("Inside private constructor privateCount " + privateCount);
		count++;
	}
}
