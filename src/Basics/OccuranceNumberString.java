package Basics;

import java.util.jar.Attributes.Name;

public class OccuranceNumberString {
public static void main(String[] args) {
	String name="mahesh maroor";
	char c='m';
	int count =0;
	for(int i=0;i<name.length();i++)
	{
		if(name.charAt(i)==c)
		{
			count++;
		}
	}
	System.out.println(count);
	int occ=name.length()-name.replace("m", "").length();
	System.out.println(occ);
}

}
