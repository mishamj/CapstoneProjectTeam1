package com.incedo.smartinventory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name="orders")

public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)  
  @Column(name="order_id")
  private Long orderid;  


  @JsonFormat(pattern="yyyy-MM-dd",shape=Shape.STRING)
  @Column(name = "date")
  private String Date;
  
  @Column(name = "bill_No")
  private long billNo;
  
  @Column(name = "customer_id")
  private long customerId;
  
  @Column(name = "quantity")
  private long quantity;
  
  @Column(name = "unit_price")
  private double unitPrice;

  @Column(name = "discount")
  private double discount;

  @Column(name = "total")
  private double total =(quantity*unitPrice)-discount*(unitPrice*quantity/100);


  
 public Long getOrderid() {
	return orderid;
 }

public void setOrderid(Long orderid) {
	this.orderid = orderid;
}

public String getDate() {
	return Date;
}

public void setDate(String date) {
	Date = date;
}

public long getBillNo() {
	return billNo;
}

public void setBillNo(long billNo) {
	this.billNo = billNo;
}

public long getCustomerId() {
	return customerId;
}

public void setCustomerId(long customerId) {
	this.customerId = customerId;
}

public long getQuantity() {
	return quantity;
}

public void setQuantity(long quantity) {
	this.quantity = quantity;
}

public double getUnitPrice() {
	return unitPrice;
}

public void setUnitPrice(double unitPrice) {
	this.unitPrice = unitPrice;
}

public double getDiscount() {
	return discount;
}

public void setDiscount(double discount) {
	this.discount = discount;
}

public double getTotal() {
	return total;
}

public void setTotal(double total) {
	this.total = total;
}

}