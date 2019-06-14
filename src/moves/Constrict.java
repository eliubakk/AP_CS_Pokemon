package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Constrict extends Move
{
	public Constrict()
	{
		super("Constrict", PokemonGame.Normal, 0, 35, 10, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//10% chance of lowering the target's speed.
		int chance = genrand(1, 100);
		if(chance <= 10)
		{
			if(Defender.lowerSpeedMultiplier())
				System.out.println(Defender.pokemon.name + "'s speed was lowered.");
			else 
				System.out.println(Defender.pokemon.name + "'s speed can't be lowered anymore.");
		}
	}
}
