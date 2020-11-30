package Basics;

public class ConstructorEx 
{
public String name;
public static int id;
public ConstructorEx()
{
	System.out.println("Constructer called");
}
public static void main(String[] args) {
	ConstructorEx c=new ConstructorEx();
	System.out.println(c.name+" "+id);
}
}
