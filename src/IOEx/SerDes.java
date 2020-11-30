package IOEx;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDes {
public static void m2() throws IOException, ClassNotFoundException
{
	FileOutputStream fout=new FileOutputStream("C:\\Users\\Mahesh Maroor\\Desktop\\DesSer.txt");
	ObjectOutputStream out=new ObjectOutputStream(fout);
    StudentsDes s=new StudentsDes();
    out.writeObject(s);
    out.close();
    fout.close();
    FileInputStream fi=new FileInputStream("C:\\Users\\Mahesh Maroor\\Desktop\\DesSer.txt");
    ObjectInputStream oin=new ObjectInputStream(fi);
    StudentsDes k=(StudentsDes)oin.readObject();
    k.m1();
    
}

public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
	Class cls=Class.forName("IOEx.SerDes");
	SerDes d=(SerDes)cls.newInstance();
	d.m2();
}
}
