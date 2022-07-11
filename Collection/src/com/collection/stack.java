package com.collection;

import java.util.EmptyStackException;
import java.util.Stack;

public class stack {
	public static void main(String[] hi) {
		
	
Stack s=new Stack();
try {
s.push(20);
s.add("hi");
System.out.println(s);
System.out.println(s.search("hi"));
System.out.println(s.peek());
System.out.println(s.pop());
System.out.println(s.add(30));

System.out.print(s.search(20));

//System.out.print(s.pop());

}
catch(EmptyStackException e)
{
	System.err.println("EmptyStackException error");
}
}
}
