package model.records;

import interfaces.RecordInterface;

public class MovieSession implements RecordInterface{

	private String movieName;
	private String sessionTime;
	private int numberOfSeats;
	private String theatreName;
	
	public MovieSession(String movieName, String sessionTime, int numberOfSeats, String theatreName) {
		setMovieName(movieName);
		setSessionTime(sessionTime);
		setNumberOfSeats(numberOfSeats);
		setTheatreName(theatreName);
	}
	
	@Override
	public String getAsFormattedString() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getSessionTime() {
		return sessionTime;
	}

	public void setSessionTime(String sessionTime) {
		this.sessionTime = sessionTime;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getTheatreName() {
		return theatreName;
	}

	
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

}
