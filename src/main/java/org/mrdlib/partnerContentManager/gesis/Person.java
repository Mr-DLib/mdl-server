package org.mrdlib.partnerContentManager.gesis;

import java.util.stream.Collectors;

/**
 * 
 * @author Millah
 *
 *         a class which wraps the structure of a person (containing the names)
 * 
 */
public class Person {
	int id;
	String firstname;
	String middlename;
	String surname;
	String unstructured;
	double rankingValue;
	int position;

	public Person(String unstructured) {
		this.unstructured = unstructured;
	}
	
	public Person() {}

	public Person(String firstname, String surname) {
		this.firstname = firstname;
		this.surname = surname;
	}

	public Person(String firstname, String middlename, String surname) {
		this.firstname = firstname;
		this.middlename = middlename;
		this.surname = surname;
	}

	public Person(String firstname, String middlename, String surname, String unstructured) {
		this.firstname = firstname;
		this.middlename = middlename;
		this.surname = surname;
		this.unstructured = unstructured;
	}

	public Person(int id, String firstname, String middlename, String surname, String unstructured) {
		this.id = id;
		this.firstname = firstname;
		this.middlename = middlename;
		this.surname = surname;
		this.unstructured = unstructured;
	}
	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Person(int id) {
		this.id = id;
	}

	public double getRankingValue() {
		return rankingValue;
	}

	public void setRankingValue(double rankingValue) {
		this.rankingValue = rankingValue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUnstructured() {
		return unstructured;
	}

	public void setUnstructured(String unstructured) {
		this.unstructured = unstructured;
	}

	// get the whole name as String with "firstname (middlename?) surname" or
	// "unstructured"
	public String getName() {
		if ((firstname == null || surname == null) && unstructured != null)
			return unstructured;
		else if (middlename == null)
			return firstname + " " + surname;
		else
			return firstname + " " + middlename + " " + surname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Person{");
		sb.append("id = ").append(getId());
		sb.append(", firstname = ").append(getFirstname());
		sb.append(", middlename = ").append(getMiddlename());
		sb.append(", surname = ").append(getSurname());
		sb.append(", unstructured = ").append(getUnstructured());
		sb.append(", rankingValue = ").append(getRankingValue());
		sb.append(", position = ").append(getPosition());
		return sb.append("}").toString();
	}

}
