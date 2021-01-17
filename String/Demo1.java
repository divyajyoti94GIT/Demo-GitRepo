package String;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Demo1
{
public  String reversestring(String s)
{
	StringBuffer sb=new StringBuffer(s);
	return sb.reverse().toString();
}
public String withoutReadyMade(String s)
{
	String rev="  " ;
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	return rev;

}
public int  lengthOfString(String s)
{
	char[] charArray=s.toCharArray();
	int count=0;
	for(char c:charArray)
	{
		count++;
	}
	return count;
}
public void occuranceByCollection(String s)
{
	LinkedHashMap<Character,Integer> lh=new LinkedHashMap<Character,Integer>();
	s=s.toLowerCase();
	for(int i=0;i<=s.length()-1;i++)
	{
	char ch=	s.charAt(i);
	if(lh.containsKey(ch))
	{
		Integer val = lh.get(ch);
		lh.put(ch, val+1);
	}
	else
	{
		lh.put(ch,1);
	}
	}
	System.out.println(lh);
	System.out.println(" ======  pick duplicate and print   ====");
	Iterator<Entry<Character,Integer>> es = lh.entrySet().iterator();
	while(es.hasNext())
	{
	Entry<Character,Integer> entry = es.next();
	if(entry.getValue()>1)
	{
		System.out.println(entry.getKey()+"  =  "+entry.getValue());
	}

//	if(entry.getValue()==1)
//	{
//		System.out.println(entry.getKey()+" = "+entry.getValue());
//	}
	}
	
}
public static void main(String[] args) {
	Demo1 dm1=new Demo1();
	String rev = dm1.reversestring("MahaBharat");
	System.out.println(rev); 
	System.out.println(dm1.withoutReadyMade("Ramayan"));
	System.out.println(dm1.lengthOfString("ramayan"));
	dm1.occuranceByCollection("Mahabharat");
}
}
