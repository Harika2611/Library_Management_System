package com.capgemini.lms.entities;

import java.util.Date;
import java.util.List;

public class BooksReturned {
	private int id;
	private Users users;
	private List<Books> books;
	private Date returnedDate;
	private int delayed_Days;
	private double penalty;
	private String penalty_Status;
	
}
