package com.codingdojo.ninjasdojos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.ninjasdojos.models.Dojo;
import com.codingdojo.ninjasdojos.models.Ninja;
import com.codingdojo.ninjasdojos.repositories.DojoRepository;
import com.codingdojo.ninjasdojos.repositories.NinjaRepository;

@Service
public class NinjasDojosService {
	private final NinjaRepository ninjaRepository;
	private final DojoRepository dojoRepository;
	
	public NinjasDojosService(NinjaRepository ninjaRepository, DojoRepository dojoRepository) {
		this.ninjaRepository = ninjaRepository;
		this.dojoRepository = dojoRepository;
	}
	
	public List<Dojo> allDojos(){
		return dojoRepository.findAll();
	}
	
	public Dojo addDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
	
	public Dojo getDojo(Long id) {
		Optional<Dojo> dojo = dojoRepository.findById(id);
		if(dojo.isPresent()) {
			return dojo.get();
		}else {
			return null;
		}
	}
	
	public List<Ninja> allNinjas(){
		return (List<Ninja>) ninjaRepository.findAll();
	}	
	
	public Ninja addNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}	
	
	public Optional<Ninja> getNinja(Long id){
		return ninjaRepository.findById(id);
	}
}
