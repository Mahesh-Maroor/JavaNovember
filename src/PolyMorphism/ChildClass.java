package PolyMorphism;

import java.io.IOException;

public class ChildClass extends ParentClass {

	
	public void m5() {
		System.out.println("Abstract parent is implemented");
	}
	public static void m1()
	{
		System.out.println("Child static");
	}
	public void m4(int... a)
	{
		System.out.println("Child Var arg");
	}
	public void m6()
	{
		System.out.println("Parent access modifier");
	}
public static void main(String[] args) {
	ParentClass p=new ChildClass();
   p.m1();//Parent static
   p.m4(12);

}
}
