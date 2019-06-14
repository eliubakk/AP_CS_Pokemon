package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Peck extends Move
{
	public Peck()
	{
		super("Peck", PokemonGame.Flying, 0, 35, 35, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//No effect.
	}
}
