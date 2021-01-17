package String;

public class Book implements Comparable<Book>
{
	String bookname;
public Book(String bookname)
{
	this.bookname=bookname;
}
public String toString()
{
	return bookname;
}

public int compareTo(Book o)
{
return this.bookname.compareTo(o.bookname);
}

}
