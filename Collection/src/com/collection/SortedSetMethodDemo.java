package com.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetMethodDemo {
	public static void main(String[] args) {
		SortedSet ts=new TreeSet();
	ts.add(10);
	ts.add(17);
	ts.add(40);
	ts.add(30);
	ts.add(20);
	ts.add(12);
	ts.add(11);
	ts.add(0);
	System.out.println(ts);
	System.out.println(ts.first());//0
	System.out.println(ts.last());//40
	System.out.println(ts.isEmpty());//False
	//System.out.println(ts.remove(11));//return true
	System.out.println(ts.remove(5));//return False
	System.out.println(ts.comparator());//Null as set uses natural ordering of the elements
	System.out.println(ts.headSet(20));//[0,10,11,12,17]
	System.out.println(ts.tailSet(20));//[20,30,40]
	System.out.println(ts.subSet(17, 30));//[17,20]//exclude last element

}

}
