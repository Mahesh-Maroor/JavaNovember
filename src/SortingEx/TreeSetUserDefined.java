package SortingEx;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetUserDefined {
public static void main(String[] args) {
	Students2 a=new Students2("vijay", 15, 456.23);
	Students2 b=new Students2("ajay", 18, 147.85);
	Students2 c=new Students2("sujay", 25, 120.96);
	TreeSet<Students2> t=new TreeSet<Students2>();
	t.add(a);
	t.add(b);
	t.add(c);
	Iterator itr=t.iterator();
	while(itr.hasNext())
	{
		Students2 l=(Students2) itr.next();
		System.out.println(l.name+" "+l.age+" "+l.fees);
	}
	
}
}
