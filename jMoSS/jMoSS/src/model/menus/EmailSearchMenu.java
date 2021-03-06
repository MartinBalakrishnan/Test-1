package model.menus;

import interfaces.MenuInterface;
import model.records.Booking;

public class EmailSearchMenu implements MenuInterface {

	@Override
	public void displayMenu() {
		/*
		 * This will be the primary display of the menu, designed purely for output.
		 * If sub menus exist, it may be necessary to alter or add arguements for this.
		 * In the case of sub menus for a section, consider the use switches, and a storage variable
		 * for user input selection
		 */
		
	}

	@Override
	public void handleMenu() {
		/*
		 * This will be the primary handler of the menu, for dealing with user input.
		 * Here will be how the system responds to user input, and thus correct and incorrect responses, in conjunction with the
		 * displayMenu(); function.
		 */
		
	}
	
	//A function that should search through the bookings, and iterate through matching them based on email address.
	public Booking searchBooking(String emailAddress)
	{
		return null;
	}

}
