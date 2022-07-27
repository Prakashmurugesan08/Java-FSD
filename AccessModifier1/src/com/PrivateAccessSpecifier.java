package com;



class PrivateAccessSpecifier1 {
	
	   private void display() { 
	        System.out.println("From  private access specifier"); 
	    } 
	   public void display1() {
		   System.out.println("Can't access private method to another class so,calling with in the class ");
		   display();
	} 
}	   
public class PrivateAccessSpecifier {
  public static void main(String[] args) {
	  System.out.println("Private Access Specifier");
	  PrivateAccessSpecifier1  pri = new PrivateAccessSpecifier1();
	  pri.display1();
}
}
