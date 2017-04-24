package com.rhapsoyman.grid.service;

import java.util.List;
import java.util.Map;

import com.rhapsoyman.grid.Person;

public interface PersonService {
	  int getPersonCount();
	  List<Person> fetchPersons(int offset, int limit, Map<String, Boolean> sortOrder);
	}