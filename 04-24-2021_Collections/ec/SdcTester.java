package com.ojas.collect.ec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SdcTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Deratment Id and name");
        Scanner sc = new Scanner(System.in);        
        Department d = new Department(sc.nextInt(),sc.next());        
        d.addCourseToDepartment();
        Course c = new Course();
        c.addStudentToCourse();
       
        System.out.println(d);
        System.out.println(c);
	}

}
