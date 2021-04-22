package com.capgemini.lms.ServiceImpl;

import org.springframework.stereotype.Service;

import com.capgemini.lms.dao.DamagedBooksDao;
import com.capgemini.lms.entities.Books;
import com.capgemini.lms.entities.DamagedBooks;
import com.capgemini.lms.service.DamagedBooksService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class DamagedBooksServiceImpl implements DamagedBooksService
{
	@Autowired
	DamagedBooksDao damagedBooksDao;

	@Override
	public int addDamagedBooks(DamagedBooks damagedBooks) {
		
		return damagedBooksDao.addDamagedBooks(damagedBooks);
	}

	@Override
	public DamagedBooks updateDamagedBookDetails(DamagedBooks books) {
		
	  return damagedBooksDao.save(books);
	  
	}

	@Override
	public List<DamagedBooks> viewDamagedBooksList() {
		
		return damagedBooksDao.findAll();
	}

	@Override
	public List<DamagedBooks> viewDamagedBookById(int id) {
		
		return damagedBooksDao.findAllById(null);
	}
	
	
}
