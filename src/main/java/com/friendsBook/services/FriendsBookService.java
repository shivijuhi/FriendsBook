package com.friendsBook.services;

import java.security.GeneralSecurityException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.friendsBook.domain.User;

public interface FriendsBookService {
	
	public User findById(int id);
	public List<User> getAllUsers();
	public void addUserProfile(User user);
	public void addUserToFriendList(int userId, int friendId) throws GeneralSecurityException;
	public List<User> viewAllFriendsForUser(int id);
	public void removeAnotherUserFromFriendList(int userId, int friendId);
	
}
