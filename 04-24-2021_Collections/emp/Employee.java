package com.ojas.collect.emp;

public class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	private String empComp;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String empName, double empSalary, String empComp) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empComp = empComp;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpComp() {
		return empComp;
	}

	public void setEmpComp(String empComp) {
		this.empComp = empComp;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empComp=" + empComp
				+ "]";
	}
	
	
	
}
