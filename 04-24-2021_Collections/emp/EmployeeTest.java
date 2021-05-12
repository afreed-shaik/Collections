package com.ojas.collect.emp;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		EmployeeDetails obj = new EmployeeDetails();
        int res;
        while (true) {
            obj.menu();
            int choice = sc.nextInt();
            switch (choice) {
            case 1:
                System.out.println("Enter the employee details to add");
                res = obj.addEmployee(new Employee(sc.nextInt(),sc.next(), sc.nextDouble(), sc.next()));
                if (res == 0) {
                    System.out.println("inserted Successfully");
                } else {
                    System.out.println("Not inserted Successfully");
                }
                break;
            case 2:
                System.out.println("Enter the employee Id to Remove");
                res = obj.removeEmployee(sc.nextInt());
                if (res == 0) {
                    System.out.println("Removed Successfully");
                } else {
                    System.out.println("Not Removed Successfully");
                }
                break;
            case 3:
                System.out.println("Enter the employee Id to get");
                obj.findEmployee(sc.nextInt());
                break;
            case 4:
                Map<Integer, Employee> resultMap = obj.getEmployeeList();
                if (resultMap == null) {
                    System.out.println("No employee Details");
                } 
                else {
                    for (Map.Entry<Integer, Employee> entry : resultMap.entrySet()) {
                        System.out.println("EmpId : " + entry.getKey()
                        + " Employee Details: " + entry.getValue());
                    }
                }
                break;
            case 5:
                System.exit(0);
            }

 

        }

 
	}

}
