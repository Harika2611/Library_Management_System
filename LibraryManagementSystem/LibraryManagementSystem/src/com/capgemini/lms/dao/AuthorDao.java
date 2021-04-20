package com.capgemini.lms.dao;

import java.util.List;

import com.capgemini.lms.entities.Author;
import com.capgemini.lms.exception.AuthorNotFoundException;

public interface AuthorDao {
	public int addAuthorDetails(Author author);
	public int updateAuthorDetails(Author author) throws AuthorNotFoundException;
	public int deleteAuthorDetails(int authorId) throws AuthorNotFoundException;
	public List<Author> viewAuthorsList();
	public Author viewAuthorById(int id) throws AuthorNotFoundException;
}
