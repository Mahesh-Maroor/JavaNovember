package CollectionEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListEx 
{
public static void m1()
{
	String s[]={"Mahesh","Manjushree","Agastya"};
	List<String> a=Arrays.asList(s);
    ArrayList<String> n=new ArrayList<>(a);
    System.out.println(n);
}
    /*for(String h:n)
    {
    	System.out.println(h);
    }
    Object o[]=n.toArray();
    for(Object j:o)
    {
    	System.out.println((String)j+" ");
    }
    Object y=n.get(2);
    System.out.println(y);
    n.set(2, "Basansh");
    System.out.println(n);
    Collections.sort(n);
    System.out.println(n);
    System.out.println(n.get(2));
    n.set(2, "Ammu");
    System.out.println(n.get(2));
    Collections.sort(n);
    System.out.println(n);
    Collections.reverse(n);
    System.out.println(n);
   
}*/
public static void main(String[] args) {
	m1();
}
}
