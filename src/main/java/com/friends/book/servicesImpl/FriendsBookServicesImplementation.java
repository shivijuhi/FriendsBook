package com.friends.book.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.friends.book.domain.FriendDto;
import com.friends.book.domain.User;
import com.friends.book.repository.UserDAO;
import com.friends.book.services.FriendsBookService;

@Service
public class FriendsBookServicesImplementation implements FriendsBookService {

	@Autowired
	UserDAO userDao;
	
	@Override
	public User findById(int id) {
		return userDao.findById(id);
	}
	
	@Override
	public List<User> getAllUsers() {
		return userDao.findAll();
	}

	@Override
	public void addUserProfile(User user) {
		userDao.addUserProfile(user);
		
	}

	@Override
	public void addUserToFriendList(FriendDto friendDto) {
		userDao.addUserToFriendList(friendDto.getUserId(), friendDto.getFriendId());
	}

	@Override
	public List<User> viewAllFriendsForUser(int id) {
		return userDao.viewAllFriendsForUser(id);
		
	}

	@Override
	public void removeAnotherUserFromFriendList(FriendDto friendDto) {
		userDao.removeAnotherUserFromFriendList(friendDto.getUserId(), friendDto.getFriendId());
	}

}