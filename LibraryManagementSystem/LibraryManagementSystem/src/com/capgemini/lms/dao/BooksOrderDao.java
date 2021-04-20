package com.capgemini.lms.dao;

import java.util.List;

import com.capgemini.lms.entities.Books;
import com.capgemini.lms.entities.BooksOrder;
import com.capgemini.lms.exception.OrderNotFoundException;

public interface BooksOrderDao {
	public int placeBooksOrder(Books book);
	public int cancelOrder(int orderId) throws OrderNotFoundException;
	public int updateOrder(BooksOrder order) throws OrderNotFoundException;
	public List<BooksOrder> viewOrdersList();
	public BooksOrder viewOrderById(int orderId) throws OrderNotFoundException;
}
