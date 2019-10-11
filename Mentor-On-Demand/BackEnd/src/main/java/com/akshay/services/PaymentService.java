package com.akshay.services;

import java.util.List;

import com.akshay.pojo.Payment;

public interface PaymentService {
	
	Payment create(Payment payment);
	
	Payment delete(int id);
	
	List<Payment> findAll();
	
	Payment findById(int id);
	
	Payment update(Payment payment);

}
