package com.tetrasoft.us.controller;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tetrasoft.us.dto.CustomerDto;
import com.tetrasoft.us.entity.CustomerDetailsEntiry;
import com.tetrasoft.us.service.ICustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	
	@Autowired
	private ICustomerService customerService;
	//save customer details
	@PostMapping("/customer")
	public CustomerDetailsEntiry saveCustomerDetails(@RequestBody CustomerDto customerDto) {

		CustomerDetailsEntiry entity = new CustomerDetailsEntiry(customerDto.getFirstName(), customerDto.getLastName(),
				customerDto.getEmail(), customerDto.getMobileNumber(), customerDto.getCity(), customerDto.getState(),
				customerDto.getPincode(), false,getPnrNumber());
		return customerService.save(entity);
	}
	
	@PutMapping("/update/{pnrNumber}")
	public Optional<CustomerDetailsEntiry> updateCustomerStatus(@PathVariable Integer pnrNumber) {
		
		return customerService.findByPnrNumber(pnrNumber);
	
	}
	
	public Integer getPnrNumber() {
		return ThreadLocalRandom.current().nextInt(11, 900000 + 1);
	}
	

}
