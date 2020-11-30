package ExceptionHandling;

import java.io.IOException;

public class TryCatchEx1 
{
public static void m1() throws IOException 
{
	
		throw new IOException("Hi");
	
		
}
public static void m2() throws IOException
{
	
		m1();
	
}
public static void main(String[] args) throws IOException{
	m1();
}
}
