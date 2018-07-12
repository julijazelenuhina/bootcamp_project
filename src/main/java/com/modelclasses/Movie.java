package com.modelclasses;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Movie {
	
	@NotNull
	private String title;
	
	@NotNull
	private String genre;
	
	@NotNull
	private int duration;
	
	@NotNull
	private int restriction;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long movieId;

	public Movie(@NotNull String title, @NotNull String genre, @NotNull int duration, @NotNull int restriction) {
		super();
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.restriction = restriction;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getRestriction() {
		return restriction;
	}

	public void setRestriction(int restriction) {
		this.restriction = restriction;
	}

	public Long getMovieId() {
		return movieId;
	}

}
