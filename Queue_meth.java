package com.dt;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_meth {
	public static void main(String[] args){
		 Queue<String> que = new PriorityQueue<String>();
  	    que.add("kll");
	    que.add("jj");
	    que.add("rose");
	    que.add("colour");
		que.add("unique");
		que.add("jj");
		System.out.println(que);
		System.out.println(que.peek());
		que.poll();
		System.out.println(que);
		System.out.println(que.getClass());
		System.out.println(que.hashCode());
		que.remove();
		System.out.println(que);
		que.remove(20);
		System.out.println(que.toArray());
	System.out.println(que);

	}

}
