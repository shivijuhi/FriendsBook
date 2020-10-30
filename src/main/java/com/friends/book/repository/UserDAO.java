package com.friends.book.repository;

import java.util.List;

import com.friends.book.domain.User;

public interface UserDAO {
	
	public User findById(int id);
	public List<User> findAll();
	public void addUserProfile(User user);

	public void addUserToFriendList(int userId, int friendId);
	public List<User> viewAllFriendsForUser(int id);
	public void removeAnotherUserFromFriendList(int userId, int friendId);

}
