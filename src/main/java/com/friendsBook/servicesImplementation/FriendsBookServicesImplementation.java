package com.friendsBook.servicesImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.friendsBook.domain.User;
import com.friendsBook.repository.FriendsBookRepository;
import com.friendsBook.services.FriendsBookService;

@Service
public class FriendsBookServicesImplementation implements FriendsBookService {

	@Autowired
	FriendsBookRepository repository;
	
	@Override
	public User findById(int id) {
		return repository.findById(id);
	}

}