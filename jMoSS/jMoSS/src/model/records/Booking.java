package model.records;

import interfaces.RecordInterface;

public class Booking implements RecordInterface{
	
	
	private String customerEmail;
	private String suburb;
	private MovieSession movieSession;
	private int bookedSeats;
	private String bookingNumber;

	
	// Constructor for bookings, call whenever making a new booking.
	public Booking(String customerEmail, String suburb, MovieSession movieSession, int bookedSeats, String bookingNumber) {
		this.setCustomerEmail(customerEmail);
		this.setSuburb(suburb);
		this.setMovieSession(movieSession);
		this.setBookedSeats(bookedSeats);
		this.setBookingNumber(bookingNumber);
	}
	
	//Returns the Booking a formatted string for saving to files.
	@Override
	public String getAsFormattedString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//Below here are just traditional getters and setters.
	
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

	public String getBookingNumber() {
		return bookingNumber;
	}

	public void setBookingNumber(String bookingNumber) {
		this.bookingNumber = bookingNumber;
	}

}
