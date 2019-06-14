package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Spore extends Move
{
	public Spore()
	{
		super("Spore", PokemonGame.Grass, 2, 15, 0, 100, 1, 0);
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
