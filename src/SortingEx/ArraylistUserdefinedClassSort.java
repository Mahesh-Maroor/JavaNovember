package SortingEx;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistUserdefinedClassSort {
public static void main(String[] args) {
	Students a=new Students("vijay", 15, 456.23);
	Students b=new Students("ajay", 18, 147.85);
	Students c=new Students("sujay", 25, 120.96);
	ArrayList<Students> g=new ArrayList<Students>();
	g.add(c);
	g.add(a);
	g.add(b);
	Collections.sort(g);
	for(Students j:g)
	{
		System.out.println(j.name+" "+j.age+" "+j.fees);
	}
	
}
}
