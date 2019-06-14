package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Sing extends Move
{
	public Sing()
	{
		super("Sing", PokemonGame.Normal, 2, 15, 0, 55, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Puts the target to sleep
		if(!Defender.hasCondition())
		{
			Defender.setCondition(1);
		}
	}
}
