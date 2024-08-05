package com.beans;

public class Address {
	
	private int houseNo;
	private String street;
	private String state;
	
	public Address(int houseNo, String street, String state){
		
		this.houseNo = houseNo;
		this.street = street;
		this.state = state;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#"+houseNo+", \n"+street+"\n"+state;
	}

}
