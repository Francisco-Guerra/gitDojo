package com.codingdojo.pokemon;

public abstract class PokemonTest extends Pokedex {

		public static void main(String[] args) {
			Pokedex pokedex = new Pokedex();

			Pokemon charmander = pokedex.createPokemon("Squirtle", 100, "water");
			Pokemon pikachu = pokedex.createPokemon("Tentacool", 80, "water/venom");
			
			pokedex.pokemonInfo(charmander);
			pokedex.pokemonInfo(pikachu);
			System.out.println("-----------------------------------------------");
			pokedex.attackPokemon(charmander);
			pokedex.pokemonInfo(charmander);
			pokedex.pokemonInfo(pikachu);
			
			pokedex.listPokemon();
		}

}
