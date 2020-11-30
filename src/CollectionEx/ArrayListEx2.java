package CollectionEx;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx2 {
public static void m1()
{
	Students a=new Students("Sangamesh", 123);
	Students b=new Students("Umesh", 456);
	Students c=new Students("Mahesh", 789);
	ArrayList<Students> h=new ArrayList<Students>();
	h.add(a);
	h.add(b);
	h.add(c);
//	System.out.println(h);
	Collections.sort(h);
	for(Students s:h)
	{
		System.out.println(s.id);
	}
}
public static void main(String[] args) {
	m1();
}
}
