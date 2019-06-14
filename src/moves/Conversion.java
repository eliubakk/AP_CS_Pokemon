package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Conversion extends Move
{
	public Conversion()
	{
		super("Conversion", PokemonGame.Normal, 2, 30, 0, 0, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Changes the users current type to its first moves type.
		
	}
}
