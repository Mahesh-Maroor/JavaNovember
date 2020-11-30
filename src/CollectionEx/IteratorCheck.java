package CollectionEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorCheck
{
public static void ArrayListExCheck()
{
	ArrayList a=new ArrayList();
	a.add("mahesh");
	a.add("suresh");
	a.add("ramesh");
	System.out.println("Without sort:"+a);
	Collections.sort(a);
	System.out.println("After ascending order sort:"+a);
	Collections.reverse(a);
	System.out.println("After reverse order sort:"+a);
	Collections.sort(a);
	System.out.println("By For each");
	for(Object o:a)
	{
		System.out.print(o+" ");
	}
	System.out.println();
	System.out.println("By For Loop");
	for(int i=0;i<a.size();i++)
	{
		System.out.print(a.get(i)+" ");
	}
	System.out.println();
	System.out.println("By Iterator interface");
	Iterator itr=a.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+" ");
	}
	System.out.println();
	System.out.println("By List Iterator");
	ListIterator ltr=a.listIterator();
	while(ltr.hasNext())
	{
		System.out.print(ltr.next()+" ");
	}
	System.out.println();
	System.out.println("List iterator reverse");
	while(ltr.hasPrevious())
	{
		System.out.print(ltr.previous()+" ");
	}
	
}
public static void main(String[] args) {
	ArrayListExCheck();
}
}
