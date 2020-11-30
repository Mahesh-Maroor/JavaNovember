package CollectionEx;

import java.util.TreeSet;

public class TreesetExampleInteger {
public static void main(String[] args) {
	TreeSet<Integer> y=new TreeSet<Integer>();
	y.add(5);
	y.add(4);
	y.add(2);
	y.add(3);
	y.add(8);
	y.add(12);
	y.add(22);
	System.out.println(y.lower(3));
	System.out.println(y.ceiling(1));
	System.out.println(y.floor(1));
	System.out.println(y.first());
	System.out.println(y.last());
	System.out.println(y.tailSet(5));
	System.out.println(y.headSet(8));
	System.out.println(y.subSet(4, 8));
}
}
