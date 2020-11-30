package CollectionEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class CursorsCheck 
{
public static void m1()
{
	ArrayList<String> a=new ArrayList<String>();
	a.add("Mahesh");
	a.add("Ramesh");
	a.add("Suresh");
	System.out.println("Arraylist before modification:"+a);
	ListIterator ltr=a.listIterator();
	while(ltr.hasNext())
	{
		String value=(String) ltr.next();
		if(value.equals("Mahesh"))
		{
			ltr.set("Mahesh Maroor");
		}
		else if(value.equals("Suresh"))
		{
			ltr.add("Manjushree");
		}
		else if(value.equals("Ramesh"))
		{
			ltr.remove();
		}
	}
	System.out.println("Arraylist after modification:"+a);
	Iterator itr=a.iterator();
	while(itr.hasNext())
	{
		String value=(String)itr.next();
		if(value.equals("Suresh"))
		{
			itr.remove();
		}
	}
	System.out.println("After iteration:by removing:"+a);
}
public static void linkedCheck()
{
	LinkedList l=new LinkedList();
	l.add(1);
	l.add(2);
	l.add(3);
	Iterator k=l.descendingIterator();
	while(k.hasNext())
	{
		System.out.println(k.next());
	}
}
public static void main(String[] args) {
	linkedCheck();
}
}
