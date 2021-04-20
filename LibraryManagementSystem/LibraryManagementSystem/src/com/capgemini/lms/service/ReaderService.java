package com.capgemini.lms.service;

import java.util.List;

import com.capgemini.lms.entities.Reader;

public interface ReaderService {
	public int register(Reader reader);
	public int updateReaderDetails(Reader reader);
	public int deleteReader(int id) ;
	public List<Reader> viewReadersList();
	public Reader viewReaderById(int id);
	public Reader loginValidate(String readerId,String password);
}
