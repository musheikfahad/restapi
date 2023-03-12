package com.lombak;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data public class Movies {

	
	private String title;
	private int year;
	private List<String> cast;

	

}
