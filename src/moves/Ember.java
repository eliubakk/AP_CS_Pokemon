package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Ember extends Move
{
	public Ember()
	{
		super("Ember", PokemonGame.Fire, 1, 25, 40, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//10% chance to burn
		if(!Defender.hasCondition())
		{
			int chance = genrand(1, 100);
			if(chance <= 10)
			{
				Defender.setCondition(5);
			}
		}
	}
}
