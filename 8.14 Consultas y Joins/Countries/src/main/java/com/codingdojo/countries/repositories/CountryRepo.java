package com.codingdojo.countries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.codingdojo.countries.models.Country;

public interface CountryRepo extends CrudRepository<Country, Long>{
	
	// 1. ¿Qué consulta ejecutarías para obtener todos los países que hablan Sloveno? 
	//		Su consulta debe retornar el nombre del país, lenguaje y porcentaje del lenguaje. 
	//		Su consulta debe organizar los resultados por porcentaje en orden descendente.
    @Query(value="SELECT countries.name, languages.language, languages.percentage FROM countries JOIN languages ON countries.id = languages.country_id WHERE language = 'Slovene'", nativeQuery=true)
    List<Object[]> joinAllCountriesSlovene();

    // 2. ¿Qué consulta ejecutarías para mostrar el número total de ciudades de cada país? 
    //		Su consulta debe retornar el nombre del país y el número total de ciudades. 
    //		Su consulta debe organizar los resultados por número de ciudades en orden descendente.
    @Query(value="SELECT countries.name, COUNT(cities.id) AS num_cities FROM countries JOIN cities ON countries.id = cities.country_id GROUP BY countries.id ORDER BY num_cities DESC;", nativeQuery=true)
    List<Object[]> findAllCountriesTotalCities();

    // 5. ¿Qué consulta ejecutarías para obtener todos los países con un superficie de área inferior a 501 
    //		y una población mayor a 100.000?
    @Query(value="SELECT name, surface_area, population FROM countries WHERE countries.surface_area<501 AND countries.population>100000;", nativeQuery=true)
    List<Object[]> findCountriesBySize();

    // 6. ¿Qué consulta ejecutarías para obtener todos los países que tienen solo Constitutional Monarchy (Monarquía) 
    //		y una superficie de área mayor a 200 
    //		y una expectativa de vida superior a los 75 años?
    @Query(value="SELECT name FROM countries WHERE government_form = 'Constitutional Monarchy' AND surface_area > 200 AND life_expectancy > 75;", nativeQuery=true)
    List<Object[]> findCountriesConstMonarchySA200LE75();
    
    // 8. ¿Qué consulta ejecutarías para sumar el número de países en cada región? 
    //		La consulta debe mostrar el nombre de la región y el número de países. 
    //		Además, la consulta debe organizar los resultados por el número de países en orden descendente.
    @Query(value="SELECT countries.region, COUNT(countries.id) AS num_countries FROM countries GROUP BY countries.region ORDER BY num_countries DESC;", nativeQuery=true)
    List<Object[]> findCountriesRegions();
}
