package SortingEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayComparator {
public static void main(String[] args) {
	ArrayList<Employees> y=new ArrayList<Employees>();
	Employees a=new Employees("harish", 45, 45896.00);
	Employees b=new Employees("arun", 35, 55846.00);
	Employees c=new Employees("vedant", 23, 32896.00);
	y.add(a);
	y.add(b);
	y.add(c);
	Collections.sort(y,new NameComparator());
	ListIterator<Employees> j=y.listIterator();
	while(j.hasNext())
	{
		Employees e=(Employees)j.next();
		System.out.println(e.name+" "+e.age+" "+e.salary);
	}
}
}
