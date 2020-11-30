package ArrayEx;

public class CloningAnArray 
{
public static void main(String[] args) {
	int a[]={1,2,3};
	int b[]=a.clone();
	int c[]={1,2,3,4,5,6};
	int d[]=new int[8];
	System.arraycopy(c, 3, d, 0, 3);
	for(int i=0;i<d.length;i++)
	{
		System.out.println(d[i]);
	}
}
}
