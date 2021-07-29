package com.codingdojo.countries.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.countries.repositories.CityRepo;
import com.codingdojo.countries.repositories.CountryRepo;
import com.codingdojo.countries.repositories.LanguageRepo;

@Service
public class ApiService {
	private CountryRepo countryRepo;
	private LanguageRepo languageRepo;
	private CityRepo cityRepo;
	
	public ApiService(CountryRepo countryRepo, CityRepo cityRepo, LanguageRepo languageRepo) {
		this.countryRepo = countryRepo;
		this.cityRepo = cityRepo;
		this.languageRepo = languageRepo;
	}
	
	public List<Object[]> slovene() {
        List<Object[]> table = countryRepo.joinAllCountriesSlovene();
        return table;
    }
	
	public List<Object[]> totalcities() {
        List<Object[]> table = countryRepo.findAllCountriesTotalCities();
        return table;
    }
	
    public List<Object[]> mexico() {
        List<Object[]> table = cityRepo.findCitiesMexicoPopulation500k();
        return table;
    }
    
    public List<Object[]> mainlang() {
        List<Object[]> table = languageRepo.findAllLangsSpokenOver89();
        return table;
    }
    
    public List<Object[]> surfacepop() {
        List<Object[]> table = countryRepo.findCountriesBySize();
        return table;
    }
    
    public List<Object[]> firstworldmonarchy() {
        List<Object[]> table = countryRepo.findCountriesConstMonarchySA200LE75();
        return table;
    }
    
    public List<Object[]> argentina() {
        List<Object[]> table = cityRepo.findCitiesArgentinaPop500k();
        return table;
    }
    
    public List<Object[]> regions() {
        List<Object[]> table = countryRepo.findCountriesRegions();
        return table;
    }
}
