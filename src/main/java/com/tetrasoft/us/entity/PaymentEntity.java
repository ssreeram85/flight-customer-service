package com.tetrasoft.us.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PAYMENT")
public class PaymentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Long cardNo;
	private String cardHolderName;
	@Column(name = "expire_date",columnDefinition = "DATE")
	private LocalDate expirayDate;
	private Integer cvv;
	
	
	
	public PaymentEntity(Long cardNo, String cardHolderName, LocalDate expirayDate, Integer cvv) {
		this.cardNo = cardNo;
		this.cardHolderName = cardHolderName;
		this.expirayDate = expirayDate;
		this.cvv = cvv;
	}

	public PaymentEntity() {

	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getCardNo() {
		return cardNo;
	}
	public void setCardNo(Long cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public LocalDate getExpirayDate() {
		return expirayDate;
	}
	public void setExpirayDate(LocalDate expirayDate) {
		this.expirayDate = expirayDate;
	}
	public Integer getCvv() {
		return cvv;
	}
	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}
	
	
	
	

}
