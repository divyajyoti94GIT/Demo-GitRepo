package String;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Sorting1 
{
public static void main(String[] args) {
	TreeSet l1=new TreeSet();
	l1.add(12);
	l1.add(20);
	l1.add(62);
	l1.add(40);
	l1.add(9);
	System.out.println(l1);
	
	TreeSet l=new TreeSet(new mySorting());
	l.add(12);
	l.add(20);
	l.add(62);
	l.add(40);
	l.add(9);
	System.out.println(l);
}
}

class mySorting implements Comparator<Integer>
{

	
	public int compare(Integer o1, Integer o2)
	{
	
		return -o1.compareTo(o2);
	}
	
}
