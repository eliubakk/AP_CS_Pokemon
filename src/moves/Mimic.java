package moves;

import pokemon.SeenPokemon;
import red.PokemonGame;

public class Mimic extends Move
{
	public Mimic()
	{
		super("Mimic", PokemonGame.Normal, 2, 10, 0, 100, 1, 0);
	}
	
	public void secondaryEffect(SeenPokemon Attacker, SeenPokemon Defender, int Damage)
	{
		//Copies the last move used by the target. move has 5PP, becomes mimic again when the user switches out, or the battle ends.
	}
}
