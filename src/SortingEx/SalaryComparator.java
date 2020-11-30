package SortingEx;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employees> {

	@Override
	public int compare(Employees o1, Employees o2) {
		if(o1.salary>o2.salary)
		return -1;
		else if(o1.salary<o2.salary)
			return 1;
		else
			return 0;
	}

}
