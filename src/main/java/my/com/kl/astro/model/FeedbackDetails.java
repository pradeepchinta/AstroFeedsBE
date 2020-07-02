package my.com.kl.astro.model;

public class FeedbackDetails {

	private Long id;
	private String title;
	private String description;
	private String type;
	private String email;
	private Long date;
	private Long like;
	private Long disLike;
	
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
	public Long getDate() {
		return date;
	}
	public void setDate(Long date) {
		this.date = date;
	}
	public Long getLike() {
		return like;
	}
	public void setLike(Long like) {
		this.like = like;
	}
	public Long getDisLike() {
		return disLike;
	}
	public void setDisLike(Long disLike) {
		this.disLike = disLike;
	}
	
	public FeedbackDetails() {
		
	}
	
	
}
