package String;

public class Test2
{
public void reverse(String s)
{
	char[] ch = s.toCharArray();
	for(int i=ch.length-1;i>=0;i--)
	{
		System.out.print(" "+ch[i]);
	}
}
public static void main(String[] args) {
	Test2 ts=new Test2();
	ts.reverse("guddu");
}
}
