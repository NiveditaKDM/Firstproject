package com.collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemoMethod {
	public static void main(String[] args) {
		NavigableSet ns=new TreeSet();
		ns.add(10);
		ns.add(50);
		ns.add(30);
		ns.add(20);
		ns.add(60);
		ns.add(40);
		ns.add(80);
		ns.add(70);
		ns.add(4);
		System.out.println(ns);
		System.out.println(ns.lower(40));//30
		System.out.println(ns.lower(70));//60
		System.out.println(ns.first());//10
		System.out.println(ns.floor(49));//40
		System.out.println(ns.ceiling(75));//80
		System.out.println(ns.higher(56));//60
		System.out.println(ns.pollFirst());//4
		System.out.println(ns.pollLast());//80

	}

}
