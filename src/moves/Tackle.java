package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Tackle extends Move
{
	public Tackle()
	{
		super("Tackle", PokemonGame.Normal, 0, 35, 50, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//no effect.
	}
}
