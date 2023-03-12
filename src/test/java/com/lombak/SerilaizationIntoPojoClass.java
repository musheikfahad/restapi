package com.lombak;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerilaizationIntoPojoClass {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		SuperheroMoviesAndTvSeries heromoviesandtvseries = new SuperheroMoviesAndTvSeries();

		// category
		heromoviesandtvseries.setCategory("Super Hero Movies & Tv series");

		// AcceptedFranchise is list in that list add franchise company
		List<String> acceptedFrnachisess = new ArrayList<String>();
		acceptedFrnachisess.add("DC");

		acceptedFrnachisess.add("Marvel");

		// now add that list inside the pojo

		heromoviesandtvseries.setAcceptedFranchises(acceptedFrnachisess);

		// genres
		// here also list of generes are this
		List<String> genres = new ArrayList<String>();

		// now add all those generes into generes list
//		 "Action",
//         "Adventure",
//         "Heroic",
//         "Dark",
//         "Funny"
		genres.add("Action");
		genres.add("Adventure");
		genres.add("Heroic");
		genres.add("Dark");
		genres.add("Gritty");
		genres.add("Funny");
		genres.add("Gore");

		heromoviesandtvseries.setGeneres(genres);

		
		//list of all movies
		
		List<Movies> allmovies = new ArrayList<Movies>();
		// now create a obj for movies class

		Movies batsy = new Movies();

		// set first movie
		batsy.setTitle("Batman : The Dark KNight");

		batsy.setYear(2008);

		List<String> batsycast = new ArrayList<String>();

		batsycast.add("Christian Bale");
		batsycast.add("Heath Ledger");

		batsy.setCast(batsycast);
		
		//now add batman into all movie list
		
		allmovies.add(batsy);
		
		// second movie
		Movies JL = new Movies();

		JL.setTitle("JUTICE LEAGUE : SNyder CUT");
		JL.setYear(2021);

		List<String> jla = new ArrayList<String>();

		jla.add("Henry Cavil");

		jla.add("Ben Affleck");

		jla.add("Gal GAdot");

		JL.setCast(jla);

		//now add jl into all movies
		
		allmovies.add(JL);
		// third mOvie

		Movies spidey = new Movies();

		spidey.setTitle("Spderman : No way Home");

		spidey.setYear(2022);

		List<String> tobey = new ArrayList<String>();
		tobey.add("Tobey Mcguire");
		tobey.add("Andrew Garfield");
		tobey.add("Tom holland");

		spidey.setCast(tobey);

		
		//now add noway home into all movies
		allmovies.add(spidey);
		
		
		// now go to tv series

		TvSeries flash = new TvSeries();
		
		//list for adding all tv series
		
		List<TvSeries> hbomax = new ArrayList<TvSeries>();

		flash.setTitle("Flash");
		flash.setYear(2014);
//add flash into tv series list
		
		hbomax.add(flash);
		// second tv series

		TvSeries gotham = new TvSeries();
		gotham.setTitle("Gotham TV Series");
		gotham.setYear(2018);
		
		//add gotham into tv series list
		
				hbomax.add(gotham);

		// third tv series

		TvSeries kar_el = new TvSeries();
		kar_el.setTitle("Super girl");
		kar_el.setYear(2015);
		//add super girl into tv series list
		
				hbomax.add(kar_el);
		
		//create obj for other details
		
		OtherDetails oDCountry = new OtherDetails();
		oDCountry.setCountry("USA ,ENgland");
		oDCountry.setLanguage("English only");
	
	
	//set movies into heromoviesandtvseries into superheromovies and tv series class
		
		heromoviesandtvseries.setMovies(allmovies);
		
		//set tvseries into heromoviesandtvseries into superheromovies and tv series class
	
	heromoviesandtvseries.setTvSeries(hbomax);
	
	//set other details into heromoviesandtvseries into superheromovies and tv series class
	
	heromoviesandtvseries.setOtherDetails(oDCountry);
	
	
	
	//serializing begins
	
	
	// we need object mapper
	
	
	ObjectMapper mappier = new ObjectMapper();
	
	
	File superJson = new File("complxsuperherojson");
	
	mappier.writerWithDefaultPrettyPrinter()
	.writeValue(superJson, heromoviesandtvseries);
	}
	
	
	
	
}
