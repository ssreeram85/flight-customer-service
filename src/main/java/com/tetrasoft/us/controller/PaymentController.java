package com.tetrasoft.us.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tetrasoft.us.dto.PaymentDto;
import com.tetrasoft.us.entity.PaymentEntity;
import com.tetrasoft.us.service.IPaymentService;

@RestController
@RequestMapping("/api/customer")
public class PaymentController {
	
	@Autowired
	private IPaymentService paymentService;
	
	@PostMapping("/payment")
	public PaymentEntity proceedPayment(@RequestBody PaymentDto paymentDto) {
		PaymentEntity paymentEntity = new PaymentEntity(paymentDto.getCardNo(), paymentDto.getCardHolderName(), paymentDto.getExpirayDate(), paymentDto.getCvv());
		return paymentService.save(paymentEntity);
	}
	
	
	

}
