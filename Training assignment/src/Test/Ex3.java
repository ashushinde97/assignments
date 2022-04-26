package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int stid;
	String stname;
	int salary;

	public Employee(int stid, String stname, int salary) {
		this.stid = stid;
		this.stname = stname;
		this.salary = salary;
	}

}

public class Ex3 {

	public static void main(String[] args) {
		  ArrayList<Employee> list= new ArrayList<Employee>(); 
		  list.add(new Employee(101,"sunil kumar",9000));
		  list.add(new Employee(102,"sunil sharma",2000));
		  list.add(new Employee(103,"aman kumar",12000));
		  list.add(new Employee(104,"vijay kumar",15000));
		  
		  List<Employee> it = list.stream().filter(s->s.salary<10000).collect(Collectors.toList());
		  for (Employee employee : it) {
			  System.out.println(employee.salary);	
		}
	}

}
