package com.jsonreadandwrite;

import org.apache.commons.math3.genetics.TournamentSelection;
import org.testng.annotations.Test;

public class MethChainexplaination {
	String place;

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;

	}

	String modeOfTravel;

	public String getModeOfTravel() {
		return modeOfTravel;
	}

	public void setModeOfTravel(String modeOfTravel) {
		this.modeOfTravel = modeOfTravel;

	}

	public void heyManWhereAreYouGoing() {
		
		System.out.println("oh you are going by " + getModeOfTravel() + "la" + getPlace() + "poriya??");

	}

	public static void main(String[] args) {
		MethChainexplaination tour = new MethChainexplaination();
		tour.setPlace("Ooty");
		tour.setModeOfTravel("Bike");
		tour.heyManWhereAreYouGoing(); 
		}
	}

	
