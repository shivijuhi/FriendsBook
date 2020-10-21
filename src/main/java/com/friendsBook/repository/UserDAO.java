package com.friendsBook.repository;

import java.security.GeneralSecurityException;
import java.util.List;

import com.friendsBook.domain.User;

public interface UserDAO {
	
	public User findById(int id);
	public List<User> findAll();
	public void deleteById(int id);
	public void addUserProfile(User user);
	public void addUserToFriendList(int userId, int friendId) throws GeneralSecurityException;
	public List<User> viewAllFriendsForUser(int id);

}
