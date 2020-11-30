package IOEx;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOStream {
public static void FileInputStreamEx() throws IOException
{
	FileInputStream fi=new FileInputStream("C:\\Users\\Mahesh Maroor\\Desktop\\ToRead.txt");
	int u=0;
	while((u=fi.read())!=-1)
	{
		System.out.print((char)u+"");
	}
	
}
public static void FileOutputStreamEx() throws IOException
{
	FileOutputStream fout=new FileOutputStream("C:\\Users\\Mahesh Maroor\\Desktop\\ToWrite.txt");
    String data="Hi Mahesh,Whats up";
    byte b[]=data.getBytes();
    fout.write(b);
    fout.close();
    FileOutputStream fout1=new FileOutputStream("C:\\Users\\Mahesh Maroor\\Desktop\\ToWrite.txt",true);
    String data1="Hi Mahesh,Whats up1";
    byte b1[]=data1.getBytes();
    fout1.write(b1);
}
public static void BufferedInput() throws IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\Mahesh Maroor\\Desktop\\ToRead.txt");
	BufferedInputStream bi=new BufferedInputStream(fis);
	int b;
	while((b=bi.read())!=-1)
	{
		System.out.print((char)b);
	}
	bi.close();
	fis.close();
}
public static void BufferedOutput() throws IOException
{
	FileOutputStream fout=new FileOutputStream("C:\\Users\\Mahesh Maroor\\Desktop\\ToWrite.txt",true);
	BufferedOutputStream bout=new BufferedOutputStream(fout);
	String data="Adding from Buffer";
	byte b[]=data.getBytes();
	bout.write(b);
	bout.flush();
	bout.close();
	fout.close();
	
}
public static void fileWriterEx() throws IOException
{
	FileWriter fw=new FileWriter("C:\\Users\\Mahesh Maroor\\Desktop\\ToWrite.txt",true);
	String data="Writing characters from file writer";
	fw.write(data);
	fw.append("Appending");
	fw.flush();
	fw.close();
}
public static void fileReaderEx() throws IOException
{
	FileReader fr=new FileReader("C:\\Users\\Mahesh Maroor\\Desktop\\ToRead.txt");
	int g;
	while((g=fr.read())!=-1)
	{
		System.out.print((char)g);
	}
	
}
public static void Bufferedwriter() throws IOException
{
	FileWriter bfw=new FileWriter("C:\\Users\\Mahesh Maroor\\Desktop\\ToWrite.txt",true);
	BufferedWriter bw=new BufferedWriter(bfw);
	String data="Writting through buffered writter";
	bw.write(data);
	bw.flush();
	bw.close();
}
public static void bufferedreader() throws IOException
{
	FileReader fr=new FileReader("C:\\Users\\Mahesh Maroor\\Desktop\\ToWrite.txt");
	BufferedReader br=new BufferedReader(fr);
	//br.read();
	int y;
	while((y=br.read())!=-1)
	{
		char c=(char)y;
		System.out.print(c);
	}
}
public static void byteArrayOutput() throws IOException
{
	String Names="Mahesh Maroor Manjushree Yakhatpure";
	byte[] b=Names.getBytes();
	ByteArrayOutputStream baos=new ByteArrayOutputStream();
	File f=new File("C:\\Users\\Mahesh Maroor\\Desktop\\ToWriteMultiple1.txt");
	File f1=new File("C:\\Users\\Mahesh Maroor\\Desktop\\ToWriteMultiple2.txt");
	FileOutputStream fo1=new FileOutputStream(f);
	FileOutputStream fo2=new FileOutputStream(f1);
	baos.write(b);
	baos.writeTo(fo1);
	baos.writeTo(fo2);
	baos.flush();
	baos.close();
	fo1.close();
	fo2.close();	
}
public static void byteRead()
{
	String name="mahesh Chandra";
	byte r[]=name.getBytes();
	ByteArrayInputStream b=new ByteArrayInputStream(r);
	int u=0;
	while((u=b.read())!=-1)
	{
		System.out.print((char)u);
	}
}
public static void DataOuput() throws IOException
{
	FileOutputStream fout=new FileOutputStream("C:\\Users\\Mahesh Maroor\\Desktop\\PrimitiveType.txt");
	DataOutputStream dout=new DataOutputStream(fout);
	dout.write(123);
	dout.writeBoolean(true);
	dout.writeChars("Oh Ma Go Turuh lov");
	dout.writeDouble(123.123);
}
public static void DataInput() throws IOException
{
	FileInputStream fout=new FileInputStream("C:\\Users\\Mahesh Maroor\\Desktop\\PrimitiveType.txt");
	DataInputStream dout=new DataInputStream(fout);
	Boolean b=dout.readBoolean();
	int i=dout.read();
	double d=dout.readDouble();
	String n=dout.readLine();
	System.out.println(b+" "+i+" "+d+ " "+n);
}
public static void main(String[] args) throws IOException {
	DataInput();
}
}
