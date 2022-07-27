package com;

public class SleepNWait1 {
	 private static Object system = new Object();
	    public static void main(String args[]) throws InterruptedException
	    {
	        Thread.sleep(2000);
	        System.out.println("Thread '" + Thread.currentThread().getName() + "' is open after sleeping for 2 second");
	        synchronized (system) 
	        {
	            system.wait(1000);
	            System.out.println("Object '" + system + "' is open after waiting for 1 second");
	        }
	    }

}
