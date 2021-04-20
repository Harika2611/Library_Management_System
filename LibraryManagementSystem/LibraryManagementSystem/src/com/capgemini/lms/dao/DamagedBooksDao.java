package com.capgemini.lms.dao;

import java.util.List;

import com.capgemini.lms.entities.Books;
import com.capgemini.lms.entities.DamagedBooks;
import com.capgemini.lms.exception.BookNotFoundException;

public interface DamagedBooksDao {
	public int addDamagedBooks(Books bookid);
	public int updateDamagedBookDetails() throws BookNotFoundException;
	public List<DamagedBooks> viewDamagedBooksList();
	public DamagedBooks viewDamagedBookById(int id) throws BookNotFoundException;
}
