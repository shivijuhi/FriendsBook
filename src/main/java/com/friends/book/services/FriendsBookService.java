package com.friends.book.services;

import java.util.List;

import com.friends.book.domain.FriendDto;
import com.friends.book.domain.User;

public interface FriendsBookService {

	public User findById(int id);

	public List<User> getAllUsers();

	public void addUserProfile(User user);

	public void addUserToFriendList(FriendDto friendDto);

	public List<User> viewAllFriendsForUser(int id);

	public void removeAnotherUserFromFriendList(FriendDto friendDto);

}
