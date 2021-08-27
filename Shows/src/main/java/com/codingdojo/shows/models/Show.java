package com.codingdojo.shows.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="shows")
public class Show {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min=1, max=64)
	private String name;
	@Size(min=1, max=20)
	private String network;
	@Size(min=1, max=5)
	private Double avg;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	@PrePersist
	protected void onCreate(){
		this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate(){
		this.updatedAt = new Date();
	}
	@JsonIgnore
    
	//Relation user to shows (m->n)
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
    		name="shows_users",
    		joinColumns = @JoinColumn(name="show_id"),
    		inverseJoinColumns = @JoinColumn(name="user_id"))
    private List<User> users;
    
    //Constructors
    public Show() {
    }    
    
    public Show(String name, String network, Double avg) {
		super();
		this.name = name;
		this.network = network;
		this.avg = avg;
	}
    //Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public Double getAvg() {
		return avg;
	}
	public void setAvg(Double avg) {
		this.avg = avg;
	}
	public Date getCreated_at() {
		return createdAt;
	}
	public void setCreated_at(Date created_at) {
		this.createdAt = created_at;
	}
	public Date getUpdated_at() {
		return updatedAt;
	}
	public void setUpdated_at(Date updated_at) {
		this.updatedAt = updated_at;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
}
	