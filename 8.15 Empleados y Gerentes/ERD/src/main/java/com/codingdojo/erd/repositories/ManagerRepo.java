package com.codingdojo.erd.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.erd.models.Manager;

public interface ManagerRepo extends CrudRepository<Manager, Long>{

}
