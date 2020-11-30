package CollectionEx;

import java.util.TreeSet;

public class TreesetString {
public static void main(String[] args) {
	TreeSet<String> n=new TreeSet<>();
	n.add("mahesh");
	n.add("varun");
	n.add("arun");
	n.add("swamy");
	n.add("kashi");
	System.out.println(n.lower("mahesh"));
	System.out.println(n.first());
}
}
