package com.capgemini.lms.service;

import java.util.List;

import com.capgemini.lms.entities.Books;
import com.capgemini.lms.entities.DamagedBooks;

public interface DamagedBooksService {
	public int addDamagedBooks(Books bookid);
	public int updateDamagedBookDetails();
	public List<DamagedBooks> viewDamagedBooksList();
	public DamagedBooks viewDamagedBookById(int id);
}
