package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Kinesis extends Move
{
	public Kinesis()
	{
		super("Kinesis", PokemonGame.Psychic, 2, 15, 0, 80, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//decreases the targets accuracy stat by one stage
		if(Defender.lowerAccuracyMultiplier())
			System.out.println(Defender.getPoke().name + "'s accuracy was lowered!");
		else
			System.out.println(Defender.getPoke().name + "'s accuracy won't go any lower!");
	}
}
