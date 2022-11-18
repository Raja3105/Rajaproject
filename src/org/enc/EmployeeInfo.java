package org.enc;

public class EmployeeInfo {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String empname) {
		if(empname.equalsIgnoreCase("CHENNAI")) {
			this.name = "RAJA";
		}else if(empname.equalsIgnoreCase("KERALA")){
			this.name ="ANU";
		}else {
			this.name="NONE";
		}
	
	}
}
