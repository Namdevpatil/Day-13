package javaLambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example7{

	public static void main(String[] args) 
	{

		List<Employee> employeeList1 = new ArrayList<Employee>();

		employeeList1.add(new Employee(101, "dinesh", "Tester"));
		employeeList1.add(new Employee(111, "sham", "Architect"));
		employeeList1.add(new Employee(102, "kumar", "Senior Recruiter"));
		employeeList1.add(new Employee(105, "raj", "Java Developer"));
		employeeList1.add(new Employee(109, "rakesh", "Business Anylyst"));
		employeeList1.add(new Employee(101, "dinesh", "Tester"));
		
		employeeList1.forEach((employee) -> System.out.println(employee.toString()));

		System.out.println("----------------------------------------------------------------");
		
		Collections.sort(employeeList1, (e1, e2) -> {
			
			return e1.getDesignation().compareTo(e2.getDesignation());
			
		});
		
		employeeList1.forEach((employee) -> System.out.println(employee.toString()));
		
	}

}
