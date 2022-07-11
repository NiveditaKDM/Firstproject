package com.collection;

import java.util.Hashtable;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[]args) {
		System.out.println("Enter a String ");
		Scanner S=new Scanner(System.in);
		String st=S.nextLine();
		
		String n=st.replace(" ","");
		Hashtable<Character, Integer> ht= new Hashtable<Character, Integer>();
		for (int i = 0; i < n.length(); i++) {
			if(ht.containsKey(n.charAt(i))){
				int o=ht.get(n.charAt(i));
				o++;
				ht.put(n.charAt(i), o);
			
			}else {
				ht.put(n.charAt(i), 1);
				
				
			}
			
		}
		
		System.out.println(ht);
		
	}

}
