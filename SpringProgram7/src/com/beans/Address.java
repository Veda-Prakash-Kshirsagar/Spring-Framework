package com.beans;

public class Address {
	
	private String street;
	private int pin;
	private String state;
	
	Address(String street,int pin,String sts){
		
		this.street = street;
		this.pin = pin;
		this.state = sts;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Street: "+street+"\nPincode: "+pin+"\nState: "+state;
	}

}
