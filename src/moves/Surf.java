package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Surf extends Move
{
	public Surf()
	{
		super("Surf", PokemonGame.Water, 1, 15, 95, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//No effect.
	}
}
