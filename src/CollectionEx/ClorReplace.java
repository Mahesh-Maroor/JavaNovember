package CollectionEx;

import java.util.ArrayList;

public class ClorReplace {
public static void main(String[] args) {
	ArrayList<String> a=new ArrayList<String>();
	a.add("Red");
	a.add("Pink");
	a.replaceAll(new ReplaceAllCheck());
	System.out.println(a);
}
}
