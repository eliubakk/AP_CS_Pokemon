package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class ConfuseRay extends Move
{
	public ConfuseRay()
	{
		super("Confuse Ray", PokemonGame.Ghost, 2, 10, 0, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Confuses the target.
	}
}
