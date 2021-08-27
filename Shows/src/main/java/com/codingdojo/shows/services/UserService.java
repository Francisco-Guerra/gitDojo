package com.codingdojo.shows.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.codingdojo.shows.models.User;
import com.codingdojo.shows.repositories.UserRepo;

@Service
public class UserService {
	 private UserRepo uRepo;
	 private BCryptPasswordEncoder bCryptPasswordEncoder;
	 
	 public UserService(UserRepo uRepo, BCryptPasswordEncoder bCryptPasswordEncoder)     {
        this.uRepo= uRepo;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
     }

	 public void saveUser(User user) {
		 user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
	     uRepo.save(user);
	 }   
	    
	 public User findByEmail(String email) {
		 return uRepo.findByEmail(email);
	 }
	    
	 public void updateUser(User user){ 
	     user.setUpdatedAt(new Date());
	     uRepo.save(user);
	 }
	 
	 public List<User> allUser() {
	        return uRepo.findAll();
	 }
	    
	 public User createUser(User user) {
	     return uRepo.save(user);
	 }
	    
	 public User findUserById(Long id) {
		 Optional<User> optionalUser = uRepo.findById(id);
		 if (optionalUser.isPresent()) {
			return optionalUser.get();
		 	} else {
		 		return null;
		}
	 }
	    
	 public void deletebyId(Long id) {
	    	uRepo.deleteById(id);
	    }
	    
	 public void deleteUser(Long id) {
		 Optional<User> optionalUser = uRepo.findById(id);
	        if(optionalUser.isPresent()) {
	        	uRepo.deleteById(id);
	        } else {
	            return;
	     }
	 }
}
