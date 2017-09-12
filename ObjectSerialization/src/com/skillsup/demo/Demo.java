package com.skillsup.demo;

/**
 * Created by osyniaeva on 9/12/17.
 */
public class Demo {
	public static void main(String[] args) {
		WriteObjectManager obj = new WriteObjectManager();

		Address address = new Address();
		address.setStreet("wall street");
		address.setCountry("united state");

		obj.serializeAddress(address);
	}
}
