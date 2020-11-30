package Basics;

public class GreatestNumber {
public static void main(String[] args) {
	int a[]={2,4,1,3,6};
	int min=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(min>a[i])
		{
			min=a[i];
		}
		
	}
	System.out.println(min);
}
}
