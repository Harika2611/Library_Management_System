package com.capgemini.lms.service;

import java.util.List;

import com.capgemini.lms.entities.Books;
import com.capgemini.lms.entities.BooksOrder;

public interface BooksOrderService {
	public int placeBooksOrder(Books book);
	public int cancelOrder(int orderId);
	public int updateOrder(BooksOrder order);
	public List<BooksOrder> viewOrdersList();
	public BooksOrder viewOrderById(int orderId);
}
