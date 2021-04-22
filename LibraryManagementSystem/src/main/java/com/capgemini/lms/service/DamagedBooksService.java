package com.capgemini.lms.service;

import java.util.List;

import com.capgemini.lms.entities.Books;
import com.capgemini.lms.entities.DamagedBooks;

public interface DamagedBooksService {
	public int addDamagedBooks(DamagedBooks damagedBooks);
	public DamagedBooks updateDamagedBookDetails(DamagedBooks books);
	public List<DamagedBooks> viewDamagedBooksList();
	public List<DamagedBooks> viewDamagedBookById(int id);
}
