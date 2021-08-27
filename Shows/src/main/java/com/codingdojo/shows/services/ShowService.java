	package com.codingdojo.shows.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.shows.models.Show;
import com.codingdojo.shows.repositories.ShowRepo;

@Service
public class ShowService {
	private ShowRepo sRepo;
	
	public ShowService(ShowRepo sRepo) {
		this.sRepo = sRepo;
	}

	public List<Show> getAll(){
		return (List<Show>) sRepo.findAll();
	}
	
	public Show findShowsById(Long id) {
		Optional<Show> optionalSub = sRepo.findById(id);
		if (optionalSub.isPresent()) {
			return optionalSub.get();
		} else {
			return null;
		}
	}
	
	public void createShow(Show show) {
		sRepo.save(show);
	}
	
	public void updateShow(Show show) {
		sRepo.save(show);
	}
	
	public void deleteShow(Long id) {
		sRepo.deleteById(id);
	}
}
