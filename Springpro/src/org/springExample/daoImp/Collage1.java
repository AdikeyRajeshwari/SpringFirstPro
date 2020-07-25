package org.springExample.daoImp;

import javax.annotation.Resource;


import org.springExample.dao.Collages;
import org.springExample.serviceImp.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Collage1 implements Collages{

	private String clgName;
	
	
	//@Autowired
	@Resource
	private Department dept;
	
	

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	
	
	public String getClgName() {
		return clgName;
	}


	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	


	@Override
	public String toString() {
		return "Collage1 [clgName=" + clgName + ", dept=" + dept + "]";
	}

	@Override
	public void collageName() {
		System.out.println("This is collage class");
		
	}


	
	
	

}
