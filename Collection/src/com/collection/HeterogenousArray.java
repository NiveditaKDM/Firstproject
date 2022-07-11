package com.collection;

import java.util.LinkedList;

public class HeterogenousArray {
public static void main(String[]  args) {
	//Object[] obj= {10,3.14f,"Hello",true};
	//System.out.println(obj);
	LinkedList al=new LinkedList();
	//LinkedList bl= new LinkedList(10);
al.add(10);
al.add(20);
al.add("hello");
al.addFirst("hi");
al.addLast("bye");
//al.clear();
//al.clone();
LinkedList bl = (LinkedList) al.clone();
System.out.println(bl);
bl.add(50);
if(bl.equals(al))
System.out.print(bl);
System.out.println(bl.size());


}

}
