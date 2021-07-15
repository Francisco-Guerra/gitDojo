package com.codingdojo.web.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codingdojo.web.models.Team;

public class Teams extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//Se cargan y toman todos los equipos 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ArrayList<Team> all = Team.getAllteams();
		session.setAttribute("all", all);
	
		//Cuando se ingresa un Id del Jugador en el formulario, se obtiene el equipo al cual pertenece el Id del jugador
		//luego se elimina el Id del jugador perteneciente a ese equipo con el método removePlayer().
		//Luego vuelve a la tabla de equipos, con el jugador eliminado del equipo.
		if(request.getParameter("playerid") != null) {
			Team team = all.get(Integer.parseInt(request.getParameter("id")));
			team.removePlayer(Integer.parseInt(request.getParameter("playerid")));
			response.sendRedirect("/TeamRoster/teams?id="+team.getId());
		}
		//O solo muestra la tabla del equipo.
		else {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/team.jsp");
			view.forward(request,response);
		}
	}

	//Creamos un nuevo equipo, de acuerdo a los parámetros ingresados en el formulario.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = (String) request.getParameter("teamname");
		new Team(name);
		response.sendRedirect("/TeamRoster/main");
	}
}