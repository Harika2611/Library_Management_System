package com.capgemini.lms.dao;

import java.util.List;

import com.capgemini.lms.entities.Reader;
import com.capgemini.lms.exception.ReaderNotFoundException;

public interface ReaderDao {
	public int register(Reader reader);
	public int updateReaderDetails(Reader reader) throws ReaderNotFoundException;
	public int deleteReader(int id) throws ReaderNotFoundException;
	public List<Reader> viewReadersList();
	public Reader viewReaderById(int id) throws ReaderNotFoundException;
	public Reader loginValidate(String readerId,String password)throws ReaderNotFoundException;
}
