package CollectionEx;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSetEx 
{
public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add(null);
	h.add(null);
	h.add("Mahesh");
	h.add("Umesh");
	h.add("Mahesh");
	h.add("Sangamesh");
	h.add(123);
	h.add(true);
	System.out.println(h);
	LinkedList l=new LinkedList();
	l.add("123");
	l.add("Mahesh");
	l.add("Sangu");
	l.add(true);
	System.out.println(l);
}
}
