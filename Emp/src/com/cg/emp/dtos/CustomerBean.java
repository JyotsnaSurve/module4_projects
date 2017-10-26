package com.cg.emp.dtos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="customer_info")
public class CustomerBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="cust_Id")
	@NotNull(message="This field is mandatory")
	private int custId;
	
	@NotEmpty(message="First Name is required")
	@Size(min=2, message="First Name should have atleast 2 characters")
	private String fname;
	
	@NotEmpty(message="Last Name is required")
	private String lname;
	
	@NotNull(message="This field is mandatory")
	private int salary;
	
	@NotEmpty(message="This field is mandatory")
	private String desig;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	
	public CustomerBean(){
		
	}
	public CustomerBean(int custId, String fname, String lname, int salary,
			String desig) {
		super();
		this.custId = custId;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "CustomerBean [custId=" + custId + ", fname=" + fname
				+ ", lname=" + lname + ", salary=" + salary + ", desig="
				+ desig + "]";
	}
	
	
}
