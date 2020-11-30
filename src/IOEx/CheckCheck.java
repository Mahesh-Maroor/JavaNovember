package IOEx;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CheckCheck {
public static void m3() throws IOException
{
	File f=new File("C:\\Users\\Mahesh Maroor\\Desktop\\ToCheck.txt");
	if(!f.exists())
	{
		f.createNewFile();
	}
	FileOutputStream fout=new FileOutputStream(f);
	int t=1259;
	fout.write(t);
	fout.close();
	FileInputStream a=new FileInputStream("C:\\Users\\Mahesh Maroor\\Desktop\\ToCheck.txt");
	int p=0;
	while((p=a.read())!=-1)
	{
	System.out.println((char)p);
	}
	
}
public static void m5() throws IOException
{
	FileWriter g=new FileWriter("C:\\Users\\Mahesh Maroor\\Desktop\\Check.txt");
	 Integer arr[] = { 10, 20, 30, 40, 50 };
     int len = arr.length;
     for (int i = 0; i < len; i++) {
        g.write(arr[i] + "\t"+ "");
     }
	g.flush();
	g.close();
	FileReader r=new FileReader("C:\\Users\\Mahesh Maroor\\Desktop\\Check.txt");
	int p=0;
	while((p=r.read())!=-1)
	{
	System.out.print((char)p);
	}
	
}
public static void m4() throws IOException
{
	FileOutputStream h=new FileOutputStream("C:\\Users\\Mahesh Maroor\\Desktop\\Che.txt");
	int y=786;
	DataOutputStream g=new DataOutputStream(h);
	g.write(y);
	FileInputStream u=new FileInputStream("C:\\Users\\Mahesh Maroor\\Desktop\\Che.txt");
	DataInputStream l=new DataInputStream(u);
	while(l.available()>0) {
        
        // read four bytes from data input, return int
        int k = l.readInt();
        
        // print int
        System.out.print(k+" ");
     }
}
public static void main(String[] args) throws IOException {
	m4();
}
}
