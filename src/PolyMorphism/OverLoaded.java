package PolyMorphism;

import Basics.Animal;
import Basics.Dog;

public class OverLoaded 
{
public void add(int a)
{
	System.out.println("add(int a)");
}
public void add(int a,int b)
{
	System.out.println("add(int a,int b)");
}
public void add(int a,double b)
{
	System.out.println("add(int a,double b)");
}
public void add(double a,int b)
{
	System.out.println("add(double a,int b)");
}
public void add(int a,long b)
{
	System.out.println("add(int a,long b)");
}
public void add(long a,int b)
{
	System.out.println("add(long a,int b)");
}
public void add(Object a)
{
	System.out.println("Parent");
}
public void add(String b)
{
	System.out.println("Child");
}
public void add(int...d)
{
	System.out.println("var arg");
}
public static void main(String[] args) {
	OverLoaded v=new OverLoaded();
	
}
}
