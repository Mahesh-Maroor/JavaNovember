package MapEx;

import java.util.HashMap;

public class CharacterFrequency {
public static void main(String[] args) {
	String name="maheshmaroor";
	HashMap<Character, Integer> j=new HashMap<>();
	for(int i=0;i<name.length();i++)
	{
		if(!j.containsKey(name.charAt(i)))
		{
			j.put(name.charAt(i),1);
		}
		else
		{
			j.put(name.charAt(i), j.get(name.charAt(i))+1);
		}
	}
	System.out.println(j);
}
}
