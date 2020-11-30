package Basics;

public class ImplementationClass extends Company {

	@Override
	public void m14() {
	System.out.println("m14()");	
		
	}

	@Override
	public void m6() {
		
		System.out.println("m6()");
	}

	@Override
	public void m7() {
		System.out.println("m7()");
	}

	@Override
	public void m8() {
		System.out.println("m8()");
		
	}
public static void main(String[] args) {
	Company c=new ImplementationClass();
	//System.out.println(c instanceof Company);//true
	//City d=new ImplementationClass();
	//City.Sm10();
}
}
