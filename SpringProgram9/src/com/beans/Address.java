package com.beans;

public class Address {
	
	private int hsNo;
	private String st;
	private String cnt;
	
	public int getHsNo() {
		return hsNo;
	}
	public void setHsNo(int hsNo) {
		this.hsNo = hsNo;
	}
	public String getSt() {
		return st;
	}
	public void setSt(String st) {
		this.st = st;
	}
	public String getCnt() {
		return cnt;
	}
	public void setCnt(String cnt) {
		this.cnt = cnt;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#"+hsNo+", \n"+st+",\n"+cnt;
	}
	
	

}
