package com.dt;
import java.util.*;
import java.util.ArrayList;

public class ArrayList_meth {
	public static void main(String[] args) {
		ArrayList<String> v = new ArrayList<String>();
		v.add("dinesh");
		v.add("varun");
		v.add("arun");
		v.add("raja");
		v.add("scare");
		v.add("afraid");
		v.add("place");
		System.out.println(v);
		System.out.println(v.contains("arun"));
		System.out.println(v.get(0));
		System.out.println(v.hashCode());
		System.out.println(v.indexOf('M'));
		System.out.println(v.isEmpty());
		System.out.println(v);
      System.out.println(v.getClass());
      System.out.println(v.lastIndexOf("Arun"));
        v.set(2,"kumar");
        System.out.println(v);	
      	System.out.println(v.size());
      	ArrayList<String> a = new ArrayList<String>();
      	a.addAll(v);
      	System.out.println(a);
      	
		System.out.println(a.equals(v));

	}

}
