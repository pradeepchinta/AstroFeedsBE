package my.com.kl.astro.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import my.com.kl.astro.tables.AstroFeedback;

public interface FeedbackRepository extends JpaRepository<AstroFeedback, Integer>{
	
	AstroFeedback findByEmail(String email);
	
	List<AstroFeedback> findAllByOrderByFeedLikesAsc();
	
	
	
}
