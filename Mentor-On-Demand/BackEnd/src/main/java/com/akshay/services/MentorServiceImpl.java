package com.akshay.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akshay.pojo.Mentor;
import com.akshay.repository.MentorRepository;

@Service
public class MentorServiceImpl implements MentorService {
	
	@Autowired
	private MentorRepository repository;

	@Override
	public Mentor create(Mentor mentor) {
		
		return repository.save(mentor);
	}

	@Override
	public Mentor delete(int id) {
		Mentor mentor = findById(id);
		if(mentor != null) {
			repository.delete(mentor);
		}
		
		return mentor;
	}

	@Override
	public List<Mentor> findAll() {
		
		return repository.findAll();
	}

	@Override
	public Mentor findById(int id) {
		
		return repository.findOne(id);
	}

	@Override
	public Mentor update(Mentor mentor) {
		
		return repository.save(mentor);
	}

	@Override
	public Mentor findMentor(String email, String password) {
		// TODO Auto-generated method stub
		return repository.findMentor(email, password);
	}
	
	@Override
	public String check(String userName) {
		// TODO Auto-generated method stub
		return repository.check(userName);
	}


}
