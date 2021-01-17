package String;

import java.util.TreeSet;

public class Employee implements Comparable<Employee>
{
	String name;
public Employee(String name)
{
	this.name=name;
}

public String toString() 
{
	return name;
}

@Override
public int compareTo(Employee o) {

	return this.name.compareTo(o.name);
}
}
