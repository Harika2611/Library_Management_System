package com.capgemini.lms.entities;

import java.util.Date;
import java.util.List;

public class BooksIssued {
	private int issueId;
	private Users users;
	private List<Books> books;
	private Date issueDate;
	private int quantity;
	private Date dueDate;
}
