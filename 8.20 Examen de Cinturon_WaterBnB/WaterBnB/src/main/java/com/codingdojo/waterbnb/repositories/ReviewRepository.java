package com.codingdojo.waterbnb.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.waterbnb.models.Review;

public interface ReviewRepository extends CrudRepository<Review, Long> {

}