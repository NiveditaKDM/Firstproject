package com.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Student s1 = new Student(5.6f, 90.0f, "SOnal");
		Student s2 = new Student(6.0f, 84.0f, "Amit");
		Student s3 = new Student(4.6f, 70.01f, "Ss");
		TreeSet<Student> ts = new TreeSet(new MarkComparator());
		TreeSet<Student> ts1 = new TreeSet(new HeightCamparator());
		TreeSet<Student> ts2 = new TreeSet(new NameCOmparator());

		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts1.add(s1);
		ts1.add(s2);
		ts1.add(s3);
		ts2.add(s1);
		ts2.add(s2);
		ts2.add(s3);

		Iterator<Student> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		System.out.println();
		Iterator<Student> itr1 = ts1.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());

		}
		System.out.println();
		Iterator<Student> itr2 = ts2.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());

		}
	}

	/*
	 * TreeSet ts=new TreeSet(); ts.add(11); ts.add(12); ts.add(9); ts.add(4);
	 * //ts.add('i'); System.out.println(ts);
	 */
}
