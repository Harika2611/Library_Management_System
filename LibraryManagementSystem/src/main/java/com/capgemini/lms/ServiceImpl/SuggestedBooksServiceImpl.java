package com.capgemini.lms.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.lms.dao.SuggestedBooksDao;
import com.capgemini.lms.entities.Books;
import com.capgemini.lms.entities.SuggestedBooks;
import com.capgemini.lms.service.SuggestedBooksService;

@Service
public class SuggestedBooksServiceImpl implements SuggestedBooksService
{
	@Autowired
	SuggestedBooksDao suggestedBooksDao;

	@Override
	public int suggestBooks(List<Books> bookList) 
	{
	   return 0;
	}

	@Override
	public SuggestedBooks updateSuggestedBookStatus(SuggestedBooks book) 
	{
		return suggestedBooksDao.save(book);
	}

	@Override
	public void deleteSuggestedBooks(int id)
	{
        suggestedBooksDao.deleteAll();
	}

	@Override
	public List<SuggestedBooks> viewSuggestedBookDetails(int id) 
	{
		return suggestedBooksDao.findAllById(null);
	}

	@Override
	public List<SuggestedBooks> viewSuggestedBooksList() 
	{

		return suggestedBooksDao.findAll();
	}
	

}
