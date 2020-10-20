package com.friendsBook.repository;

import com.friendsBook.domain.User;

import org.springframework.data.repository.CrudRepository;

public interface FriendsBookRepository extends CrudRepository<User, Integer>{

	public User findById(int id);
}
