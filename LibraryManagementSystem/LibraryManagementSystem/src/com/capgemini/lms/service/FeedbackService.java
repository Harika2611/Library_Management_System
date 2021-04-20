package com.capgemini.lms.service;

import java.util.List;

import com.capgemini.lms.entities.Feedback;

public interface FeedbackService {
	public int writeFeedback(int userid);
	public int updateFeedback(Feedback feedback);
	public List<Feedback> viewFeedbackList();
	public Feedback viewFeedBackByUser(int userid);
}
