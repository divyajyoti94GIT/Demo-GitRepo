package String;

import java.util.Comparator;
import java.util.TreeSet;

public class SortBook 
{
public static void main(String[] args)
{
TreeSet ts=new TreeSet();	
ts.add(new Book("fmcg"));
ts.add(new Book("fmhm"));
ts.add(new Book("mos"));
ts.add(new Book("som"));
ts.add(new Book("mechanics"));
System.out.println(ts);
TreeSet ts1=new TreeSet(new reverseSort());	
ts1.add(new Book("fmcg"));
ts1.add(new Book("fmhm"));
ts1.add(new Book("mos"));
ts1.add(new Book("som"));
ts1.add(new Book("mechanics"));
System.out.println(ts1);}
}
class reverseSort implements Comparator<Book>
{


	public int compare(Book o1, Book o2) {

		return -o1.bookname.compareTo(o2.bookname);
	}
	
}
