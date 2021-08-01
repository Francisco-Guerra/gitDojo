package com.codingdojo.events.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.events.models.Event;
import com.codingdojo.events.repositories.EventRepo;

@Service
public class EventServ {
	private EventRepo eRepo;
	
    public EventServ(EventRepo eRepo) {
        this.eRepo = eRepo;
    }

    public void create(Event event) {
        eRepo.save(event);
    }
    public Object findById(Long id) {
        return eRepo.findById(id);
    }
    public List<Event> allEvents() {
    	return (List<Event>) eRepo.findAll();
    }
    public void update(Event event) {
        eRepo.save(event);
    }
    public void delete(Long id) {
        eRepo.deleteById(id);
    }
}
