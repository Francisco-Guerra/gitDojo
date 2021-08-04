package com.codingdojo.waterbnb.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.waterbnb.models.Pool;
import com.codingdojo.waterbnb.models.Review;
import com.codingdojo.waterbnb.models.User;
import com.codingdojo.waterbnb.repositories.PoolRepository;
import com.codingdojo.waterbnb.repositories.ReviewRepository;
import com.codingdojo.waterbnb.repositories.UserRepository;

@Service
public class PoolService {
	private PoolRepository poolRepository;
	private ReviewRepository reviewRepository;
	
    public PoolService(PoolRepository poolRepository, UserRepository userRepository, ReviewRepository reviewRepository)     {
        this.poolRepository = poolRepository;
        this.reviewRepository = reviewRepository;
    }
    
    public void newPool(Pool pool, User user) {
    	pool.setHost(user);
    	this.poolRepository.save(pool);
    }
    
    public void editPool(Pool editedPool, Long id) {
    	Pool oldPool = this.poolRepository.findById(id).get();
    	oldPool.setSize(editedPool.getSize());
    	oldPool.setDescription(editedPool.getDescription());
    	oldPool.setNightlyCost(editedPool.getNightlyCost());
    	this.poolRepository.save(oldPool);
    }
    
    public void addReview(Review review) {
    	 this.reviewRepository.save(review);
    }
    
    public List<Pool> getAllPools() {
    	List<Pool> pools = this.poolRepository.findAll();
    	if(pools == null) {
    		pools = new ArrayList<Pool>();
    	}
    	return pools;
    }
    
    public Pool getById(long id) {
    	return this.poolRepository.findById(id).get();
    }    
}