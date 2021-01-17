package String;

import java.security.DomainCombiner;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DemoPractice1
{
public void occurance(String s) 
{
LinkedHashMap<String,Integer> lh=new LinkedHashMap<String,Integer>();	
s=s.toLowerCase();
String[] str=s.split(" ");
for(int i=0;i<str.length;i++)
{
	String st = str[i];
	if(lh.containsKey(st))
	{
		Integer val = lh.get(st);
		lh.put(st, ++val);
	}
	else
	{
		lh.put(st, 1);
	}
	
}

System.out.println(lh);
Iterator<Entry<String, Integer>> entry = lh.entrySet().iterator();
while(entry.hasNext())
{
  Entry<String, Integer> en = entry.next();
  if(en.getValue()>1)
  {
	  System.out.println(en.getKey()+" = "+en.getValue());
  }
}

}
public static void main(String[] args)
{
DemoPractice1 dm1=new	DemoPractice1();
dm1.occurance("nirma washing powder nirma ");
}
}
