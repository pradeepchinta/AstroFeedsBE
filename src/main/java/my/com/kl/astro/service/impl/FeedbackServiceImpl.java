package my.com.kl.astro.service.impl;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.com.kl.astro.model.FeedbackDetails;
import my.com.kl.astro.repo.FeedbackRepository;
import my.com.kl.astro.service.FeedbackService;
import my.com.kl.astro.tables.AstroFeedback;

@Service
public class FeedbackServiceImpl implements FeedbackService {
	
	SimpleDateFormat SimpleDateFormat = new SimpleDateFormat("dd-MM-YYYY");

	@Autowired
	FeedbackRepository feedbackRepository;

	@Override
	public List<FeedbackDetails> findAllFeeds() {
		
		List<AstroFeedback> list = feedbackRepository.findAllByOrderByFeedLikesAsc();

		List<FeedbackDetails> feedsList = new LinkedList<FeedbackDetails>();

		for (AstroFeedback astroFeedback : list) {

			FeedbackDetails feedbackDetails = new FeedbackDetails();

			feedbackDetails.setDescription(astroFeedback.getDescription());
			feedbackDetails.setLike(astroFeedback.getFeedLikes());
			feedbackDetails.setDisLike(astroFeedback.getFeedDisLikes());
			feedbackDetails.setEmail(astroFeedback.getEmail());
			feedbackDetails.setId(astroFeedback.getId());
			feedbackDetails.setTitle(astroFeedback.getTitle());
			feedbackDetails.setType(astroFeedback.getType());
			feedbackDetails.setDate(astroFeedback.getDate());

			feedsList.add(feedbackDetails);
		}

		return feedsList;
	}

	@Override
	public FeedbackDetails feedByName(String name) {

		AstroFeedback astroFeedback = feedbackRepository.findByEmail(name);

		return convertToModel(astroFeedback);
	}

	@Override
	public void saveFeed(FeedbackDetails feedbackDetails) {

		System.out.println("service impl executed");
		AstroFeedback astroFeedback = convertForPersist(feedbackDetails);
		
		astroFeedback = feedbackRepository.save(astroFeedback);
		System.out.println(astroFeedback.getId());
		
	}
	

	private FeedbackDetails convertToModel(AstroFeedback astroFeedback) {

		FeedbackDetails feedbackDetails = new FeedbackDetails();

		feedbackDetails.setId(astroFeedback.getId());
		// feedbackDetails.setDate(0);
		feedbackDetails.setDescription(astroFeedback.getDescription());
		feedbackDetails.setDisLike(astroFeedback.getFeedDisLikes());
		feedbackDetails.setEmail(astroFeedback.getEmail());
		feedbackDetails.setLike(astroFeedback.getFeedLikes());
		feedbackDetails.setTitle(astroFeedback.getTitle());
		feedbackDetails.setType(astroFeedback.getType());

		return feedbackDetails;

	}

	private AstroFeedback convertForPersist(FeedbackDetails feedbackDetails) {

		AstroFeedback astroFeedback = new AstroFeedback();

		astroFeedback.setId(feedbackDetails.getId());
		// feedbackDetails.setDate(0);
		astroFeedback.setDescription(feedbackDetails.getDescription());
		astroFeedback.setFeedDisLikes(feedbackDetails.getDisLike());
		astroFeedback.setEmail(feedbackDetails.getEmail());
		astroFeedback.setFeedLikes(feedbackDetails.getLike());
		astroFeedback.setTitle(feedbackDetails.getTitle());
		astroFeedback.setType(feedbackDetails.getType());

		return astroFeedback;

	}

}
