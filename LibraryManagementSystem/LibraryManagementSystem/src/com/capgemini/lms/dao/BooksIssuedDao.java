package com.capgemini.lms.dao;

import java.util.List;

import com.capgemini.lms.entities.BooksIssued;
import com.capgemini.lms.exception.BookNotFoundException;

public interface BooksIssuedDao {
	public int addIssuedBook(BooksIssued issued);
	public int updateIssuedBookDetails(BooksIssued booksIssued);
	public int deleteIssuedBookS(int bookid) throws BookNotFoundException;
	public List<BooksIssued> viewBooksIssuedList();
}
