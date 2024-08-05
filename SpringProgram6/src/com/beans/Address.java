package com.beans;

public class Address {
	
	private String street;
	private int pin;
	private String state;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Street: "+street+"\nPincode: "+pin+"\nState: "+state;
	}

}
