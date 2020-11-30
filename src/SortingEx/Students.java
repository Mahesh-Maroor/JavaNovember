package SortingEx;

public class Students implements Comparable<Students>
{
public String name;
public int age;
public double fees;
public Students(String n,int a,double f)
{
	name=n;
	age=a;
	fees=f;
}
public void studentDetails()
{
	System.out.println(name+ " "+age+ " "+fees);
}

public int compareTo(Students o) {
		return (name.compareTo(o.name));
	
}
}
