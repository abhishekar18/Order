package com.training;

import java.time.*;
import java.util.List;

public class Order {
	private int orderId;
	private LocalDate orderDate;
	private String customerName;
	private double amount;
	private boolean status;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, LocalDate orderDate, String customerName, double amount, boolean status) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.customerName = customerName;
		this.amount = amount;
		this.status = status;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", customerName=" + customerName + ", amount="
				+ amount + ", status=" + status + "]";
	}
	
	
}
