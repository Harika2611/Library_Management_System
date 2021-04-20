package com.capgemini.lms.dao;

import java.util.List;

import com.capgemini.lms.entities.Books;
import com.capgemini.lms.exception.BookNotFoundException;

public interface BooksDao {
	public int addBook(Books book);
	public int updateBookDetails(Books book);
	public int removeBook(int bookid) throws BookNotFoundException;
	public List<Books> searchBookByTitle(String keyword) throws BookNotFoundException;
	public List<Books> searchBookBySubject(String keyword) throws BookNotFoundException;
	public List<Books> viewAllBooks();
	
}
