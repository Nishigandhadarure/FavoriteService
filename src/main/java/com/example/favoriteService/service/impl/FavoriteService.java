package com.example.favoriteService.service.impl;

import java.util.List;

import com.example.favoriteService.entity.Favorite;



public interface FavoriteService {
	public Favorite saveFavourite(Favorite f);
	
	public Favorite deleteFromFavourite(String username);
	public Favorite getFavouriteNewsByUsername( String username);
	
}
