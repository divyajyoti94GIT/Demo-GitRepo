package String;

import java.util.LinkedHashMap;

public class Demo2
{
	public void wordoccByCollection(String s)
	{
		LinkedHashMap<String,Integer> lh=new LinkedHashMap<String,Integer>();
		s=s.toLowerCase();
	    String [] st= s.split(" ");
		for(int i=0;i<=st.length-1;i++)
		{
	       String w = st[i];
		if(lh.containsKey(w))
		{
			Integer val = lh.get(w);
			lh.put(w, val+1);
		}
		else
		{
			lh.put(w,1);
		}
		}
		System.out.println(lh);
}
public static void main(String[] args) {
	Demo2 dm2=new Demo2();
	dm2.wordoccByCollection("washing power nirma doodh ki safedi nirma");
}
}
