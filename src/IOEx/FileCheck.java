package IOEx;

import java.io.File;
import java.io.IOException;

public class FileCheck {
public static void filecheck() throws IOException
{
	File creating=new File("C:\\Users\\Mahesh Maroor\\Desktop\\CreateFile.txt");
	creating.createNewFile();
	System.out.println(creating.isDirectory());
	File f=new File("C:\\Users\\Mahesh Maroor\\Desktop");
	System.out.println(f.isDirectory());
	System.out.println(f.getAbsolutePath());
	File g=new File("C:\\Users\\Mahesh Maroor\\Desktop\\Hello");
	g.mkdir();
	File k=new File("C:\\Users\\Mahesh Maroor\\Desktop");
   String h[]=k.list();
   for(String file:h)
   {
	   System.out.println(file);
   }
	
}
public static void main(String[] args) throws IOException {
	filecheck();
}
}
