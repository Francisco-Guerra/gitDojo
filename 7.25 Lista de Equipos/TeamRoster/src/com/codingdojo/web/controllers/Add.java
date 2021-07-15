package com.codingdojo.web.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;	

import com.codingdojo.web.models.Team;



public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    //Función para añadir jugadores
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/add.jsp");
		view.forward(request,response);
	}

	//Se ingresa la información del formulario y se envía a los parámetros para obtener la lista de todos los equipos.
	//Se selecciona al equipo para agregar un nuevo jugador y se redirije a la pagina del equipo.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = (String) request.getParameter("fname");
		String lname = (String) request.getParameter("lname");
		Integer age = Integer.parseInt(request.getParameter("age"));
		ArrayList<Team> all = Team.getAllteams();
		for(int i = 0; i < all.size(); i++) {
			Team team = all.get(i);
			if(team.getId() == Integer.parseInt(request.getParameter("id"))) {
				Team addteam = all.get(i);
				addteam.addPlayer(fname, lname, age);
			}
		}
		response.sendRedirect("/TeamRoster/teams?id=" + request.getParameter("id"));
	}
}