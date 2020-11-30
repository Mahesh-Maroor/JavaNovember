package Basics;

public class WrapperClasszex {
	String name="Mahesh";
	int id=123;
	public String toString()
	{
		return name+ " "+id;
	}
public static void main(String[] args) {
	int i=10;
	Integer j=i;
	int k=15;
	Integer o=Integer.valueOf(k);
	Integer l=156;
	int d=l;
	Integer s=487;
	int f=s.intValue();
	String x="10";
	Integer v=Integer.parseInt(x);
	WrapperClasszex j1=new WrapperClasszex();
	System.out.println(j1);
}
}
