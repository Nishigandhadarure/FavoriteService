package com.example.favoriteService.repository;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.favoriteService.entity.Favorite;




@CrossOrigin(origins = "*")
public interface FavoriteRepo extends MongoRepository<Favorite, String>{

	

	
	public Favorite findByUsername(String username);

	
	
	
	
}