package com.akshay.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.akshay.pojo.Skill;

public interface SkillRepository extends Repository<Skill, Integer>{
	
	void delete(Skill skill);
	
	List<Skill> findAll();
	
	Skill findOne(int id);
	
	Skill save(Skill skill);

}
