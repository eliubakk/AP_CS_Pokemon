package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Smog extends Move
{
	public Smog()
	{
		super("Smog", PokemonGame.Poison, 1, 20, 30, 70, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//40% chance to posion
		if(!Defender.hasCondition())
		{
			int chance = genrand(1, 100);
			if(chance <= 40)
			{
				Defender.setCondition(2);
			}
		}
	}
}
