package com.codingdojo.events.services;

import java.util.List;
import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.codingdojo.events.models.User;
import com.codingdojo.events.repositories.UserRepo;

@Service
public class UserServ {
	 private UserRepo uRepo;
	    private BCryptPasswordEncoder bCryptPasswordEncoder;
	    public UserServ(UserRepo uRepo, BCryptPasswordEncoder bCryptPasswordEncoder) {
	        this.uRepo = uRepo;
	        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	    }

	    public void save(User user) {
	        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
	        uRepo.save(user);
	    }

	    public User findByEmail(String email) {
	        return uRepo.findByEmail(email);
	    }
	    public Optional<User> findById(Long id) {
	        return uRepo.findById(id);
	    }
	    public List<User> allUsers() {
	    	return (List<User>) uRepo.findAll();
	    }
	    public void update(User user) {
	        uRepo.save(user);
	    }
}
