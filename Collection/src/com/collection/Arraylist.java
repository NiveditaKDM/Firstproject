package com.collection;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] argh) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add("hi");
		a.add("ab");
		System.out.println(a);
		a.remove(0);
		a.add(0, 5);
		a.addAll(a);
		a.ensureCapacity(3);
		System.out.println(a);
		a.add(11, "a");
		System.out.println(a);
		
		
	}

}
