package org.springExample.serviceImp;

import javax.annotation.Resource;


import org.springExample.service.Departments;
import org.springframework.beans.factory.annotation.Qualifier;

public class Department implements Departments{

	private String departmentName;
	//@Autowired
		@Resource(name="mystudent")
		private Student student;
	
		@Resource
		@Qualifier("defaultFile")
		private Staf staf;
		
		
		public Staf getStaf() {
			return staf;
		}

		public void setStaf(Staf staf) {
			this.staf = staf;
		}
		
		public Student getStudent() {
			return student;
		}

		public void setStudent(Student student) {
			this.student = student;
		}
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	
	
	@Override
	public String toString() {
		return "Department [departmentName =" + departmentName + ", student=" + student + ", staf=" + staf + "]";
	}

	@Override
	public void deptName() {
		
		System.out.println("department name is "+departmentName);
		
	}

}
