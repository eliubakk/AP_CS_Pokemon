package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Smokescreen extends Move
{
	public Smokescreen()
	{
		super("Smokescreen", PokemonGame.Normal, 2, 20, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Lowers the targets accuracy by one stage.
		if(Defender.lowerAccuracyMultiplier())
			System.out.println(Defender.getPoke().name + "'s accuracy was lowered!");
		else
			System.out.println(Defender.getPoke().name + "'s accuracy won't go any lower!");
	}
}
