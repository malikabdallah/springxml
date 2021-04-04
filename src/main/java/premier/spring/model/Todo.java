package premier.spring.model;

import java.util.Date;

public class Todo {
	private int id;
	private String description;
	private String user;
	private Date targetDate;
	private boolean done;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	public Todo(int id, String description, String user, Date targetDate, boolean done) {
		super();
		this.id = id;
		this.description = description;
		this.user = user;
		this.targetDate = targetDate;
		this.done = done;
	}
	
	public Todo() {
		
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", description=" + description + ", user=" + user + ", targetDate=" + targetDate
				+ ", done=" + done + "]";
	}

	
}
