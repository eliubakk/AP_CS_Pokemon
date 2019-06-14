package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Supersonic extends Move
{
	public Supersonic()
	{
		super("Supersonic", PokemonGame.Normal, 2, 20, 0, 55, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//confuses the target
	}
}
