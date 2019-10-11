package com.akshay.services;

import java.util.List;

import com.akshay.pojo.Skill;

public interface SkillService {
	
Skill create(Skill skill);
	
	Skill delete(int id);
	
	List<Skill> findAll();
	
	Skill findById(int id);
	
	Skill update(Skill skill);
	
}
