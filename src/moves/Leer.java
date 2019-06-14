package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Leer extends Move
{
	public Leer()
	{
		super("Leer", PokemonGame.Normal, 2, 30, 0, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Decreases targets defense by one stage
		if(Defender.lowerDefenseMultiplier())
			System.out.println(Defender.getPoke().name + "'s defense was lowered!");
		else
			System.out.println(Defender.getPoke().name + "'s defense won't go any lower!");
	}
}
