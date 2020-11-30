package CollectionEx;

import java.util.Enumeration;
import java.util.Vector;

public class VectorCheck 
{
public static void m1()
{
	Vector t=new Vector();
	t.add("mahesh");
	t.add(123);
	
	Enumeration e=t.elements();
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
}
public static void main(String[] args) {
	m1();
}
}
