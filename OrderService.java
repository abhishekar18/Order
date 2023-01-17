package com.training;

import static java.util.stream.Collectors.toMap;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class OrderService {
	public void pendingOrders(List<Order> orderList){
		orderList.stream().filter(e->e.getStatus()==false).forEach(System.out::println);
	}
	public void completedOrders(List<Order> orderList) {
		orderList.stream().filter(e->e.getStatus()==true).forEach(System.out::println);
	}
	public void orderBook(List<Order> orderList) {
		orderList.stream().collect(toMap(Order::getCustomerName,Order::getAmount)).forEach((key,value)->System.out.println(key+" "+value));
	}
//	public void orderMoreThanThreePending(List<Order> orderList) {
//		Predicate<LocalDate> date = 
//	}
	public void topThreeCustomers(List<Order> orderList) {
		orderList.stream().sorted(Comparator.comparing(Order::getAmount).reversed()).limit(3).forEach(System.out::println);
	}
}
