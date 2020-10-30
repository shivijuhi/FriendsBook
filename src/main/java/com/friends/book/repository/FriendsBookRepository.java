package com.friends.book.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.friends.book.domain.User;

public interface FriendsBookRepository extends CrudRepository<User, Integer>{

	public User findById(int id);
	public List<User> findAll();
}
