package my.com.kl.astro.tables;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class AstroFeedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String title;
	private String description;
	private String type;
	private String email;
	
	private Long date;
	private Long feedLikes;
	private Long feedDisLikes;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getFeedLikes() {
		return feedLikes;
	}
	public void setFeedLikes(Long feedLikes) {
		this.feedLikes = feedLikes;
	}
	public Long getFeedDisLikes() {
		return feedDisLikes;
	}
	public void setFeedDisLikes(Long feedDisLikes) {
		this.feedDisLikes = feedDisLikes;
	}
	public AstroFeedback(String title, String description, String type, String email, Long date, Long feedLikes,
			Long feedDisLikes) {
		super();
	
		this.title = title;
		this.description = description;
		this.type = type;
		this.email = email;
		this.date = date;
		this.feedLikes = feedLikes;
		this.feedDisLikes = feedDisLikes;
	}
	@Override
	public String toString() {
		return "AstroFeedback [id=" + id + ", title=" + title + ", description=" + description + ", type=" + type
				+ ", email=" + email + ", feedLikes=" + feedLikes + ", feedDisLikes=" + feedDisLikes + "]";
	}
	
	
	public AstroFeedback() {
		
	}
	
	public Long getDate() {
		return date;
	}
	public void setDate(Long date) {
		this.date = date;
	}
	
	
	
}
