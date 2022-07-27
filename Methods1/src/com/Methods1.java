package com;



public class Methods1 {
	public void display() {
		System.out.println("Methods");
	}
	private static int add(int x,int y) {
		return x+y;

	}
	private int add(int x,int y,int z) {
		return x+y+z;
		

	}
	public static void main(String[] args) {
		int x=5,y=10,z=15;
		Methods1 n=new Methods1();
		n.display();
		System.out.println("Call by value");
		System.out.println(add(x,y));
		System.out.println("Call by Method overloaded methods ");
		System.out.println(n.add(x,y,z));
	}

}
