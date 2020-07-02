package my.com.kl.astro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.com.kl.astro.model.FeedbackDetails;
import my.com.kl.astro.service.FeedbackService;

@RestController
@RequestMapping("/astro/feedback")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AstroController {

	@Autowired
	private FeedbackService feedbackService; 
	
	@GetMapping("/all")
	public List<FeedbackDetails> getAll() {
		
		return feedbackService.findAllFeeds();
	}
	
	@PostMapping("/update")
	public void updateFeedBack(@RequestBody FeedbackDetails feedbackDetails) {
		
		feedbackService.saveFeed(feedbackDetails);
	}
	
	@PostMapping("/add")
	public void addFeedBack(@RequestBody FeedbackDetails feedbackDetails) {
		
		feedbackService.saveFeed(feedbackDetails);
	}

	
}
