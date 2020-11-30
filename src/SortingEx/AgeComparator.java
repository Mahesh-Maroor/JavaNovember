package SortingEx;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employees>{

	@Override
	public int compare(Employees o1, Employees o2) {
		if(o1.age>o2.age)
		return -1;
		else if(o1.age<o2.age)
			return 1;
		else 
			return 0;
	}

}
