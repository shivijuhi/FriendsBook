package com.friendsBook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.friendsBook.services.FriendsBookService;

public class FriendsBookController {
	
	@Autowired
	FriendsBookService fc;
	
	@RequestMapping(value = "/findUser", method = RequestMethod.GET)
	public String addUser(@RequestBody int id) throws Exception {
		try {
			fc.findById(id);
			return "User found successfully!!";
		} catch (Exception e) {
			return "Failed to add user";
		}

	}

}
