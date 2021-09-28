package com.example.favoriteService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.favoriteService.entity.Favorite;
import com.example.favoriteService.service.impl.FavoriteService;



@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")

public class FavoriteController {
	@Autowired
	private FavoriteService fs;
	
	@GetMapping("/NewsApp/getFavouriteNewsByUsername/{username}")
	public ResponseEntity<?> getNewsByFavouriteByUsername (@PathVariable ("username") String username) 
	{
		
		ResponseEntity<?> rs=null;
		try {
			Favorite b=fs.getFavouriteNewsByUsername(username);
			rs=ResponseEntity.status(HttpStatus.OK).body(b);
		}
		catch(Exception e)
		{
			rs=ResponseEntity.status(HttpStatus.CONFLICT).build();
		}
		return rs;
	}

}
