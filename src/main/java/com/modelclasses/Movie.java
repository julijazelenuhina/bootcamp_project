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
	private double duration;
	
	@NotNull
	private String restriction;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long movieId;

	public Movie(@NotNull String title, @NotNull String genre, @NotNull double duration, @NotNull String restriction) {
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

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getRestriction() {
		return restriction;
	}

	public void setRestriction(String restriction) {
		this.restriction = restriction;
	}

	public Long getMovieId() {
		return movieId;
	}
	
	public enum movieGenre {HORROR, COMEDY, CRIME, DRAMA, FANTASY, THRILLER, ANIMATION}
	
	public enum movieRestriction {G, PG, PG13, R, NC17}
	
}

