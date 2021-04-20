package com.capgemini.lms.dao;

import java.util.List;

import com.capgemini.lms.entities.Books;
import com.capgemini.lms.entities.SuggestedBooks;
import com.capgemini.lms.exception.BookNotFoundException;

public interface SuggestedBooksDao {
	public int suggestBooks(List<Books> bookList); 
	public int updateSuggestedBookStatus(SuggestedBooks book) throws BookNotFoundException;
	public int deleteSuggestedBooks(int id) throws BookNotFoundException;
	public SuggestedBooks viewSuggestedBookDetails(int id);
	public List<SuggestedBooks> viewSuggestedBooksList();
	
}
