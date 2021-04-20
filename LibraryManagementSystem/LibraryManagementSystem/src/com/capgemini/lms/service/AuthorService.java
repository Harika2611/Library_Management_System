package com.capgemini.lms.service;

import java.util.List;

import com.capgemini.lms.entities.Author;

public interface AuthorService {
	public int addAuthorDetails(Author author);
	public int updateAuthorDetails(Author author);
	public int deleteAuthorDetails(int authorId);
	public List<Author> viewAuthorsList();
	public Author viewAuthorById(int id);
}
