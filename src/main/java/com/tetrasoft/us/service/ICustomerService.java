package com.tetrasoft.us.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tetrasoft.us.entity.CustomerDetailsEntiry;

@Repository
public interface ICustomerService extends JpaRepository<CustomerDetailsEntiry, Integer> {
	//this comment
	Optional<CustomerDetailsEntiry> findByPnrNumber(Integer pnrnumber);

}
