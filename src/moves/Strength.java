package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Strength extends Move
{
	public Strength()
	{
		super("Strength", PokemonGame.Normal, 0, 15, 80, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//No effect.
	}
}
