package Basics;

public class ThisEx 
{
public int id;
public String name="mahi";
ThisEx(int id)
{
	this.id=id;
}
public void m1()
{
	System.out.println("m1()");
}
public void m2()
{
	this.m1();
	System.out.println("m2()");
}
public void m3(ThisEx t)
{
	System.out.println(t.name);
}
public ThisEx m4()
{
	return this;
}
ThisEx(ThisEx i)
{
	this.id=i.id;
}
public static void main(String[] args) {
	ThisEx ti=new ThisEx(10);
	ti.m2();
	ThisEx h=ti.m4();
	System.out.println(h.name);
	ThisEx u=new ThisEx(h);
	System.out.println(u.name);
}
}
