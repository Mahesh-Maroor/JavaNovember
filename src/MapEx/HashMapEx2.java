package MapEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx2 {
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
	System.out.println(h.get(5));
	System.out.println(h.replace(7, "Neelesh"));
	System.out.println(h);
   Collection c= h.values();
   ArrayList<String> c1=new ArrayList<>(c);
   for(Object o:c1)
   {
	   System.out.println(o);
   }
   h.remove(7);
   System.out.println(h);
}
}
