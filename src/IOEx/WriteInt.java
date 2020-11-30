package IOEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInt {
public static void intWrite() throws IOException
{
	File g=new File("C:\\Users\\Mahesh Maroor\\Desktop\\intW.txt");
	if(!g.exists())
	{
		g.createNewFile();
	}
	FileWriter fw=new FileWriter(g);
	int a[]=new int[]{222,223,225};
	for(int i=0;i<a.length;i++)
	{
		fw.write(a[i]);
	}
	fw.close();
	FileReader fr=new FileReader(g);
	int y=0;
	while((y=fr.read())!=-1)
	{
		System.out.println(y);
	}
	
}
public static void main(String[] args) throws IOException {
	intWrite();
}
}
