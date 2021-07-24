package com.codingdojo.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	//Agregando el book al repositorio como una dependencia
	private final LanguageRepository languageRepository;
	
	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
    // Devolviendo todos los libros.
    public List<Language> allLanguages() {
        return languageRepository.findAll();
    }
    
    // Creando un libro.
    public Language addLanguage(Language lang) {
        return languageRepository.save(lang);
    }
    
    // Obteniendo la información de un libro
    public Language findLanguage(Long id) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }
    
    // Editando un libro
    public void updateLanguage(Language lang) {
    	languageRepository.save(lang);
    }
    
    // Eliminando un libro
    public void deleteLanguage(Long id) {
    	languageRepository.deleteById(id);
    }
	
}
