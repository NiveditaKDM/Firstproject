package com.collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashset {			
public static void main(String[] args) {
	//HashSet hs=new HashSet ();
	LinkedHashSet hs=new LinkedHashSet();
	 hs.add(10);
	 hs.add(20);
	 hs.add(30);    
	 hs.add(40);
	 hs.add(50);
	 hs.add(60);
	 hs.add(true);
	 hs.add("hi");
	 hs.add(60);
	 System.out.println(hs);
	 boolean isAdded=hs.add("bye");
	 System.out.println(isAdded);
	 System.out.println(hs);
	 
	 
}
}
