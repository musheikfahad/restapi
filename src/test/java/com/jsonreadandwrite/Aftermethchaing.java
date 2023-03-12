package com.jsonreadandwrite;
public class Aftermethchaing {
	//private constructer
	private Aftermethchaing() {
		
	}
	String place ;
	public String getPlace() {
		return place;
	}
	public Aftermethchaing  setPlace(String place) {
		this.place = place;
		return this;
	}
	
	
	String modeOfTravel; 
	public String getModeOfTravel() {
		return modeOfTravel;
	}
	public Aftermethchaing setModeOfTravel(String modeOfTravel) {
		this.modeOfTravel = modeOfTravel;
		return this;
	}
	
	
	public void heyManWhereAreYouGoing(){
		System.out.println(getPlace());
		
		System.out.println("oh you are going by "+getModeOfTravel() +"la" + getPlace()+ "poriya??");
		
	}
	public static void main(String[] args) {
		Aftermethchaing tour = new Aftermethchaing();
		tour.setPlace("pamban").setModeOfTravel("bike").heyManWhereAreYouGoing();
		}	}
