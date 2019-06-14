package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class StringShot extends Move
{
	public StringShot()
	{
		super("String Shot", PokemonGame.Bug, 2, 40, 0, 95, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Decreases the target's speed by one level.  in gen six speed is lowered by two stages
		if(Defender.lowerSpeedMultiplier())
			System.out.println(Defender.pokemon.name + "'s speed was lowered.");
		else 
			System.out.println(Defender.pokemon.name + "'s speed can't be lowered anymore.");
	}
}
