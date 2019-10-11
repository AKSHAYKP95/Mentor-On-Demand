package com.akshay.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.akshay.pojo.Payment;

public interface PaymentRepository extends Repository<Payment, Integer>{
	
	void delete(Payment payment);
	
	List<Payment> findAll();
	
	Payment findOne(int id);
	
	Payment save(Payment payment);

}
