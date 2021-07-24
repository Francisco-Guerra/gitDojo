package com.codingdojo.languages.controllers;

//
//import java.util.List;
//
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.codingdojo.mvc.models.Languages;
//import com.codingdojo.mvc.services.LanguagesService;
//
//@RestController
//public class LanguagesApi {
//
//	private final LanguagesService languagesService;
//
//	public LanguagesApi(LanguagesService bookservice) {
//		this.languagesService = bookservice;
//	}
//	
//    @RequestMapping("/api/books")
//    public List<Languages> index() {
//        return languagesService.allBooks();
//    }
//    
//    @RequestMapping(value="/api/books", method=RequestMethod.POST)
//    public Languages create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
//        Languages languages = new Languages(title, desc, lang, numOfPages);
//        return languagesService.createBook(languages);
//    }
//    
//    @RequestMapping("/api/books/{id}")
//    public Languages show(@PathVariable("id") Long id) {
//        Languages languages = languagesService.findBook(id);
//        return languages;
//    }
//    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
//    public Languages update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
//        Languages languages = languagesService.updateBook(id, title, desc, lang, numOfPages);
//        return languages;
//    }	
//    
//    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
//    public void destroy(@PathVariable("id") Long id) {
//        languagesService.deleteBook(id);
//    }
//	
//}
