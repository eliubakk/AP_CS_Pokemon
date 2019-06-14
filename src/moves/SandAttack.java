package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class SandAttack extends Move
{
	public SandAttack()
	{
		super("Sand Attack", PokemonGame.Ground, 2, 15, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Lowers opponent's ACCURACY one stage.
		if(Defender.lowerAccuracyMultiplier())
			System.out.println(Defender.getPoke().name + "'s accuracy was lowered!");
		else
			System.out.println(Defender.getPoke().name + "'s accuracy won't go any lower!");
	}
}
