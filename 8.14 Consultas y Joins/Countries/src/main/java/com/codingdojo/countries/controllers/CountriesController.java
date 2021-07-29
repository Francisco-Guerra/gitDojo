package com.codingdojo.countries.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.countries.services.ApiService;

@Controller
public class CountriesController {
	private ApiService apiServ;			
		public CountriesController(ApiService apiServ) {
			this.apiServ = apiServ;
		}
		
		@RequestMapping("/")
		public String index() {
			return "/index.jsp";
		}	
		
		@RequestMapping("/slovene")
	    public String slovene(Model model) {
	        ArrayList<String> columns = new ArrayList<String>();
	        columns.add("Country");
	        columns.add("Language");
	        columns.add("Percentage");
	        model.addAttribute("columns", columns);
	    	model.addAttribute("query", "Slovene");
	    	model.addAttribute("desc", "¿Qué consulta ejecutarías para obtener todos los países que hablan Sloveno? Su consulta debe retornar el nombre del país, lenguaje y porcentaje del lenguaje. Su consulta debe organizar los resultados por porcentaje en orden descendente.");
	        model.addAttribute("table", apiServ.slovene());
	        return "/query.jsp";
	    }
	    @RequestMapping("/total")
	    public String cities(Model model) {
	        ArrayList<String> columns = new ArrayList<String>();
	        columns.add("Country");
	        columns.add("Number Cities");
	        model.addAttribute("columns", columns);
	        model.addAttribute("query", "Número Total de Ciudades de cada País");
	        model.addAttribute("desc", "¿Qué consulta ejecutarías para mostrar el número total de ciudades de cada país? Su consulta debe retornar el nombre del país y el número total de ciudades. Su consulta debe organizar los resultados por número de ciudades en orden descendente.");
	        model.addAttribute("table", apiServ.totalcities());
	        return "/query.jsp";
	    }
	    @RequestMapping("/mexico")
	    public String mexico(Model model) {
	        ArrayList<String> columns = new ArrayList<String>();
	        columns.add("City");
	        columns.add("Population");
	        model.addAttribute("columns", columns);
	        model.addAttribute("query", "Mexico");
	        model.addAttribute("desc", "¿Qué consulta ejecutarías para obtener todas las ciudades en México con una población mayor a 500.000? Su consulta debe organizar los resultados por población en orden descendente.");
	        model.addAttribute("table", apiServ.mexico());
	        return "/query.jsp";
	    }
	    @RequestMapping("/mainlangs")
	    public String mainlangs(Model model) {
	        ArrayList<String> columns = new ArrayList<String>();
	        columns.add("Country");
	        columns.add("Language");
	        columns.add("Percentage");
	        model.addAttribute("columns", columns);
	        model.addAttribute("query", "Lenguajes de cada País sobre el 89%");
	        model.addAttribute("desc", "¿Qué consulta ejecutarías para obtener todos los lenguajes en cada país con un porcentaje mayor al 89%? Su consulta debe organizar los resultados por porcentaje en orden descendente.");
	        model.addAttribute("table", apiServ.mainlang());
	        return "/query.jsp";
	    }
	    @RequestMapping("/surfpop")
	    public String surfpop(Model model) {
	        ArrayList<String> columns = new ArrayList<String>();
	        columns.add("Country");
	        columns.add("Surface Area");
	        columns.add("Population");
	        model.addAttribute("columns", columns);
	        model.addAttribute("query", "Área de Superficie y Población");
	        model.addAttribute("desc", "¿Qué consulta ejecutarías para obtener todos los países con un superficie de área inferior a 501 y una población mayor a 100.000?");
	        model.addAttribute("table", apiServ.surfacepop());
	        return "/query.jsp";
	    }
	    @RequestMapping("/monarch")
	    public String monarch(Model model) {
	        ArrayList<String> columns = new ArrayList<String>();
	        columns.add("Monarchy");
	        model.addAttribute("columns", columns);
	        model.addAttribute("query", "Países con Monarquía");
	        model.addAttribute("desc", "¿Qué consulta ejecutarías para obtener todos los países que tienen solo Constitutional Monarchy (Monarquía) y una superficie de área mayor a 200 y una expectativa de vida superior a los 75 años?");
	        model.addAttribute("table", apiServ.firstworldmonarchy());
	        return "/query.jsp";
	    }
	    @RequestMapping("/argentina")
	    public String argentina(Model model) {
	        ArrayList<String> columns = new ArrayList<String>();
	        columns.add("Country");
	        columns.add("City");
	        columns.add("District");
	        columns.add("Population");
	        model.addAttribute("columns", columns);
	        model.addAttribute("query", "Argentina");
	        model.addAttribute("desc", "¿Qué consulta ejecutarías para obtener todas las ciudades de Argentina dentro del distrito de Buenos Aires y que tengan una población mayor a 500.000? La consulta debe retornar el nombre del país, nombre de la ciudad, distrito y población.");
	        model.addAttribute("table", apiServ.argentina());
	        return "/query.jsp";
	    }
	    @RequestMapping("/regions")
	    public String regions(Model model) {
	        ArrayList<String> columns = new ArrayList<String>();
	        columns.add("Regions");
	        columns.add("Number of Countries");
	        model.addAttribute("columns", columns);
	        model.addAttribute("query", "Países en cada Región");
	        model.addAttribute("desc", "¿Qué consulta ejecutarías para sumar el número de países en cada región? La consulta debe mostrar el nombre de la región y el número de países. Además, la consulta debe organizar los resultados por el número de países en orden descendente.");
	        model.addAttribute("table", apiServ.regions());
	        return "/query.jsp";
	    }
}