package String;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Test 
{
public void occurance(String s)
{
	LinkedHashMap<Character,Integer> lh=new LinkedHashMap<Character,Integer>();
	for(int i=0;i<=s.length()-1;i++)
	{
		if(lh.containsKey(s.charAt(i)))
		{
		Integer val = lh.get(s.charAt(i));
		lh.put(s.charAt(i), ++val);
		}
		else
		{
			lh.put(s.charAt(i), 1);
		}
	}
	System.out.println(lh);
	Iterator<Entry<Character, Integer>> es = lh.entrySet().iterator();
while(es.hasNext())
{
	Entry<Character, Integer> ent = es.next();
	if(ent.getValue()>1)
	{
		System.out.println(ent.getKey()+" "+ent.getValue());
	}
}
}

public static void main(String[] args) {
	Test t=new Test();
	t.occurance("mechanical");
}
}
