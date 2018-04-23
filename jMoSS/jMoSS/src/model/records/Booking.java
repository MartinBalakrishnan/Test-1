package model.records;

import interfaces.RecordInterface;

public class Booking implements RecordInterface{
	
	private String customerEmail;
	private String suburb;
	private MovieSession movieSession;
	private int bookedSeats;

	
	
	public Booking(String customerEmail, String suburb, MovieSession movieSession, int bookedSeats) {
		this.customerEmail = customerEmail;
		this.suburb = suburb;
		this.movieSession = movieSession;
		this.bookedSeats = bookedSeats;
	}
	
	@Override
	public String getAsFormattedString() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	public MovieSession getMovieSession() {
		return movieSession;
	}

	public void setMovieSession(MovieSession movieSession) {
		this.movieSession = movieSession;
	}

	public int getBookedSeats() {
		return bookedSeats;
	}

	public void setBookedSeats(int bookedSeats) {
		this.bookedSeats = bookedSeats;
	}

}
