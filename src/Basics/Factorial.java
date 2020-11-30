package Basics;

public class Factorial {
	public static int fact(int n)
	{
		if(n==1)
			return 1;
			else 
				return (n*fact(n-1));
	}
public static void main(String[] args) {
	int sum=1,fact=1;
	for(int i=1;i<=5;i++,sum++)
	{
		fact=sum*fact;
	}
	System.out.println(fact);
	System.out.println(fact(5));
}
}
