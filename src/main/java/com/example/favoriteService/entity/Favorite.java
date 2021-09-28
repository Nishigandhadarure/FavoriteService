package com.example.favoriteService.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection  = "favourites")
public class Favorite {
	
	public Favorite(String username, List<Articles> newsList) {
		super();
		this.username = username;
		this.newsList = newsList;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<Articles> getNewsList() {
		return newsList;
	}
	public void setNewsList(List<Articles> newsList) {
		this.newsList = newsList;
	}
	@Id
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String username;
	private List<Articles> newsList;

}
