package com.friends.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.friends.book.constant.StatesConstant;
import com.friends.book.domain.FriendDto;
import com.friends.book.domain.User;
import com.friends.book.services.FriendsBookService;

@RestController
public class FriendsBookController {

	@Autowired
	FriendsBookService fc;

	private static final String SPACE = " ";

	@GetMapping(value = "/user/{id}")
	public User fetchUserDataByIdUsingPathVariable(@PathVariable int id) {
		return fc.findById(id);
	}

	@GetMapping(value = "/users")
	public List<User> getAllUsers() {
		return fc.getAllUsers();
	}

	@PostMapping(value = "/profile")
	public String addUserProfile(@RequestBody User user) {
		try {
			fc.addUserProfile(user);
			return StatesConstant.USER_ADDITION_SUCCESS;
		} catch (Exception e) {
			return StatesConstant.USER_ADDITION_FALIURE + SPACE + e.getMessage();
		}
	}

	@PostMapping(value = "/friend")
	public String addUserAsFriend(@RequestBody FriendDto friendDto) {
		try {
			fc.addUserToFriendList(friendDto);
			return StatesConstant.FRIEND_ADDITION_SUCCESS;
		} catch (Exception e) {
			return StatesConstant.USER_ADDITION_FALIURE + SPACE + e.getMessage();
		}
	}

	@GetMapping(value = "/friends/{id}")
	public List<User> getAllFriends(@PathVariable int id) {
		return fc.viewAllFriendsForUser(id);
	}

	@DeleteMapping(value = "/friend")
	public String removeAnotherUserFromFriendList(FriendDto friendDto) {
		try {
			fc.removeAnotherUserFromFriendList(friendDto);
			return StatesConstant.USER_REMOVED_SUCCESS;
		} catch (Exception e) {
			return StatesConstant.USER_REMOVED_FALIURE + SPACE + e.getMessage();
		}
	}
}
