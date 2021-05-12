package com.ojas.collect.ec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Department {
    
    int deptartment_id;
    String deptartment_name;
    List<Course> list;
    

 

    public Department() {
        super();
    }

 

    public Department(int deptartment_id, String deptartment_name) {
        super();
        this.deptartment_id = deptartment_id;
        this.deptartment_name = deptartment_name;
    }

 

    
    public void addCourseToDepartment() {
        Scanner sc = new Scanner(System.in);
         list = new ArrayList<>();
        System.out.println("Enter No Of Courses");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter "+(i + 1)+" Course Details");
            list.add(new Course(sc.nextInt(), sc.next()));
        }
        
    }
    
    @Override
    public String toString() {
        return "Department [deptartment_id=" + deptartment_id + ", deptartment_name=" + deptartment_name + ", Course ="
                + list + "]";    
    }

	
	
	
	
}
