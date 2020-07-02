package my.com.kl.astro.service;

import java.util.List;

import my.com.kl.astro.model.FeedbackDetails;


public interface FeedbackService {

	
		public List<FeedbackDetails> findAllFeeds();
		
		public FeedbackDetails feedByName(String name);
		
		public void saveFeed(FeedbackDetails feedbackDetails);
		
		
}
