package com.example.exam.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exam.model.User;
import com.example.exam.repo.UserRepo;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	UserRepo userRepo;

	 @PostMapping("/save")
	  public ResponseEntity<User> createTutorial(@RequestBody User user) {
	    try {
	    
	      String mail = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
	      Pattern pattern = Pattern.compile(mail);  
	      Matcher matcher = pattern.matcher(user.getEmail());
	      
	      String phone = "^\\+(?:[0-9] ?){6,14}[0-9]$";
	      Pattern pattern2 = Pattern.compile(phone);  
	      Matcher matcher2 = pattern2.matcher(user.getEmail());
	      
	      
	      if(matcher.matches() && matcher2.matches()) {
	    	  User _user = userRepo
	    	          .save(new User(user.getId(), user.getName(), user.getEmail(), user.getMobile(), user.getBday(), user.getAge(), user.getGender()));
	    	  return new ResponseEntity<>(_user, HttpStatus.OK);
	      } else {
	    	  return new ResponseEntity<>(user, HttpStatus.INTERNAL_SERVER_ERROR);
	      }
	      
	      
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	 
}
