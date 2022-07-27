package com;
import java.util.*;
public class Collection1 {
public static void main(String[] args) {
		
		System.out.println("ArrayList");
		ArrayList<String> A=new ArrayList<String>();   
	      A.add("Chennai");//
	      A.add("Kanchepuram");    	   
	      System.out.println(A);  

	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> v = new Vector();
	      v.add(60); 
	      v.add(160); 
	      System.out.println(v);
	      
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Prakash");  
	      names.add("Aakash");  	      
	      Iterator<String> i=names.iterator();  
	      while(i.hasNext()){  
	       System.out.println(i.next());  
	       
	      }
	      System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> hs=new HashSet<Integer>();  
	       hs.add(50);  
	       hs.add(60);  
	       hs.add(70);
	       hs.add(80);
	       System.out.println(hs);
	       
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();  
	       lhs.add(10);  
	       lhs.add(20);  
	       lhs.add(30);
	       lhs.add(40);	       
	       System.out.println(lhs);
	      } 
	        



}
