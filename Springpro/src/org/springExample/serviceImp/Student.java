package org.springExample.serviceImp;

import org.springExample.service.Students;

public class Student implements Students{

	private String sName;
	private String sId;
	
	
	

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsId() {
		return sId;
	}

	public void setsId(String sId) {
		this.sId = sId;
	}

	@Override
	public void StudentName() {
		
		System.out.println("student name is" +sName);
	}

	@Override
	public String toString() {
		return "Student [sName=" + sName + ", sId=" + sId + "]";
	}

	@Override
	public void studentId() {
		
		System.out.println("student id is "+sId);
		
	}

}
