package com.example.favoriteService.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.favoriteService.entity.Favorite;
import com.example.favoriteService.repository.FavoriteRepo;

@Service
public class FavoriteServiceImp implements FavoriteService {
	private static Logger logger=LoggerFactory.getLogger(FavoriteServiceImp.class);
	@Autowired
	private FavoriteRepo fr;
	
	@Override
	public Favorite saveFavourite(Favorite f) {
		return fr.save(f);
		
		
	}
	
	
	
	@Override
	public Favorite getFavouriteNewsByUsername( String username) {
		
		return fr.findByUsername( username);
		
		
	}



	@Override
	public Favorite deleteFromFavourite(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	



}
