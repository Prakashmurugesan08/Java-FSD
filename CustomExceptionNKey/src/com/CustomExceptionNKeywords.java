package com;

class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        super(s); 
    } 
} 
public class CustomExceptionNKeywords {
	public void division() throws ArithmeticException {
		int x=20;
		int y=0;
		System.out.println(x/y);
		
	}
	public static void main(String[] args) throws Exception {
		CustomExceptionNKeywords c=new CustomExceptionNKeywords();
		
		int a=30;
		int b=0;
		int res;
        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                res = a / b;
                System.out.print("\n The result is : " + res);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.print("\n Error : " + e.getMessage());
        }
        try
        {
            c.division();
        }
        catch(ArithmeticException e1)
        {
            System.out.print("\n Error : " + e1.getMessage());
        }
        finally
        {
            System.out.print("\n Anything divided by zero is 0");
        }
        try
        { 
            throw new MyException("Temp"); 
        } 
        catch (MyException e2) 
        { 
            System.out.println(" Caught"); 
            System.out.println(e2.getMessage()); 
        } 

        ;

		
	}


}
