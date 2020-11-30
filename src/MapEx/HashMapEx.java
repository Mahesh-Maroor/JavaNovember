package MapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
public static void main(String[] args) {
	HashMap<Integer, String> h=new HashMap<Integer, String>();
	h.put(1, "Sangamesh");
	h.put(2, "Umesh");
	h.put(3, "Mahesh");
	h.put(4, "Agastya");
	h.put(5, "Rakesh");
	h.put(6, "Praveen");
	h.put(7, "Mahadev");
	System.out.println(h);
	Set b=h.keySet();
	for(Object o:b)
	{
		System.out.print(o+" ");
	}
	System.out.println();
	Set<Map.Entry<Integer, String>> m=h.entrySet();
	Iterator l=m.iterator();
	while(l.hasNext())
			{
		Map.Entry<Integer, String> j=(Entry<Integer, String>) l.next();
		System.out.println(j.getKey()+" "+j.getValue());
			}
	for(Map.Entry<Integer, String> n:h.entrySet())
{
	System.out.println(n.getKey()+" "+n.getValue());
}
	
}
}
