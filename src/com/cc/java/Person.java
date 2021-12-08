package com.cc.java;

public class Person {
	
	private String familyName;
	private String firstName;
	private int birthYear;
	
	/**
	 * 
	 * @param name 		: Familienname des MA
	 * @param firstName : Vorname des MA 
	 * @param birthYear : Geburtsjahr MA
	 */
	public Person(String familyName, String firstName, int birthYear) {		
		this.familyName = familyName;
		this.firstName = firstName;
		this.birthYear = birthYear;
	}

	//-----------------  Getter / Setter --------------//

	/**
	 * Getter
	 * @return name  // Familienname MA
	 */
	protected String getFamilyName() {
		return familyName;
	}
	
	/**
	 * Setter
	 * @param name // Familienname MA
	 */
	protected void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	
	/**
	 * Getter
	 * @return fistName // Vorname MA
	 * 
	 */
	protected String getFirstName() {
		return firstName;
	}
	
	/**
	 * Setter
	 * @param firstName // Vorname MA
	 * Vorname
	 */
	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Getter
	 * @return birthYear // Geburtsjahr MA
	 */
	protected int getBirthYear() {
		return birthYear;
	}
	
	
	//----------------- Methoden --------------//
	
	/**
	 *  Ausgabe --> production
	 */
	protected String getPersonalData() {
		return "Hi, I'm " + firstName + " " + familyName + " & I was born in "+  this.birthYear + ".";		
	}

}
