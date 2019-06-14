package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class SleepPowder extends Move
{
	public SleepPowder()
	{
		super("Sleep Powder", PokemonGame.Grass, 2, 15, 0, 75, 1, 0);
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
