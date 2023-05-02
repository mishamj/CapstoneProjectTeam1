package com.incedo.smartinventory.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="suppliers")
public class Supplier {
	
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  @Column(name = "sup_id")
  private Long supid;
  
  @Column(name = "sup_name")
  private String supName;

  @Column(name = "sup_phone")
  private String phoneNo;

  @Column(name = "sup_email")
  private String emailId;

public Long getSupid() {
	return supid;
}

public void setSupid(Long supid) {
	this.supid = supid;
}

public String getSupName() {
	return supName;
}

public void setSupName(String supName) {
	this.supName = supName;
}

public String getPhoneNo() {
	return phoneNo;
}

public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

 }