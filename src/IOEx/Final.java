package IOEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Final {
	static int u;
public static void m1() throws IOException
{
	FileOutputStream h=new FileOutputStream("C:\\Users\\Mahesh Maroor\\Desktop\\Final.txt");
	String j="26627070";
	byte[] o=j.getBytes();
	h.write(o);
	h.close();
}
public static void m2() throws IOException
{
	FileInputStream fi=new FileInputStream("C:\\Users\\Mahesh Maroor\\Desktop\\Final.txt");
	int h=0;
	while((h=fi.read())!=-1)
	{
		char c=(char)h;
		String l=c+"";
	    u=Integer.parseInt(l);
		//System.out.print(u);
	
	}
}
public static void main(String[] args) throws IOException {
	m2();
	System.out.println(u);
}
}
