package com.collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArrayLargestElement {
	public static void main(String[] args) {
		int x[]= {21,19,18,21,12,21,21,17,13};
		//ArrayList al= new ArrayList();
		TreeSet ts=new TreeSet();
		for(int i=0;i<x.length;i++) {
			ts.add(x[i]);
		}
		ts.last();
		System.out.println(ts.headSet(ts.last()).last());
		System.out.println(ts);
		System.out.println(ts.tailSet(ts.first()).first());
		
		
	}

}
