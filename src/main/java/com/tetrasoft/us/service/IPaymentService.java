package com.tetrasoft.us.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tetrasoft.us.entity.PaymentEntity;

public interface IPaymentService extends JpaRepository<PaymentEntity, Integer>{

}
