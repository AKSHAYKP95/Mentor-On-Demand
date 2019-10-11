package com.akshay.services;

import java.util.List;

import com.akshay.pojo.Technology;

public interface TechnologyService {
	
Technology create(Technology technology);
	
	Technology delete(int id);
	
	List<Technology> findAll();
	
	Technology findById(int id);
	
	Technology update(Technology technology);
	
}
