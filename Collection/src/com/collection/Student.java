package com.collection;

public class Student {
	
		float height;
		float marks;
		String name;
	
public Student(float height,float marks, String name) {
	this.height=height;
	this.marks=marks;
	this.name=name;
	
}


	
	


@Override
public String toString() {
	return "Student [height=" + height + ", marks=" + marks + ", name=" + name + "]";
}

}
