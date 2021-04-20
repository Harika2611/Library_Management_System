package com.capgemini.lms.service;

import java.util.List;

import com.capgemini.lms.entities.Publishers;

public interface PublisherService {
	public int addPublisher(Publishers publisher);
	public int updatePublisherDetails(Publishers publisher);
	public int removePublisher(int publisherId);
	public List<Publishers> viewPublishersList();
	public Publishers viewPublisherById(int id);
}
