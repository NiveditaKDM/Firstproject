/**
 * 
 */
package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

/**
 * @author RGI
 *
 */
public class SortingofArray {
	public static void main(String[] args) {
		int arr[]= {12,3,23,21,4,5,90,34,56,12,21,12};
		Collection <Integer> hs= new HashSet();
		for (int i=0;i<arr.length;i++) 
			hs.add(arr[i]);
		for (int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
		ArrayList <Integer>al=new ArrayList();
	al.addAll(hs);
	
	Collections.sort(al);

	System.out.println();
	System.out.print(al);
		
	
	}

}
