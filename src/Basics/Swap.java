package Basics;

public class Swap 
{
public static void main(String[] args) {
	int a=20;
	int b=10;
	a=a+b;//30
	b=a-b;//20
	a=a-b;//10
	System.out.println(a+ " "+b);
	int x=100;
	int y=50;
	int z=x+y;//150
	y=z-y;//100
	x=z-y;
	System.out.println(x+ " "+y);
}
}
