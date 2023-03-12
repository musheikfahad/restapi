package com.InterviewRestAssuredPOJOforCOMPLEXJSON;

import java.util.List;

public class SuperheroMoviesAndTvSeries {
	private String category;
	private List<String> acceptedFranchises;
	private List<String> generes;
	private List<Movies> movies;
	private List<TvSeries> tvSeries;
	private OtherDetails otherDetails;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<String> getAcceptedFranchises() {
		return acceptedFranchises;
	}
	public void setAcceptedFranchises(List<String> acceptedFranchises) {
		this.acceptedFranchises = acceptedFranchises;
	}
	public List<String> getGeneres() {
		return generes;
	}
	public void setGeneres(List<String> generes) {
		this.generes = generes;
	}
	public List<Movies> getMovies() {
		return movies;
	}
	public void setMovies(List<Movies> movies) {
		this.movies = movies;
	}
	public List<TvSeries> getTvSeries() {
		return tvSeries;
	}
	public void setTvSeries(List<TvSeries> tvSeries) {
		this.tvSeries = tvSeries;
	}
	public OtherDetails getOtherDetails() {
		return otherDetails;
	}
	public void setOtherDetails(OtherDetails otherDetails) {
		this.otherDetails = otherDetails;
	}
	
	
	

}
