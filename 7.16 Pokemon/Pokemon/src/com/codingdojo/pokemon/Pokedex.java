package com.codingdojo.pokemon;

public class Pokedex extends AbstractPokemon {
	protected int myPokemons = 0;
	
	public void listPokemon(){
		myPokemons = Pokemon.count;
	}
	public void attackPokemon(Pokemon pokemon) {
		System.out.println("Ataque <10>");
		pokemon.setHealth(pokemon.health - 10);
	}
}
