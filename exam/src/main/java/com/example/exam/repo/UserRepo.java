package com.example.exam.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exam.model.User;

public interface UserRepo extends JpaRepository<User, Long> {

	List<User> findById(String id);
	ArrayList<User> findAll();

}
