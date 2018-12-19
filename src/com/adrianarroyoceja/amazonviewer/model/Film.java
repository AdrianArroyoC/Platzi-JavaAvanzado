package com.adrianarroyoceja.amazonviewer.model;

public abstract class Film {
	
	private String title;
	private String genre;
	private String creator;
	private int duration;
	private short year;
	private boolean viewed;
	
	public Film(String title, String genre, String creator, int duration) {
		super();
		this.title = title;
		this.genre = genre;
		this.creator = creator;
		this.duration = duration;
	}
	
	public abstract void view();
	
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
	
	public String getCreator() {
		return creator;
	}
	
	public void setCreator(String creator) {
		this.creator = creator;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public short getYear() {
		return year;
	}
	
	public void setYear(short year) {
		this.year = year;
	}
	
	public String isViewed() {
		String response = "";
		if(viewed == true) {
			response = "Sí";
		}else {
			response = "No";
		}	
		return response;
	}
	
	public boolean getIsViewed() {
		return viewed;
	}
	
	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}

}