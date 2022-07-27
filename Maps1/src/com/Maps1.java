package com;
import java.util.*;
public class Maps1 {
public static void main(String[] args) {
		
		HashMap<Integer,String> m=new HashMap<Integer,String>();      
	      m.put(1,"Prakash");    
	      m.put(2,"Navin");    
	      m.put(3,"Mukesh");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry hm:m.entrySet()){    
	       System.out.println(hm.getKey() +"  "+  hm.getValue());    
	      }
	      
          Hashtable<Integer,String> t=new Hashtable<Integer,String>();  
	      
	      t.put(4,"Aakash");  
	      t.put(5,"Ajith");  
	      t.put(6,"Rajesh");  
	      t.put(7,"Praveen");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry ht:t.entrySet()){    
	       System.out.println(ht.getKey()+" "+ht.getValue());    
	      }
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Ramya");    
	      map.put(9,"Pavi");    
	      map.put(10,"yogadharshini");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      

       }


}
