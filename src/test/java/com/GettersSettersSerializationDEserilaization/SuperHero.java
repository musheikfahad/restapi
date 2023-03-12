
package com.GettersSettersSerializationDEserilaization;

import java.util.List;

public class SuperHero {
	
	private String firstName;
	private String AlteregoName;
	private String comicbook;
	private List skillSets;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getAlteregoName() {
		return AlteregoName;
	}
	public void setAlteregoName(String AlteregoName) {
		this.AlteregoName = AlteregoName;
	}
	public String getComicbook() {
		return comicbook;
	}
	public void setComicbook(String comicbook) {
		this.comicbook = comicbook;
	}
	public List getSkillSets() {
		return skillSets;
	}
	public void setSkillSets(List skillSets) {
		this.skillSets = skillSets;
	}
	

}
