package com.converter.db;

import java.io.Serializable;

public class Conv implements Serializable{
	private static final long serialVersionUID = 1L;
	private int convertID;
	private int userID;
	private String fParametr;
	private String sParametr;
	private double fValue;
	private double sValue;
	public Conv() {
		
	}
	public Conv(int convertID, int userID, String fParametr, String sParametr, double fValue, double sValue) {
		this.convertID = convertID;
		this.userID = userID;
		this.fParametr = fParametr;
		this.sParametr = sParametr;
		this.fValue = fValue;
		this.sValue = sValue;
	}
	public Conv(int userID, String fParametr, String sParametr, double fValue, double sValue) {
		this.userID = userID;
		this.fParametr = fParametr;
		this.sParametr = sParametr;
		this.fValue = fValue;
		this.sValue = sValue;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getfParametr() {
		return fParametr;
	}
	public void setfParametr(String fParametr) {
		this.fParametr = fParametr;
	}
	public String getsParametr() {
		return sParametr;
	}
	public void setsParametr(String sParametr) {
		this.sParametr = sParametr;
	}
	public double getfValue() {
		return fValue;
	}
	public void setfValue(double fValue) {
		this.fValue = fValue;
	}
	public double getsValue() {
		return sValue;
	}
	public void setsValue(double sValue) {
		this.sValue = sValue;
	}
	public int getconvertID() {
		return convertID;
	}
} 


