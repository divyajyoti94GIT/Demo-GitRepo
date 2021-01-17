package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting 
{
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(12);
	al.add(20);
	al.add(9);
	al.add(15);
	al.add(37);
	System.out.println(al);
	Collections.sort(al,new mySort());
System.out.println(al);
}
}
class mySort implements Comparator<Integer>
{
	public int compare(Integer o1, Integer o2)
	{
		
		return -o1.compareTo(o2);
	}
	
}

