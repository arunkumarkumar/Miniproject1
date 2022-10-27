package com.dt;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_meth {
public static void main(String[] args)
	{
		
		HashMap<Object,Object> hashmap = new HashMap<>();
		LinkedHashMap<Object,Object> lm = new LinkedHashMap<>();
		TreeMap<Object,Object> tm = new TreeMap<>();
		
		hashmap.put(1,null);  //Put elements in Map  
		   hashmap.put('k',78);    
		   hashmap.put(567,67.9f);   
		   hashmap.put(4,"Grapes");   
		   System.out.println(hashmap.containsKey(1));
		   System.out.println(hashmap.hashCode());
		  System.out.println(hashmap.isEmpty());
		   for(Map.Entry m : hashmap.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());    
			   }  
	}

}
