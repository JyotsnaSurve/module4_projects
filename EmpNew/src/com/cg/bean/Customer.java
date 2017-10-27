package com.cg.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="cust")
public class Customer {
	@Id
	@NotNull(message="customer ID is required")
	private int cId;

	@NotEmpty(message="user name is required")
	@Size(min=2,message="user name should have atleast 2 characters")
	private String cName;
	
	@NotEmpty(message="mobile is required")
	private String mob;
	
	@NotEmpty(message="email is required")
	private String email;
	
	@NotNull(message="date is required")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date doj;
	
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return doj;
	}
	public void setDob(Date dob) {
		this.doj = dob;
	}
	public Customer(int cId, String cName, String mob, String email, Date doj) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.mob = mob;
		this.email = email;
		this.doj = doj;
	}

	public Customer(){
		
	}
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", mob=" + mob
				+ ", email=" + email + ", doj=" + doj + "]";
	}
	
}
