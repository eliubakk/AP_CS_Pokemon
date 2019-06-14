package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Sludge extends Move
{
	public Sludge()
	{
		super("Sludge", PokemonGame.Poison, 1, 20, 65, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//30% chance to poison
		if(!Defender.hasCondition())
		{
			int chance = genrand(1, 100);
			if(chance <= 30)
			{
				Defender.setCondition(2);
			}
		}
	}
}
