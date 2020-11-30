package PolyMorphism;

import java.io.IOException;

public abstract class ParentClass 
{
public static void m1()
{
	System.out.println("Parent static");
}
public final void m2()
{
	System.out.println("Parent final");
}
private void m3()
{
	System.out.println("Parent private");
}
public void m4(int... a)
{
	System.out.println("Parent Var arg");
}
public abstract void m5();
public void m6() throws Exception
{
	System.out.println("Parent access modifier");
}

}
