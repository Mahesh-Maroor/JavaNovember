package SortingEx;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStringWrapperClass
{
public static void main(String[] args) {
	String name[]={"c","a","d","b"};
	ArrayList<String> a=new ArrayList<String>();
	for(int i=0;i<name.length;i++)
	{
		a.add(name[i]);
	}
	System.out.println("With out any sort:"+a);
	Collections.sort(a);
	System.out.println("Using Collections.sort(list l) sort is:"+a);
	Collections.reverse(a);
	System.out.println("Using Collections.reverse(list l) sort is:"+a);
}
}
