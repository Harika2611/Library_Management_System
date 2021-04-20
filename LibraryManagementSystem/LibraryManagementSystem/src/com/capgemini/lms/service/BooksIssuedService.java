package com.capgemini.lms.service;

import java.util.List;

import com.capgemini.lms.entities.BooksIssued;

public interface BooksIssuedService {
	public int addIssuedBook(BooksIssued issued);
	public int updateIssuedBookDetails(BooksIssued booksIssued);
	public int deleteIssuedBookS(int bookid);
	public List<BooksIssued> viewBooksIssuedList();
}
