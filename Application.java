package com.training;

import java.time.LocalDate;
import java.util.Arrays;

import java.util.List;




public class Application {
	public static void main(String args[]) {
		List<Order> orderList = Arrays.asList(new Order(101,LocalDate.of(12,9,2),"Abhishek",802,false),
				new Order(102,LocalDate.of(12,8,1),"Rohit",802,true),
				new Order(101,LocalDate.of(12,12,2),"Tanny",802,false));
		
		OrderService order = new OrderService();
		System.out.println("Pending Orders");
		order.pendingOrders(orderList);
		
		System.out.println("Completed Orders");
		order.completedOrders(orderList);
		
		System.out.println("Order Book");
		order.orderBook(orderList);
		
		System.out.println("Orders Pending More than 3 months");
		order.orderMoreThanThreePending(orderList);
		
		System.out.println("Top 3 Customers");
		order.topThreeCustomers(orderList);
		
		
	}

	
}
