package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class HydroPump extends Move
{
	public HydroPump()
	{
		super("Hydro Pump", PokemonGame.Water, 1, 5, 120, 80, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//No effect.
	}
}
