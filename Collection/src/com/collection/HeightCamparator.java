package com.collection;

import java.util.Comparator;

public class HeightCamparator implements Comparator {

@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student s1= (Student)o1;
		Student s2= (Student)o2;
		if(s1.height>s2.height)
			return 1;
		if(s1.height<s2.height)
			return -1;
		else
			return 0;
		
}
}