package com;

class DefAccessSpecifier {
	void display() 
    { 
        System.out.println("From defalut access specifier"); 
    } 
}	
public class DefaultAccessSpecifier {
public static void main(String[] args) {
		
		
		DefAccessSpecifier x = new DefAccessSpecifier(); 		  
        x.display(); 

	}
}
