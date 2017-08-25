package com.despegar.altovuelo.report;

import java.time.LocalDate;

/**
 * 
 * @author draffaeli
 *
 */
public class Customer {

	private String name;
	private String lastName;
	private LocalDate birthDate;

	public Customer() {}
	public Customer(String name, String lastName, LocalDate birthDate) {
		this.name = name;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
}
