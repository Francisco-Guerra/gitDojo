package com.codingdojo.countries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.codingdojo.countries.models.City;

public interface CityRepo extends CrudRepository<City, Long>{

	// 3. ¿Qué consulta ejecutarías para obtener todas las ciudades en México con una población mayor a 500.000? 
	//		Su consulta debe organizar los resultados por población en orden descendente. 
    @Query(value="SELECT cities.name, cities.population FROM cities JOIN countries WHERE countries.name = 'Mexico' AND cities.population > 500000;", nativeQuery=true)
    List<Object[]> findCitiesMexicoPopulation500k();

    // 7. ¿Qué consulta ejecutarías para obtener todas las ciudades de Argentina dentro del distrito de Buenos Aires 
    //		y que tengan una población mayor a 500.000? 
    //		La consulta debe retornar el nombre del país, nombre de la ciudad, distrito y población.
    @Query(value="SELECT countries.name AS Country_Name, cities.name AS City_Name, cities.district, cities.population FROM countries JOIN cities ON countries.id = cities.country_id WHERE cities.district = 'Buenos Aires' AND cities.population > 500000;", nativeQuery=true)
    List<Object[]> findCitiesArgentinaPop500k();
}
