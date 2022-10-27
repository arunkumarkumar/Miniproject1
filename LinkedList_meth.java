package com.dt;

import java.util.LinkedList;

public class LinkedList_meth {
	public static void main(String[] args) {
	LinkedList<Object> sd = new LinkedList<Object>();
		sd.add("vnr");
		sd.add("madurai");
		sd.add("salem");
		sd.addFirst(3456);
		sd.addLast(true);
		System.out.println(sd);
		System.out.println(sd.element());
		System.out.println(sd.getFirst());
		System.out.println(sd.getLast());
		System.out.println(sd.hashCode());
		sd.removeFirst();
		sd.removeLast();
		System.out.println(sd);
		System.out.println(sd.peekFirst());;
		System.out.println(sd.peekLast());
		System.out.println(sd.poll());
		System.out.println(sd);
		sd.push('v');
		System.out.println(sd);
		sd.offer("908");
		System.out.println(sd);
		System.out.println(sd.subList(0, 2));
		System.out.println(sd);

	}

}
