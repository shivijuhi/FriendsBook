package com.friendsBook.servicesImpl;

import java.security.GeneralSecurityException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.friendsBook.domain.User;
import com.friendsBook.repository.FriendsBookRepository;
import com.friendsBook.repository.UserDAO;
import com.friendsBook.services.FriendsBookService;

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
	public void addUserToFriendList(int userId, int friendId) throws GeneralSecurityException {
		userDao.addUserToFriendList(userId,friendId);
	}

	@Override
	public List<User> viewAllFriendsForUser(int id) {
		return userDao.viewAllFriendsForUser(id);
		
	}

	@Override
	public void removeAnotherUserFromFriendList(int userId,int friendId) {
		userDao.removeAnotherUserFromFriendList(userId,friendId);
	}

}