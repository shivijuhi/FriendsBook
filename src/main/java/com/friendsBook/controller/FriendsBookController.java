package com.friendsBook.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.friendsBook.domain.User;
import com.friendsBook.customException.FriendsBookException;
import com.friendsBook.services.FriendsBookService;

@RestController
public class FriendsBookController {
	
	@Autowired
	FriendsBookService fc;
	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public User fetchUserDataByIdUsingPathVariable(@PathVariable int id)
	{
		return fc.findById(id);	
	}
	
	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
	public List<User> getAllUsers()
	{
		return fc.getAllUsers();
	}
	
	@RequestMapping(value = "/profile", method = RequestMethod.POST)
	public String addUserProfile(@RequestBody User user)
	{
		try {
			fc.addUserProfile(user);
			return FriendsBookException.USER_ADDITION_SUCCESS;
		}catch(Exception e) {
			return FriendsBookException.USER_ADDITION_FALIURE;
		}
	}
	
	@RequestMapping(value = "/friend", method = RequestMethod.POST)
	public String addUserAsFriend(@RequestBody Map<String, Integer> param) {
		try {
			int userId = param.get("number1");
			int friendId = param.get("number2");
			fc.addUserToFriendList(userId,friendId);
			return "User added to friend list successfully";
			
		}catch(Exception e) {
			return "User not added to friend list";
		}
	}
	
	@RequestMapping(value = "/allFriends/{id}", method = RequestMethod.GET)
	public List<User> getAllFriends(@PathVariable int id) {
		
		return fc.viewAllFriendsForUser(id);
	}
	
	@RequestMapping(value = "/removeFriend", method = RequestMethod.DELETE)
	public String removeAnotherUserFromFriendList(@RequestBody Map<String, Integer> param) {
		
		try {
			int userId = param.get("number1");
			int friendId = param.get("number2");
			fc.removeAnotherUserFromFriendList(userId,friendId);
			return "User removed successfully";
		}catch(Exception e) {
			return "User not removed successfully";
		}
	}
}
