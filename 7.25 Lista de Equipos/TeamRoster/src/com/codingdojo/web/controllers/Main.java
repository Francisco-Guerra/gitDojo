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


public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    //Obtiene a todos los equipos:
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ArrayList<Team> all = Team.getAllteams();
		session.setAttribute("all", all);

		//De acuerdo al Id, puede eliminar al equipo asociado a esa Id en el arreglo:
		if(request.getParameter("id") != null) {
			for(int i = 0; i < all.size(); i++) {
				Team team = all.get(i);
				if(team.getId() == Integer.parseInt(request.getParameter("id"))) {
					all.remove(i);
				}
			}
			response.sendRedirect("/TeamRoster/main");
		}
		// O solo muestra la tabla de equipos:
		else {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/main.jsp");
			view.forward(request,response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}