package String;

import java.util.LinkedHashMap;

public class Test1 
{
public void occuranceofword(String s)
{
	s=s.toLowerCase();
	String[] str=s.split(" ");
	LinkedHashMap<String,Integer> lhm=new LinkedHashMap<String,Integer>();
	for(int i=0;i<str.length;i++)
	{
	String 	wb=str[i];
		if(lhm.containsKey(s.charAt(i)))
		{
			Integer w = lhm.get(s.charAt(i));
              lhm.put(wb, ++w);
		}
		else
		{
			lhm.put(wb, 1);
		}
	}
	System.out.println(lhm);
}
public static void main(String[] args) {
	Test1 ts=new Test1();
	ts.occuranceofword("nirma washing powder nirma");
}
}
