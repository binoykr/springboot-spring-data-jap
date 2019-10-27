package com.binoykr.examples.datajpa.model;

public class AddressModel {

	private String street;

	private String area;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "AddressModel [street=" + street + ", area=" + area + "]";
	}

}
