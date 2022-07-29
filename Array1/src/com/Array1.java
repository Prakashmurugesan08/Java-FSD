package com;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		System.out.println("Array");
		int[] a=new int[4];
		Scanner s=new Scanner(System.in);
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		int length = a.length;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Multi-Dimentional Array");
		
		int b[][]  = {{9, 4, 6 },
				      {3, 6, 9},
				      {2,6,8 }};
	      
	    
	    int length1 =b.length;
	    System.out.println("Printing the value using for loop");
	    for (int i=0;i<b.length;i++) {
	    	for(int j=0;j<b[i].length;j++) {
	    		System.out.println(b[i][j]);
	    	}
	    }
	    
	    
	    
	 }

}
