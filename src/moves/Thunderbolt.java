package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Thunderbolt extends Move
{
	public Thunderbolt()
	{
		super("Thunderbolt", PokemonGame.Electric, 1, 15, 95, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//10% chance to paralyze
		if(!Defender.hasCondition())
		{
			int chance = genrand(1, 100);
			if(chance <= 10)
			{
				Defender.setCondition(4);
			}
		}
	}
}
