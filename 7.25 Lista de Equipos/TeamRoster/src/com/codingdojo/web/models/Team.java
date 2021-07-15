package com.codingdojo.web.models;

	import java.util.ArrayList;

	//Atributos del Equipo
	public class Team {
		private String name;
		private ArrayList<Player> team = new ArrayList<Player>();
		private Integer num;
		private Integer id;
		
		//Atributos especificos para la clase Equipos
		private static ArrayList<Team> allteams = new ArrayList<Team>();
		private static int newid = 0;
		
		//Contructores para los Equipos, agregando un nuevo Id para cada equipo que se crea
		public Team() {
			this.setName("Undefined");
			this.setNum(0);
			allteams.add(this);
			this.setId(newid);
			newid++;
		}
		public Team(String name) {
			this.setName(name);
			this.setNum(0);
			allteams.add(this);
			this.setId(newid);
			newid++;
		}
		
		//Getters and Setters de los atributos del equipo
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public ArrayList<Player> getTeam() {
			return team;
		}
		public Integer getNum() {
			return num;
		}
		public void setNum(Integer num) {
			this.num = num;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		
		//Método para agregar un nuevo jugador al equipo
		public void addPlayer(String firstname, String lastname, Integer age) {
			Player player = new Player(firstname, lastname, age);
			this.team.add(player);
			this.setNum(this.getNum()+1);
		}
		
		//Método para eliminar jugadores del equipo de acurdo a su Id
		public void removePlayer(Integer id) {
			for(int i = 0; i < this.team.size(); i++) {
				Player p = this.team.get(i);
				if(p.getId() == id) {
					this.team.remove(i);
					this.setNum(this.getNum()-1);
				}
			}
		}
		
		//Método para mostrar a todos los equipos
		public static ArrayList<Team> getAllteams() {
			return allteams;
		}
	}