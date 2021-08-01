package com.codingdojo.events.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.events.models.Message;
import com.codingdojo.events.repositories.MessageRepo;

@Service
public class MessageServ {
	private MessageRepo mRepo;
    public MessageServ(MessageRepo mRepo) {
        this.mRepo = mRepo;
    }

    public void create(Message message) {
        mRepo.save(message);
    }
    public Optional<Message> findById(Long id) {
        return mRepo.findById(id);
    }
    public List<Message> allMessages() {
    	return (List<Message>) mRepo.findAll();
    }
    public void delete(Long id) {
        mRepo.deleteById(id);
    }
    public void update(Message message) {
    	mRepo.save(message);
    }
}
