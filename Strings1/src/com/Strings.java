package com;

public class Strings {
	public static void main(java.lang.String[] args) {
		String a="Welcome to java";
		String b="Java program";
	
		System.out.println("String Methods");
		
		System.out.println(a.length());

		System.out.println(b.substring(0));

		System.out.println(a.compareTo(b));

		System.out.println(a.isEmpty());

		System.out.println(b.toLowerCase());
		
		String c="Hcllo";
		String replace=c.replace('c', 'e');
		System.out.println(replace);

		String d="Welcome to Java";
		String e="Welcome to Java";
		System.out.println(d.equals(e));
 
		System.out.println("\n Creating StringBuffer");
		
		StringBuffer s=new StringBuffer();
		String f="Welcome to";
		s.append(f +" java learning");
		System.out.println(s);

		//insert method
		s.insert(10, 'o');
		System.out.println(s);

		//replace method
		StringBuffer g=new StringBuffer("Helo");
		g.replace(0, 2, "hEl");
		System.out.println(g);
       //delete method
		g.delete(0, 1);
		System.out.println(g);
		
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb=new StringBuilder("Happy");
		//append method
		sb.append("Learning");
		System.out.println(sb);
        
		System.out.println(sb.delete(0, 1));

		System.out.println(sb.insert(1, "Welcome"));

		System.out.println(sb.reverse());
				
		//conversion	
		System.out.println(" \n Conversion of Strings to StringBuffer and StringBuilder");
		
		String str = "Welcome to"; 
        
        // conversion from String object to StringBuffer 
        StringBuffer sb1 = new StringBuffer(str); 
        sb1.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sb1); 
          
        // conversion from String object to StringBuilder 
        StringBuilder sb2 = new StringBuilder(str); 
        sb2.append("Java"); 
        System.out.println("String to StringBuilder");
        System.out.println(sb2);              		
	


	}


}
