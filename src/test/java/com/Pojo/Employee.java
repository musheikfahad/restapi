
package com.Pojo;

import java.util.List;
import java.util.Map;

public class Employee {
	
	private String firstName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public List getSkillSets() {
		return skillSets;
	}
	public void setSkillSets(List skillSets) {
		this.skillSets = skillSets;
	}
	private String lastName;
	private int iD;
	private List skillSets;
	
	

}
