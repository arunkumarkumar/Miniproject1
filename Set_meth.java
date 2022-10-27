package com.dt;
import java.util.*;

public class Set_meth{
public static void main(String[] args) {
		HashSet<Object>dup = new HashSet();
         dup.add("Ravi");  
         dup.add("Vijay");  
         dup.add("Arun");  
         dup.add("Sumit"); 
         dup.add(null);
         dup.add(67.9f);
         System.out.println(dup);  
         dup.remove("Ravi");  
         System.out.println(dup);  
         HashSet<Object>hs1 = new HashSet();
		hs1.addAll(dup);
		System.out.println(hs1.equals(dup));
		System.out.println(dup.contains("true"));
		System.out.println(dup.size());
		System.out.println(dup.isEmpty());
		System.out.println(dup.remove(2));
		System.out.println(dup);  
		System.out.println(hs1); 
		LinkedHashSet<Object> hash = new LinkedHashSet();
		hash.add(10);
		hash.add(30);
		hash.add(30);
		hash.add(20);
		hash.add(50);
		hash.add(70);
		
		System.out.println(hash);
		
		System.out.println(hash.equals(dup));
		System.out.println(hash.isEmpty());
		System.out.println(hash.size());
		System.out.println(hash.containsAll(dup));
		
		
		TreeSet<String> ts = new TreeSet();
		
		ts.add("dev");
		ts.add("testing");
		ts.add("hr");
		ts.add("god");
	    ts.add("manager");
	    ts.add("sal");
		System.out.println(ts.size());
		Iterator<String> itr=ts.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}
}
