package Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Cloneable,Serializable {
public String name="mahesh";
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException, IOException {
	Student s=new Student();
	System.out.println("name by object creation by new:"+s.name);
	Class cls=Class.forName("Basics.Student");
	Student s1=(Student) cls.newInstance();
	System.out.println("name by new instance:"+s1.name);
	Student s2=(Student)s.clone();
	System.out.println("name by clone:"+s2.name);
	FileOutputStream fo=new FileOutputStream("F.txt");
	ObjectOutputStream out=new ObjectOutputStream(fo);
	out.writeObject(s);
	FileInputStream fi=new FileInputStream("F.txt");
	ObjectInputStream in=new ObjectInputStream(fi);
	Student d1=(Student)in.readObject();
	System.out.println("Name by serialization:"+d1.name);
	
	
}
}
