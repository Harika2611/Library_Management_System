package com.capgemini.lms.dao;

import java.util.List;

import com.capgemini.lms.entities.Feedback;
import com.capgemini.lms.exception.FeedbackNotFoundException;
import com.capgemini.lms.exception.UserNotFoundException;

public interface FeedbackDao {
	public int writeFeedback(int userid) throws UserNotFoundException;
	public int updateFeedback(Feedback feedback) throws FeedbackNotFoundException;
	public List<Feedback> viewFeedbackList();
	public Feedback viewFeedBackByUser(int userid)throws UserNotFoundException;
}
