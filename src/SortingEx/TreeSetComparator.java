package SortingEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TreeSetComparator {
	public static void main(String[] args) {
		TreeSet<Employees> y=new TreeSet<Employees>(new AgeComparator());
		Employees a=new Employees("harish", 45, 45896.00);
		Employees b=new Employees("arun", 35, 55846.00);
		Employees c=new Employees("vedant", 23, 32896.00);
		y.add(a);
		y.add(b);
		y.add(c);
		//Collections.sort(y);
		Iterator<Employees> j=y.iterator();
		while(j.hasNext())
		{
			Employees e=(Employees)j.next();
			System.out.println(e.name+" "+e.age+" "+e.salary);
		}}
}
