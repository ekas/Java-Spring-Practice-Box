package com.spring.util;

public class Employee {
	private String empId = null;
	private String empName = null;
	private int Salary = 0;
	private  EmpAddress add;
	private EmpDept dept;
	
	
	public Employee(String empId, String empName, int salary, EmpAddress add,EmpDept dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		Salary = salary;
		this.add = add;
		this.dept = dept;
	}


	public Employee() {
		super();
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public EmpAddress getAdd() {
		return add;
	}
	public void setAdd(EmpAddress add) {
		this.add = add;
	}
	public EmpDept getDept() {
		return dept;
	}
	public void setDept(EmpDept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee: \nempId=" + empId + ", empName=" + empName
				+ ", Salary=" + Salary + ", \n" + add.toString() + ", \n" + dept.toString();
	}
	
}
