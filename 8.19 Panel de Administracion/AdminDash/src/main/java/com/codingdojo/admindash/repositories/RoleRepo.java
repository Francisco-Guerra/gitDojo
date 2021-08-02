package com.codingdojo.admindash.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.admindash.models.Role;

@Repository
public interface RoleRepo extends CrudRepository<Role, Long>{
	List<Role> findAll();
	Role findByType(String type);
}
