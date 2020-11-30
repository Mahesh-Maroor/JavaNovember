package CollectionEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GetSecondHighestFromArray {
public static void main(String[] args) {
	Integer a[]={45,23,89,56};
	List<Integer> l=Arrays.asList(a);
	ArrayList<Integer> c=new ArrayList<Integer>(l);
	Collections.sort(c);
	System.out.println(c.size());
	Integer n=(Integer) c.get(c.size()-2);
	System.out.println(n);
	
}
}
