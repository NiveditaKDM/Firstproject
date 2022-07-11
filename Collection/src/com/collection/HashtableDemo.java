package com.collection;
import java.util.Hashtable;

public class HashtableDemo {
	public static void main(String[] args)
	{
Hashtable ht=new Hashtable();
ht.put(1,"a");
ht.put(2,"b");
System.out.println(ht.size());
System.out.println(ht);
System.out.println(ht.values());

Hashtable ha=(Hashtable) ht.clone();
//ha.clear();
System.out.println(ha.equals(ht));
System.out.println(ha.contains(1));
//System.out.println(ha.cmpute(ha, "j"));
System.out.println(ha);

}
}