package Basics;

public class StringReverse {
public static void main(String[] args) {
	String name="hseham";
	String rev="";
	for(int i=name.length()-1;i>=0;i--)
	{
		rev=rev+name.charAt(i);
	}
	System.out.println(rev);
	String names="mahesh";
	byte b[]=names.getBytes();
	char c[]=new char[names.length()];
	int h=0;
	for(int j=b.length-1;j>=0;j--,h++)
	{
		c[h]=(char)b[j];
	}
	System.out.println(c);
}
}
