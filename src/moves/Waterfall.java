package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Waterfall extends Move
{
	public Waterfall()
	{
		super("Waterfall", PokemonGame.Water, 0, 15, 80, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//20% chance to flinch
		int chance = genrand(1,100);
		if(chance <= 20)
		{
			Defender.setFlinched(true);
		}
	}
}
