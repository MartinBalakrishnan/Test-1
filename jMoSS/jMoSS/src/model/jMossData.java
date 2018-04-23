package model;

import java.util.ArrayList;

import interfaces.jMossIOInterface;
import model.records.*;

public class jMossData implements jMossIOInterface {

	public static jMossData instance = null;

	private ArrayList<Booking> bookings;
	private ArrayList<Clerk> clerks;
	private ArrayList<MovieSession> movieSessions;

	private jMossData() {

	}

	static public jMossData getInstance() {
		if (instance == null) {
			instance = new jMossData();
		}

		return instance;
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub

	}

	@Override
	public void load() {
		// TODO Auto-generated method stub

	}

	public ArrayList<Booking> getBookings() {
		return bookings;
	}



	public ArrayList<Clerk> getClerks() {
		return clerks;
	}


	public ArrayList<MovieSession> getMovieSessions() {
		return movieSessions;
	}
	
	
	public void addBooking(String customerEmail, String suburb, String movieSession, int noBookedSeats) {
		
	}


}
