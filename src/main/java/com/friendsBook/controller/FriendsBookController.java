package com.friendsBook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.friendsBook.domain.User;
import com.friendsBook.services.FriendsBookService;

@RestController
public class FriendsBookController {
	
	@Autowired
	FriendsBookService fc;
	
	@RequestMapping(value = "/fetchUserDetailsById/{id}", method = RequestMethod.GET)
	public User fetchUserDataByIdUsingPathVariable(@PathVariable int id)
	{
		return fc.findById(id);	
	}
}
