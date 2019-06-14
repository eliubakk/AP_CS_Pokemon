package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class PoisonSting extends Move
{
	public PoisonSting()
	{
		super("Poison Sting", PokemonGame.Poison, 0, 35, 15, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)//30% chance to poison
	{
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
