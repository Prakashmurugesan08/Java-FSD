package com;

public class TypeCasting {
public static void main(String[] args) {
		
		//implicit conversion
		System.out.println("Implicit Type Casting");
		
		short a=72;
		System.out.println("Value of b: "+a);
		int b=a;
		System.out.println("Value of b: "+b);
		long c=a;
		System.out.println("Value of d: "+c);
		
		float d=100.82F;
		System.out.println("Value of c: "+d);
		
		
		double e=c;
		System.out.println("Value of e: "+e);
		
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		//explicit conversion
		
		float x=60.19F;
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		int z=72;
		System.out.println("Value of b: "+z);
		char u=(char)z;
		System.out.println("Value of a: "+u);
	}

}
