package ArrayEx;

public class AddingMultiDimensional {
public static void main(String[] args) {
	int a[][]=new int[][]{{1,2,3},{1,2,3}};
	int b[][]=new int[][]{{1,2,3},{1,2,3}};
	int c[][]=new int[2][3];
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
}
}
