//package com.codingdojo.admindash.models;
//
//import java.util.Date;
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.PrePersist;
//import javax.persistence.PreUpdate;
//import javax.persistence.Table;
//import javax.validation.constraints.Size;
//
//import org.springframework.format.annotation.DateTimeFormat;
//
//@Entity
//@Table(name = "events")
//public class Event {
//
//	@Id
//	@GeneratedValue
//	private Long id;
//	@Size(min=1, max=65)
//	private String name;
//	@DateTimeFormat(pattern="dd-MM-yyyy")
//	private Date eventDate;
//	@Size(min=1, max=65)
//	private String city;
//	private String state;
//	@DateTimeFormat(pattern="dd-MM-yyyy")
//	private Date createdAt;
//	@DateTimeFormat(pattern="dd-MM-yyyy")
//	private Date updatedAt;
////Eventos
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="user_id")
//	private User hostess;
//	
//	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinTable(
//			name = "attending",
//			joinColumns = @JoinColumn(name = "event_id"))
//	private List<User> usersAttending;
////Mensajes
//	@OneToMany(mappedBy = "event", fetch = FetchType.LAZY)
//	private List<Message> messages;
////Constructor	
//	public Event() {		
//	}
//	
////Getters and Setters
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public Date getEventDate() {
//		return eventDate;
//	}
//	public void setEventDate(Date eventDate) {
//		this.eventDate = eventDate;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public String getState() {
//		return state;
//	}
//	public void setState(String state) {
//		this.state = state;
//	}
//	public Date getCreatedAt() {
//		return createdAt;
//	}
//	public void setCreatedAt(Date cretedAt) {
//		this.createdAt = cretedAt;
//	}
//	public Date getUpdatedAt() {
//		return updatedAt;
//	}
//	public void setUpdatedAt(Date updatedAt) {
//		this.updatedAt = updatedAt;
//	}
//	public User getHostess() {
//		return hostess;
//	}
//	public void setHostess(User hostess) {
//		this.hostess = hostess;
//	}
//	public List<User> getUsersAttending() {
//		return usersAttending;
//	}
//	public void setUsersAttending(List<User> userAttending) {
//		this.usersAttending = userAttending;
//	}
//	public List<Message> getMessages() {
//		return messages;
//	}
//	public void setMessages(List<Message> messages) {
//		this.messages = messages;
//	}
//	@PrePersist
//	public void onCreate() {
//		this.createdAt = new Date();
//		this.updatedAt = new Date();
//	}
//	@PreUpdate
//	public void setUpdatedAt() {
//		this.updatedAt = new Date();
//	}
//}
