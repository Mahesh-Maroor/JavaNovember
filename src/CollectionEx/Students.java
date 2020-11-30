package CollectionEx;

public class Students implements Comparable<Students>
{
String s;
int id;
public Students(String s,int i)
{
	this.s=s;
	id=i;
}
@Override
public int compareTo(Students o) {
	if(id>o.id)
	return -1;
	else if(id<o.id)
		return 1;
	else
	return 0;
	
}
}
