package com.codingdojo.languages.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.languages.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{

	//Este método recupera todos los libros de la base de datos
	List<Language> findAll();
	//Este método encuentra un libro por su descripción
	List<Language> findByDescriptionContaining(String search);
	//Este método cuenta cuántos libros contiene cierta cadena en el título
	Long countByTitleContaining(String search);
	//Este método borra un libro que empieza con un título específico
	Long deleteByTitleStartingWith(String search);
	Optional<Language> findById(Long id);
	void deleteById(Long id);
	
}
