package com.capgemini.lms.dao;

import java.util.List;

import com.capgemini.lms.entities.BooksReturned;
import com.capgemini.lms.exception.BookNotFoundException;

public interface BooksReturnedDao {
	public int returnBooks(BooksReturned returned);
	public int updateReturnedBookDetails(BooksReturned booksReturned) throws BookNotFoundException;
	public List<BooksReturned> viewReturnedBooksList();
	public List<BooksReturned> viewDelayedBooksList();
}
