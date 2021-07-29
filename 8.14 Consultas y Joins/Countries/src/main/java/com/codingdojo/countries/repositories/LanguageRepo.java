package com.codingdojo.countries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.codingdojo.countries.models.Language;

public interface LanguageRepo extends CrudRepository<Language, Long>{
	
	// 4. ¿Qué consulta ejecutarías para obtener todos los lenguajes en cada país con un porcentaje mayor al 89%? 
	//		Su consulta debe organizar los resultados por porcentaje en orden descendente.
    @Query(value="SELECT countries.name, languages.language, languages.percentage FROM languages JOIN countries ON countries.id = languages.country_id WHERE languages.percentage > 89 ORDER BY languages.percentage DESC;", nativeQuery=true)
    List<Object[]> findAllLangsSpokenOver89();
}
