package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Psychic extends Move
{
	public Psychic()
	{
		super("Psychic", PokemonGame.Psychic, 1, 10, 90, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//10% chance of lowering the target's special defense
		int chance = genrand(1, 100);
		if(chance <= 10)
		{
			if(Defender.lowerSpecialDefenseMultiplier())
				System.out.println(Defender.pokemon.name + "'s special defense was lowered.");
			else 
				System.out.println(Defender.pokemon.name + "'s special defense can't be lowered anymore.");
		}
	}
}
