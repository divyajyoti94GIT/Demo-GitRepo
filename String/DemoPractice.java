package String;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class DemoPractice
{
public void OccuranceString(String s)
{
	LinkedHashMap<String,Integer> lhm=new LinkedHashMap<String,Integer>();
	s=s.toLowerCase();
	String[] st=s.split(" ");
	for(int i=0;i<=st.length-1;i++)
	{
		String w=st[i];
		if(lhm.containsKey(w))
		{
		Integer val = lhm.get(w);
		lhm.put(w, val+1);
		}
		else
		{
			lhm.put(w, 1);
		}
	}
	System.out.println(lhm);
}
public static void main(String[] args) {
	DemoPractice dm=new DemoPractice();
	dm.OccuranceString("nirma washing powder nirma");
 String s="nirma washing";
String[] st= s.split(" ");
System.out.println(Arrays.toString(st));
}
}
