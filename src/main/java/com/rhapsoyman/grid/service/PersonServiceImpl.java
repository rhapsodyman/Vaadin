package com.rhapsoyman.grid.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import com.rhapsoyman.grid.Person;

public class PersonServiceImpl implements PersonService {

	public static List<Person> people = new ArrayList<>();


	static {

		people.add(new Person("Nicolaus Copernicus1", 1543));
		people.add(new Person("Galileo Galilei1", 1564));
		people.add(new Person("Johannes Kepler1", 1571));

		people.add(new Person("Nicolaus Copernicus2", 1543));
		people.add(new Person("Galileo Galilei2", 1564));
		people.add(new Person("Johannes Kepler2", 1571));

		people.add(new Person("Nicolaus Copernicus3", 1543));
		people.add(new Person("Galileo Galilei3", 1564));
		people.add(new Person("Johannes Kepler3", 1571));

		people.add(new Person("Nicolaus Copernicus4", 1543));
		people.add(new Person("Galileo Galilei4", 1564));
		people.add(new Person("Johannes Kepler4", 1571));

		people.add(new Person("Nicolaus Copernicus5", 1543));
		people.add(new Person("Galileo Galilei5", 1564));
		people.add(new Person("Johannes Kepler5", 1571));

		people.add(new Person("Nicolaus Copernicus6", 1543));
		people.add(new Person("Galileo Galilei6", 1564));
		people.add(new Person("Johannes Kepler6", 1571));

		people.add(new Person("Nicolaus Copernicus7", 1543));
		people.add(new Person("Galileo Galilei7", 1564));
		people.add(new Person("Johannes Kepler7", 1571));

		people.add(new Person("Nicolaus Copernicus8", 1543));
		people.add(new Person("Galileo Galilei8", 1564));
		people.add(new Person("Johannes Kepler8", 1571));

		people.add(new Person("Nicolaus Copernicus9", 1543));
		people.add(new Person("Galileo Galilei9", 1564));
		people.add(new Person("Johannes Kepler9", 1571));

		people.add(new Person("Nicolaus Copernicus10", 1543));
		people.add(new Person("Galileo Galilei10", 1564));
		people.add(new Person("Johannes Kepler10", 1571));

		people.add(new Person("Nicolaus Copernicus11", 1543));
		people.add(new Person("Galileo Galilei11", 1564));
		people.add(new Person("Johannes Kepler11", 1571));

		people.add(new Person("Nicolaus Copernicus12", 1543));
		people.add(new Person("Galileo Galilei12", 1564));
		people.add(new Person("Johannes Kepler12", 1571));

		people.add(new Person("Nicolaus Copernicus13", 1543));
		people.add(new Person("Galileo Galilei13", 1564));
		people.add(new Person("Johannes Kepler13", 1571));

		people.add(new Person("Nicolaus Copernicus14", 1543));
		people.add(new Person("Galileo Galilei14", 1564));
		people.add(new Person("Johannes Kepler14", 1571));

		people.add(new Person("Nicolaus Copernicus15", 1543));
		people.add(new Person("Galileo Galilei15", 1564));
		people.add(new Person("Johannes Kepler15", 1571));

		people.add(new Person("Nicolaus Copernicus16", 1543));
		people.add(new Person("Galileo Galilei16", 1564));
		people.add(new Person("Johannes Kepler16", 1571));

		people.add(new Person("Nicolaus Copernicus17", 1543));
		people.add(new Person("Galileo Galilei17", 1564));
		people.add(new Person("Johannes Kepler17", 1571));

		people.add(new Person("Nicolaus Copernicus18", 1543));
		people.add(new Person("Galileo Galilei18", 1564));
		people.add(new Person("Johannes Kepler18", 1571));

		people.add(new Person("Nicolaus Copernicus19", 1543));
		people.add(new Person("Galileo Galilei19", 1564));
		people.add(new Person("Johannes Kepler19", 1571));

	}


	@Override
	public List<Person> fetchPersons(int offset, int limit, Map<String, Boolean> sortOrder) {
		
		if (sortOrder.size() > 0) {
			
			if (sortOrder.get("name").equals(false)) {
				Collections.sort(people, new Comparator<Person>() {
					
					@Override
					public int compare(Person o1, Person o2) {
						return o1.getName().compareTo(o2.getName());
					}
				});
				
				Collections.reverse(people);
			}
		}
		
		return people.subList(offset, offset + limit);
	}

	@Override
	public int getPersonCount() {
		return people.size();
	}


}