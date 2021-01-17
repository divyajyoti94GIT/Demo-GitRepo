package String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapPractice 
{
public static void main(String[] args) 
{
	HashMap <String ,Integer> hm=new HashMap<String,Integer>();
	hm.put("BBSR", 12);
	hm.put("CTC", 13);
	hm.put("BAM", 14);
	hm.put("BLR", 15);
	hm.put("DEL", 125);
	System.out.println(hm);
	Iterator it=hm.keySet().iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	Iterator<Entry<String, Integer>> es = hm.entrySet().iterator();
	while(es.hasNext())
	{
    Entry<String, Integer> entry = es.next();
    System.out.println(entry.getKey()+"  "+entry.getValue());
	}
	hm.forEach((k,v)->System.out.println(k+v));
	}
}
