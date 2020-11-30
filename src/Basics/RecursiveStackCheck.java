package Basics;

public class RecursiveStackCheck 
{
public static void m1()
{
	System.out.println("m1()");
	m1();
}
public static void main(String[] args) {
	RecursiveStackCheck f=new RecursiveStackCheck();
RecursiveStackCheck.m1();
}
}
