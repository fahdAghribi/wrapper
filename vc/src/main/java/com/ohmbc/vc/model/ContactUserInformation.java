package com.ohmbc.vc.model;

public class ContactUserInformation {

	private String name;
	private String surname;
	private String nif;
	private String email;
	private String phoneNumber;
	private String alias;

	public ContactUserInformation(String name, String surname, String nif, String email, String phoneNumber,
			String alias) {

		this.name = name;
		this.surname = surname;
		this.nif = nif;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.alias = alias;

	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}
}
