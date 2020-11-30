package Basics;

public class SubClassConstructor extends ConstructorChaining 
{
public String mobile;
public int gb;
public double price;

public SubClassConstructor(String m)
{
	//super("mayu",123);
	mobile=m;
}
public SubClassConstructor(String m,int g)
{
	gb=g;
	mobile=m;
}
}
