package com.friendsBook.services;

import org.springframework.stereotype.Service;

import com.friendsBook.domain.User;

public interface FriendsBookService {
	
	public User findById(int id);
	
}
