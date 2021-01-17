package String;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.jar.Attributes.Name;

public class SortEmployee
{
public static void main(String[] args) {
	TreeSet l2=new TreeSet();
	l2.add(new Employee("guddu"));
	l2.add(new Employee("guddi"));
	l2.add(new Employee("nandu"));
	l2.add(new Employee("jubu"));
	l2.add(new Employee("Babul"));
	System.out.println(l2);
	TreeSet l3=new TreeSet(new reverseemployee());
	l3.add(new Employee("guddu"));
	l3.add(new Employee("guddi"));
	l3.add(new Employee("nandu"));
	l3.add(new Employee("jubu"));
	l3.add(new Employee("Babul"));
	System.out.println(l3);
}
}
class reverseemployee implements Comparator<Employee>
{
	public int compare(Employee o1, Employee o2) {
	
		return  -o1.name.compareTo(o2.name);
	}
	
}
