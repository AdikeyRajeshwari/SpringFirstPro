package org.springExample.serviceImp;

import org.springExample.service.Stafs;

public class Staf implements Stafs{

	private String stafId;
	
	
	public String getStafId() {
		return stafId;
	}


	public void setStafId(String stafId) {
		this.stafId = stafId;
	}


	@Override
	public String toString() {
		return "Staf [stafId =" + stafId + "]";
	}


	@Override
	public void stafDetails() {
		System.out.println("staf details");
		
	}

}
