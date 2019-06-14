package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Flash extends Move
{
	public Flash()
	{
		super("Flash", PokemonGame.Normal, 2, 20, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Decreases the targets accuracy
		if(Defender.lowerAccuracyMultiplier())
			System.out.println(Defender.getPoke().name + "'s accuracy was lowered!");
		else
			System.out.println(Defender.getPoke().name + "'s accuracy won't go any lower!");
	}
}
