package my.com.kl.astro;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import my.com.kl.astro.repo.FeedbackRepository;
import my.com.kl.astro.tables.AstroFeedback;

@SpringBootApplication
public class AstroApplication implements CommandLineRunner{
	

	@Autowired
	FeedbackRepository feedbackRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AstroApplication.class, args);
		
		System.out.println("AstroApplication Started");
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Date date = new Date();
		Long dateFormat = date.getTime();
		AstroFeedback astroFeedback = new AstroFeedback("title", "description", "type", "pradeep@email.com",dateFormat,10l,20l);
		AstroFeedback astroFeedback1 = new AstroFeedback("title1", "description1", "type1", "pradeep1@email.com",dateFormat,11l,21l);
		AstroFeedback astroFeedback2 = new AstroFeedback("title2", "description2", "type2", "pradeep2@email.com",dateFormat,12l,22l);
		AstroFeedback astroFeedback3 = new AstroFeedback("title3", "description3", "type3", "pradeep3@email.com",dateFormat,13l,23l);
		AstroFeedback astroFeedback4 = new AstroFeedback("title4", "description4", "type4", "pradeep4@email.com",dateFormat,14l,24l);
		AstroFeedback astroFeedback5 = new AstroFeedback("title5", "description5", "type5", "pradeep5@email.com",dateFormat,15l,25l);
		AstroFeedback astroFeedback6 = new AstroFeedback("title6", "description6", "type6", "pradeep6@email.com",dateFormat,16l,26l);
		AstroFeedback astroFeedback7 = new AstroFeedback("title7", "description7", "type7", "pradeep7@email.com",dateFormat,17l,27l);
		AstroFeedback astroFeedback8 = new AstroFeedback("title8", "description8", "type8", "pradeep8@email.com",dateFormat,18l,28l);

		List<AstroFeedback> astroFeedbacks = new LinkedList<AstroFeedback>();
		
		astroFeedbacks.add(astroFeedback);
		astroFeedbacks.add(astroFeedback1);
		astroFeedbacks.add(astroFeedback2);
		astroFeedbacks.add(astroFeedback3);
		astroFeedbacks.add(astroFeedback4);
		astroFeedbacks.add(astroFeedback5);
		astroFeedbacks.add(astroFeedback6);
		astroFeedbacks.add(astroFeedback7);
		astroFeedbacks.add(astroFeedback8);
		
		feedbackRepository.saveAll(astroFeedbacks);
		
	}

}
