package Basics;

public class FactorialCheck 
{
public static void main(String[] args) {
	int sum=1;
	int fact=1;
	for(int i=1;i<=5;i++)
	{
		fact=sum*fact*i;
	}
	System.out.println(fact);
}

}
