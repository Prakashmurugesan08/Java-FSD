package com;

public class TryNCatch {
	public static void main(String args[]) 
    {
        int x=10;
        int y=0;
        
        try 
        {
        	int sum=x/y;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds!"); 
        }
        catch (ArithmeticException e1) {
        	System.out.println("Arithmatic Exception ");
        	System.out.println(x+y);
        }
        finally 
        {
            System.out.println("Tryed to divided a number by 0");
        }
    }


}
