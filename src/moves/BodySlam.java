package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class BodySlam extends Move
{
	public BodySlam()
	{
		super("Body Slam", PokemonGame.Normal, 0, 15, 85, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//May induce paralysis. 30% chance
		if(!Defender.hasCondition())
		{
			int chance = genrand(1, 100);
			if(chance <= 30)
			{
				Defender.setCondition(4);
			}
		}
	}
}
