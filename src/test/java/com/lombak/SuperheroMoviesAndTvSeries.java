package com.lombak;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class SuperheroMoviesAndTvSeries {
	@Getter
	@Setter
	private String category;
	@Getter
	@Setter
	private List<String> acceptedFranchises;
	@Getter
	@Setter
	private List<String> generes;
	@Getter
	@Setter
	private List<Movies> movies;
	@Getter
	@Setter
	private List<TvSeries> tvSeries;
	@Getter
	@Setter
	private OtherDetails otherDetails;
	
	
	
	

}
