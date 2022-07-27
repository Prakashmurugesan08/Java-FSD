package org.queue;

import java.util.*;

public class QueueClass {
	public static void main(String[] args) 
	{
	        		Queue<String> Qu = new LinkedList<>();
	                  Qu.add("Chennai");
	        		  Qu.add("Tambaram");
	        		  Qu.add("Madurai");
	        		  Qu.add("Mumbai");
	        		  Qu.add("Goa");
	        	   	  Qu.add("Bengalur");
	System.out.println("Queue is : " + Qu);
	        		System.out.println("Head of Queue : " + Qu.peek());
	        		Qu.remove();
	        		System.out.println("After removing Head of Queue : " + Qu);
	        		System.out.println("Size of Queue : " + Qu.size());
	    	}


}
