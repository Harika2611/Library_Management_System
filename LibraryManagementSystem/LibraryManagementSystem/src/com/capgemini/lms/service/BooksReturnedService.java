package com.capgemini.lms.service;

import java.util.List;

import com.capgemini.lms.entities.BooksReturned;

public interface BooksReturnedService {
	public int returnBooks(BooksReturned returned);
	public int updateReturnedBookDetails(BooksReturned booksReturned);
	public List<BooksReturned> viewReturnedBooksList();
	public List<BooksReturned> viewDelayedBooksList();
}
