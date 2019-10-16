package com.tetrasoft.us.dto;

import java.time.LocalDate;

public class PaymentDto {
	
	private Long cardNo;
	private String cardHolderName;
	private LocalDate expirayDate;
	private Integer cvv;
	
	
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
