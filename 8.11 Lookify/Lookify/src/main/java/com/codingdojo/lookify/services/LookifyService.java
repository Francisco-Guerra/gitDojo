package com.codingdojo.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.lookify.models.Lookify;
import com.codingdojo.lookify.repositories.LookifyRepository;

@Service
public class LookifyService {
	//Agregando al repositorio como una dependencia
	private final LookifyRepository lookifyRepository;
	
	public LookifyService(LookifyRepository lookifyRepository) {
		this.lookifyRepository = lookifyRepository;
	}
	
    // Devolviendo todo.
    public List<Lookify> allSongs() {
        return lookifyRepository.findAll();
    }
    
    // Creando.
    public Lookify addSong(Lookify song) {
        return lookifyRepository.save(song);
    }
    
    // Obteniendo la información
    public Lookify findSong(Long id) {
        Optional<Lookify> optionalLookify = lookifyRepository.findById(id);
        if(optionalLookify.isPresent()) {
            return optionalLookify.get();
        } else {
            return null;
        }
    }
        
    // Eliminando
    public void deleteSong(Long id) {
    	lookifyRepository.deleteById(id);
    }
    
    //Actualizando
    public void updateSong(Lookify song) {
    	lookifyRepository.save(song);
	}
	
    //Top 10
	public List<Lookify> topTen(){
		return lookifyRepository.findTop10ByOrderByRatingDesc();
	}
	
	//Busqueda
	public List<Lookify> searchBy(String search){
		return lookifyRepository.findByArtistContainsAllIgnoreCase(search);
	}    
	
}
