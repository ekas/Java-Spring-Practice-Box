package com.spring.util;

import java.util.List;

public class EmpDept {
	private String deptId;
	private String deptName;
	private List<String> location;
	
	public EmpDept() {
		super();
	}

	public EmpDept(String deptId, String deptName, List<String> location) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.location = location;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<String> getLocation() {
		return location;
	}

	public void setLocation(List<String> location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "EmpDept :\ndeptId=" + deptId + ", deptName=" + deptName
				+ ", location=" + location;
	}
	
	
}
