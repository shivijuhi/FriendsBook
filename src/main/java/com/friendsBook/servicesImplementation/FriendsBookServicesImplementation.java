package com.friendsBook.servicesImplementation;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;

import com.friendsBook.domain.User;
import com.friendsBook.repository.FriendsBookRepository;
import com.friendsBook.services.FriendsBookService;

public class FriendsBookServicesImplementation implements FriendsBookService {

	@Autowired
	FriendsBookRepository repository;
	
	Map<Integer, User> db = new ConcurrentHashMap<>();
	
	@Override
	public User findById(int id) {
		return db.get(id);
	}
}
