package com;
class MyException extends Exception{
	   String str;
	   MyException(String str2) {
		str=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str) ;
	   }
	}
public class ExceptionHandling1 {
	public static void main(String args[]){
		try{
			System.out.println("Try block");
			
			throw new MyException("This is My error Message");
		}
		catch(MyException exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }

}
