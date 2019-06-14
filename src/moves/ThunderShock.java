package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class ThunderShock extends Move
{
	public ThunderShock()
	{
		super("Thunder Shock", PokemonGame.Electric, 1, 30, 40, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//10% chance to paralyze the target
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
