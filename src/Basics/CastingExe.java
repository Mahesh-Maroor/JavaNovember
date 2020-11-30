package Basics;

public class CastingExe 
{
public static Animal a=new Animal();
String name;
public CastingExe(Animal b,String n) {
a=b;
name=n;

}
public static void main(String[] args) {
Animal a=new Lion();
Lion l=(Lion) a;

}
}
