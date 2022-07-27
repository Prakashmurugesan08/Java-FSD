package com;

public class Polymorphism {
private void employee(int a) {
		
		System.out.println("employee id is "+a);
	}
	private void employee(String a){
		System.out.println("Name is "+a);
	}
	
	private void employee(String a, float b) {
		System.out.println("Name is "+a+"\n"+"salary is "+b);
		
	}
	public static void main(String[] args) {
		Polymorphism p=new Polymorphism();
		p.employee(12345);
		p.employee("Prakash");
		p.employee("Prakash",23000.21F);
	}
}
