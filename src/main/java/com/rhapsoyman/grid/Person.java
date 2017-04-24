package com.rhapsoyman.grid;

public class Person {

	public String name;
	public int BirthYear;
	public int legs = 4;
	public boolean active;

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return BirthYear;
	}

	public void setBirthYear(int birthYear) {
		BirthYear = birthYear;
	}

	public Person(String Name, int year) {
		this.name = Name;
		this.BirthYear = year;
	}

}
