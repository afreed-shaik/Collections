package com.ojas.collect.emp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EmployeeDetails {
	
	static Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
	
	void menu() {
	    String m = "menu program for map\n";
	    m += "1. Add Employee. \n";
	    m += "2. Remove Employee.\n";
	    m += "3. find Employee.\n";
	    m += "4. List Employee.\n";
	    m += "5. Exit.\n";
	    m += "enter your Choice.\n";
	    System.out.println(m);
	}
	
	public static int addEmployee(Employee emp) {
		int result = 1;
	    int num = 1;
	    employeeMap.put(num, emp);
	    num++;
	    result--;
		return result;
	}
	
	public static int removeEmployee(int empId) {
		int result  = 1;
		employeeMap.remove(empId);
		result--;
		return result;
	}
	
	public static void findEmployee(int empId) {
		System.out.println(employeeMap.get(empId));
		
		
	}
	
	public static Map<Integer, Employee> getEmployeeList() {
		Map<Integer,Employee> hmap = (Map<Integer, Employee>) employeeMap.entrySet();
		for(Map.Entry<Integer, Employee> data : hmap.entrySet()) {
			System.out.println(data.getKey() + " " + data.getValue());
	}
		return hmap;
}
}






















