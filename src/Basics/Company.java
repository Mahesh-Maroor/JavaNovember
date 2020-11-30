package Basics;

public abstract class Company extends Employee implements City 
{
	public String name="Mahesh";
	public static int i=456;
	public Company() {
		System.out.println("Company constructor");
	}
	{
		System.out.println("Company IIB");
	}
    public void Cm1()
    {
	System.out.println("Concrete method");
    }
    public static void Sm2()
    {
    	System.out.println("Static method");
    }
    public final void Fm3()
    {
    	System.out.println("Final method");
    }
    private void Pm4()
    {
    	System.out.println("private method");
    }
    void Dm5()
    {
    	System.out.println("Default method");
    }
    public abstract void m6();
    public abstract void m7();
    public void m9()
    {
    	System.out.println("m10");
    }
    
}
