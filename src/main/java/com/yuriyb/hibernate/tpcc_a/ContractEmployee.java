package com.yuriyb.hibernate.tpcc_a;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity  
@Table(name="contractemployee_tpcc_a")  
@AttributeOverrides({  
@AttributeOverride(name="id", column=@Column(name="id")),  
@AttributeOverride(name="name", column=@Column(name="name"))})  
public class ContractEmployee extends Employee{  
      
    @Column(name="hourpay")  
    private float hourlyPay;  
    
    @Column(name="contract_duration")  
    private String contractDuration;
    
	public float getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(float hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	public String getContractDuration() {
		return contractDuration;
	}

	public void setContractDuration(String contractDuration) {
		this.contractDuration = contractDuration;
	}
}