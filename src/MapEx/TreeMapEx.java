package MapEx;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import SortingEx.AgeComparator;
import SortingEx.Employees;

public class TreeMapEx {
public static void main(String[] args) {
	TreeMap<Integer, String> g=new TreeMap<>();
	g.put(1, "mahesh");
	g.put(2, "umesh");
	g.put(3, "sangamesh");
	System.out.println(g);
	TreeMap<Employees, Integer> j=new TreeMap<>(new AgeComparator());
	Employees a=new Employees("harish", 45, 45896.00);
	Employees b=new Employees("arun", 35, 55846.00);
	Employees c=new Employees("vedant", 23, 32896.00);
	j.put(a, 1);
	j.put(b, 2);
	j.put(c, 3);
	Set<Map.Entry<Employees, Integer>> d=j.entrySet();
	Iterator<Map.Entry<Employees, Integer>> itr=d.iterator();
	while(itr.hasNext())
	{
		Map.Entry<Employees, Integer> i=itr.next();
		Employees e=i.getKey();
		System.out.println(e.age);
	}
}
}
