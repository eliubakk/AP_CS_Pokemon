package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Lick extends Move
{
	public Lick()
	{
		super("Lick", PokemonGame.Ghost, 0, 30, 30, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//30% chance to paralyze the target.
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
