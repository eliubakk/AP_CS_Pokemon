package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Acid extends Move
{
	public Acid()
	{
		super("Acid", PokemonGame.Poison, 1, 30, 40, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage) //10% chance of lowering the target's Defense by one stage
	{
		int chance = genrand(1, 100);
		if(chance <= 10)
		{
			if(Defender.lowerDefenseMultiplier())
				System.out.println(Defender.pokemon.name + "'s defense was lowered.");
			else 
				System.out.println(Defender.pokemon.name + "'s defense can't be lowered anymore.");
		}
	}
}
