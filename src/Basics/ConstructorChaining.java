package Basics;

public class ConstructorChaining 
{
public String name;
public int id;
public double salary;
public char section;
public long mobNo;
public ConstructorChaining()
{
	
}
public ConstructorChaining(String n,int i)
{
	name=n;
	id=i;
	System.out.println("Double Arg");
	System.out.println(name+" "+id+ " "+salary+ " "+mobNo);
}
public ConstructorChaining(String n,int i,char s)
{
	this(n,i);
	section=s;
	System.out.println("Triple Arg");
}
public ConstructorChaining(String n,int i,char s,long mno)
{
	this(n,i,s);
	mobNo=mno;
	System.out.println(name+" "+id+ " "+section+ " "+mobNo);
	System.out.println("Four Arg");
}
public static void main(String[] args) {
	ConstructorChaining d=new ConstructorChaining("mahesh", 2662,'A', 9900957070l);
}
}
