package com.friendsBook.repository;

import com.friendsBook.domain.User;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface FriendsBookRepository extends CrudRepository<User, Integer>{

	public User findById(int id);
	public List<User> findAll();
}
