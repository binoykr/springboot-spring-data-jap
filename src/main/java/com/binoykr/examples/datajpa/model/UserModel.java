package com.binoykr.examples.datajpa.model;

public class UserModel {

	private String name;

	private AddressModel address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AddressModel getAddress() {
		return address;
	}

	public void setAddress(AddressModel address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + "]";
	}

}
