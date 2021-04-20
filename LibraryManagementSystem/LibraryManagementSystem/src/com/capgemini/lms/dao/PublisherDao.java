package com.capgemini.lms.dao;

import java.util.List;

import com.capgemini.lms.entities.Publishers;
import com.capgemini.lms.exception.PublisherNotFoundException;

public interface PublisherDao {
	public int addPublisher(Publishers publisher);
	public int updatePublisherDetails(Publishers publisher) throws PublisherNotFoundException;
	public int removePublisher(int publisherId) throws PublisherNotFoundException;
	public List<Publishers> viewPublishersList();
	public Publishers viewPublisherById(int id) throws PublisherNotFoundException;
}
