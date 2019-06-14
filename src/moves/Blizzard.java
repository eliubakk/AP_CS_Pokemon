package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Blizzard extends Move
{
	public Blizzard()
	{
		super("Blizzard", PokemonGame.Ice, 1, 5, 120, 70, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//10% chance of freezing
		int chance = genrand(1,100);
		if(chance <= 10 && !Defender.hasCondition())
		{
			Defender.setCondition(6);
		}
	}
}
