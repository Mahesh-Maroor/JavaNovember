package IOEx;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesPractice {
public static void fileinputstream() throws IOException
{
	FileInputStream fi=new FileInputStream("C:\\Users\\Mahesh Maroor\\Desktop\\IntValues.txt");
	int i=0;
	while((i=fi.read())!=-1)
	{
		//System.out.print((char)i);
	}
	
	int y[]={789,745,963,3254};
	FileWriter fw=new FileWriter("C:\\Users\\Mahesh Maroor\\Desktop\\IIIntValues.txt");
	for(int o=0;o<y.length;o++)
	{
		fw.write(y[o]);
	}
	fw.close();
	FileInputStream fii=new FileInputStream("C:\\Users\\Mahesh Maroor\\Desktop\\IIIntValues.txt");
	int k=0;
	while((k=fii.read())!=-1)
	{
		System.out.println(k);
	}
	
}
public static void main(String[] args) throws IOException {
	fileinputstream();
}
}
