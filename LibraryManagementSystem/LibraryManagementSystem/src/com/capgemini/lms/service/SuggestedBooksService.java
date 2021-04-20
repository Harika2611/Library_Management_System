package com.capgemini.lms.service;

import java.util.List;

import com.capgemini.lms.entities.Books;
import com.capgemini.lms.entities.SuggestedBooks;

public interface SuggestedBooksService {
	public int suggestBooks(List<Books> bookList); 
	public int updateSuggestedBookStatus(SuggestedBooks book);
	public int deleteSuggestedBooks(int id);
	public SuggestedBooks viewSuggestedBookDetails(int id);
	public List<SuggestedBooks> viewSuggestedBooksList();
}
