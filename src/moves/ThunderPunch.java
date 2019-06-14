package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class ThunderPunch extends Move
{
	public ThunderPunch()
	{
		super("Thunder Punch", PokemonGame.Electric, 0, 15, 75, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)//May induce paralysis. 10% chance
	{
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
