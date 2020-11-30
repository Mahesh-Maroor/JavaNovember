package SortingEx;

public class Students2 implements Comparable<Students2>
{
public String name;
public int age;
public double fees;
public Students2(String n,int a,double f)
{
	name=n;
	age=a;
	fees=f;
}
public void studentDetails()
{
	System.out.println(name+ " "+age+ " "+fees);
}

public int compareTo(Students2 o) {
		return (name.compareTo(o.name));
	
}
}
